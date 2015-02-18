package sistemaescolar.dbmanagement;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.AdministradorDAO;
import sistemaescolar.Aviso;
import sistemaescolar.AvisoDAO;
import sistemaescolar.EscuelaPersistentManager;

/**
 * Created by Pedro on 03/02/15.
 */
public class AvisoAD {

    public static boolean createAviso(String fecha, Integer idRemitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Aviso sistemaEscolarAviso = AvisoDAO.createAviso();
            // Initialize the properties of the persistent object here
            sistemaEscolarAviso.setTitulo(titulo);
            sistemaEscolarAviso.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
            sistemaEscolarAviso.setFecha(fecha);
            sistemaEscolarAviso.setContenido(contenido);
            AvisoDAO.save(sistemaEscolarAviso);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public static Aviso[] listAvisos() throws PersistentException {
        System.out.println("Listing Avisos...");
        Aviso[] sistemaEscolarAviso = AvisoDAO.listAvisoByQuery(null, "fecha DESC");
        return sistemaEscolarAviso;
    }

    public static Aviso listAvisosById(int idAviso) throws PersistentException {
        Aviso sistemaEscolarAviso = AvisoDAO.getAvisoByORMID(idAviso);
        return sistemaEscolarAviso;
    }

    public static boolean updateAviso(int idAviso, String fecha, Integer idRemitente, String contenido, String titulo) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Aviso sistemaEscolarAviso = AvisoDAO.getAvisoByORMID(idAviso);
            // Update the properties of the persistent object
            sistemaEscolarAviso.setFecha(fecha);
            sistemaEscolarAviso.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
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

    public static boolean deleteAviso(int idAviso) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Aviso sistemaEscolarAviso = AvisoDAO.getAvisoByORMID(idAviso);
            AvisoDAO.delete(sistemaEscolarAviso);
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
