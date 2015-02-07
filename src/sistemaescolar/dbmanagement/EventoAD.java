package sistemaescolar.dbmanagement;

import sistemaescolar.model.EscuelaPersistentManager;
import sistemaescolar.model.Evento;
import sistemaescolar.model.EventoDAO;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Created by Pedro on 03/02/15.
 */
public class EventoAD {

    public static boolean createEvent(String fecha, String remitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Evento sistemaEscolarEvento = EventoDAO.createEvento();
            // Initialize the properties of the persistent object here
            sistemaEscolarEvento.setTitulo(titulo);
            sistemaEscolarEvento.setRemitente(remitente);
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setContenido(contenido);
            EventoDAO.save(sistemaEscolarEvento);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public static Evento[] listEvents() throws PersistentException {
        System.out.println("Listing Evento...");
        Evento[] sistemaEscolarEventos = EventoDAO.listEventoByQuery(null, null);
        return sistemaEscolarEventos;
    }

    public static Evento listEventById(int idEvento) throws PersistentException {
        System.out.println("Listing Evento...");
        Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
        return sistemaEscolarEvento;
    }

    public static boolean updateEvent(int idEvento, String fecha, String remitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Evento sistemaEscolarEvento = EventoDAO.getEventoByORMID(idEvento);
            // Update the properties of the persistent object
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setRemitente(remitente);
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
