package sistemaescolar;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Created by Pedro on 03/02/15.
 */
public class EventoAD {

    public boolean createEvent(String fecha, String remitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.createEvento();
            // Initialize the properties of the persistent object here
            sistemaEscolarEvento.setTitulo(titulo);
            sistemaEscolarEvento.setRemitente(remitente);
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setContenido(contenido);
            sistemaescolar.EventoDAO.save(sistemaEscolarEvento);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public Evento[] listEvents() throws PersistentException {
        System.out.println("Listing Evento...");
        sistemaescolar.Evento[] sistemaEscolarEventos = sistemaescolar.EventoDAO.listEventoByQuery(null, null);
        return sistemaEscolarEventos;
    }

    public boolean updateEvent(int idEvento, String fecha, String remitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.getEventoByORMID(idEvento);
            // Update the properties of the persistent object
            sistemaEscolarEvento.setFecha(fecha);
            sistemaEscolarEvento.setRemitente(remitente);
            sistemaEscolarEvento.setContenido(contenido);
            sistemaEscolarEvento.setTitulo(titulo);
            sistemaescolar.EventoDAO.save(sistemaEscolarEvento);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        }

    }

    public boolean deleteEvento(int idEvento) throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.getEventoByORMID(idEvento);
            sistemaescolar.EventoDAO.delete(sistemaEscolarEvento);
            t.commit();
            return true;

        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }
}
