package sistemaescolar.dbmanagement;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.AdministradorDAO;
import sistemaescolar.EscuelaPersistentManager;
import sistemaescolar.Evento;
import sistemaescolar.EventoDAO;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Formatter;

/**
 * Created by Pedro on 03/02/15.
 */
public class EventoAD {


    public static boolean createEvent(String fecha, Integer idRemitente, String contenido, String titulo, String horaInicio, String horaFinal) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Evento sistemaEscolarEvento = EventoDAO.createEvento();
            // Initialize the properties of the persistent object here
            sistemaEscolarEvento.setTitulo(titulo);
            sistemaEscolarEvento.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setContenido(contenido);


            try{
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

                long ms = sdf.parse(horaInicio).getTime();
                Time timeInicio = new Time(ms);

                sistemaEscolarEvento.setHoraInicio(timeInicio);

                ms = sdf.parse(horaFinal).getTime();
                Time timeFinal = new Time(ms);
                sistemaEscolarEvento.setHoraFinal(timeFinal);

            }
            catch (Exception e){
                sistemaEscolarEvento.setHoraInicio(null);
                sistemaEscolarEvento.setHoraFinal(null);
                e.printStackTrace();
            }

            EventoDAO.save(sistemaEscolarEvento);
            t.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
            return false;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public static Evento[] listEvents() throws PersistentException {
        System.out.println("Listing Evento...");
        Evento[] sistemaEscolarEventos = EventoDAO.listEventoByQuery(null, "fecha DESC");
        return sistemaEscolarEventos;
    }

    public static Evento listEventById(int idEvento) throws PersistentException {
        System.out.println("Listing Evento...");
        Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
        return sistemaEscolarEvento;
    }

    public static boolean updateEvent(int idEvento, String fecha, Integer idRemitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
            // Update the properties of the persistent object
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
            sistemaEscolarEvento.setContenido(contenido);
            sistemaEscolarEvento.setTitulo(titulo);
            EventoDAO.save(sistemaEscolarEvento);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        }

    }

    public static boolean deleteEvento(int idEvento) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
            EventoDAO.delete(sistemaEscolarEvento);
            t.commit();
            return true;

        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }
}
