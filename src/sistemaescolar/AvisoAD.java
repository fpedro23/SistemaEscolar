package sistemaescolar;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 * Created by Pedro on 03/02/15.
 */
public class AvisoAD {

    public boolean createAviso(String fecha, String remitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Aviso sistemaEscolarAviso = AvisoDAO.createAviso();
            // Initialize the properties of the persistent object here
            sistemaEscolarAviso.setTitulo(titulo);
            sistemaEscolarAviso.setRemitente(remitente);
            sistemaEscolarAviso.setFecha(fecha);
            sistemaEscolarAviso.setContenido(contenido);
            AvisoDAO.save(sistemaEscolarAviso);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public Aviso[] listAvisos() throws PersistentException {
        System.out.println("Listing Avisos...");
        Aviso[] sistemaEscolarAviso = AvisoDAO.listAvisoByQuery(null, null);
        return sistemaEscolarAviso;
    }

    public boolean updateAviso(int idAviso, String fecha, String remitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Aviso sistemaEscolarAviso = AvisoDAO.getAvisoByORMID(idAviso);
            // Update the properties of the persistent object
            sistemaEscolarAviso.setFecha(fecha);
            sistemaEscolarAviso.setRemitente(remitente);
            sistemaEscolarAviso.setContenido(contenido);
            sistemaEscolarAviso.setTitulo(titulo);
            AvisoDAO.save(sistemaEscolarAviso);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        }

    }

    public boolean deleteAviso(int idAviso) throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Aviso sistemaEscolarAviso = AvisoDAO.getAvisoByORMID(idAviso);
            AvisoDAO.delete(sistemaEscolarAviso);
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
