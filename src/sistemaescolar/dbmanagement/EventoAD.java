package sistemaescolar.dbmanagement;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.AdministradorDAO;
import sistemaescolar.EscuelaPersistentManager;
import sistemaescolar.Evento;
import sistemaescolar.EventoDAO;

import java.sql.Time;
import java.text.SimpleDateFormat;

/**
 * Created by Pedro on 03/02/15.
 */
public class EventoAD {


    public static Evento createEvent(String fecha, Integer idRemitente, String contenido, String titulo, String horaInicio, String horaFinal) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        long ms;

        try {
            Evento sistemaEscolarEvento = EventoDAO.createEvento();
            // Initialize the properties of the persistent object here
            sistemaEscolarEvento.setTitulo(titulo);
            sistemaEscolarEvento.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setContenido(contenido);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");


            try {

                ms = sdf.parse(horaInicio).getTime();
                Time timeInicio = new Time(ms);
                sistemaEscolarEvento.setHoraInicio(timeInicio);
            } catch (Exception e) {
                sistemaEscolarEvento.setHoraInicio(null);
                e.printStackTrace();
            }

            try{

                ms = sdf.parse(horaFinal).getTime();
                Time timeFinal = new Time(ms);
                sistemaEscolarEvento.setHoraFinal(timeFinal);

            }
            catch (Exception e){
                sistemaEscolarEvento.setHoraFinal(null);
                e.printStackTrace();
            }

            EventoDAO.save(sistemaEscolarEvento);
            t.commit();
            return sistemaEscolarEvento;
        } catch (Exception e) {
            e.printStackTrace();
            t.rollback();
            return null;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public static Evento[] listEvents() throws PersistentException {
        System.out.println("Listing Evento...");
        Evento[] sistemaEscolarEventos = EventoDAO.listEventoByQuery(null, "fecha ASC, horaInicio ASC");

        return sistemaEscolarEventos;
    }

    public static Evento listEventById(int idEvento) throws PersistentException {
        System.out.println("Listing Evento...");
        Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
        return sistemaEscolarEvento;
    }

    public static Evento updateEvent(int idEvento, String fecha, Integer idRemitente, String contenido, String titulo, String horaInicio, String horaFinal) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
            // Update the properties of the persistent object
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
            sistemaEscolarEvento.setContenido(contenido);
            sistemaEscolarEvento.setTitulo(titulo);

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
            return sistemaEscolarEvento;
        } catch (Exception e) {
            t.rollback();
            return null;
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
