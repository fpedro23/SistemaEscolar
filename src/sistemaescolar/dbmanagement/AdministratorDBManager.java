package sistemaescolar.dbmanagement;

import org.apache.struts2.interceptor.SessionAware;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.*;

import java.util.Map;

/**
 * Created by Pedro on 03/02/15.
 */
public class AdministratorDBManager{


    public static Administrador doLogin(String nombreAdministrador, String password) throws PersistentException {

        System.out.println("Listing Usuario...");
        AdministradorCriteria administradorCriteria = new AdministradorCriteria();
        administradorCriteria.nombreAdministrador.eq(nombreAdministrador);
        administradorCriteria.password.eq(password);

        Administrador[] administradors = AdministradorDAO.listAdministradorByCriteria(administradorCriteria);

        if (administradors.length == 1) {
            return administradors[0];
        } else {
            return null;

        }

    }


    public static boolean createAdministrator(String nombre, String password) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Administrador administrador = AdministradorDAO.createAdministrador();
            // Initialize the properties of the persistent object here
            administrador.setNombreAdministrador(nombre);
            administrador.setPassword(password);
            AdministradorDAO.save(administrador);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }
    }

    public static Administrador[] listAdministrators() throws PersistentException {
        System.out.println("Listing Administrators...");
        Administrador[] administradors = AdministradorDAO.listAdministradorByQuery(null, null);
        return administradors;
    }

    public static Administrador listAdministradorById(int idAdministrador) throws PersistentException {
        Administrador administrador = AdministradorDAO.getAdministradorByORMID(idAdministrador);
        return administrador;
    }

    public static boolean updateAdministrador(Integer idAdministrador, String nombre, String password) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Administrador administrador = AdministradorDAO.getAdministradorByORMID(idAdministrador);
            // Update the properties of the persistent object
            administrador.setNombreAdministrador(nombre);
            administrador.setPassword(password);
            AdministradorDAO.save(administrador);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            return false;
        }

    }

    public static boolean deleteAdministrador(int idAdministrador) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Administrador administrador = AdministradorDAO.getAdministradorByORMID(idAdministrador);
            AdministradorDAO.delete(administrador);
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
