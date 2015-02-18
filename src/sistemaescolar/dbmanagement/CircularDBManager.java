package sistemaescolar.dbmanagement;

import org.hibernate.Hibernate;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.AdministradorDAO;
import sistemaescolar.Circular;
import sistemaescolar.CircularDAO;
import sistemaescolar.EscuelaPersistentManager;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 2:50 PM
 */
public class CircularDBManager {
    public static boolean create(String titulo, String fecha, Integer idRemitente, String contenido) throws PersistentException {
        boolean success = false;

        if (titulo != null && fecha != null && idRemitente != null && contenido != null)
            try {
                PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
                Circular circular = CircularDAO.createCircular();

                circular.setTitulo(titulo);
                circular.setFecha(fecha);
                circular.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
                circular.setContenido(contenido);

                if (CircularDAO.save(circular)) {
                    success = true;
                    transaction.commit();
                }
            } catch (Exception e) { // Not a very good practice but it'll do for now
                e.printStackTrace();
            } finally {
                EscuelaPersistentManager.instance().disposePersistentManager();
            }

        return success;
    }

    public static boolean update(int id, String titulo, String fecha, Integer idRemitente, String contenido) throws PersistentException {
        boolean success = false;

        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
            Circular circular = CircularDAO.getCircularByORMID(id);
            if (circular != null) {
                if (titulo != null)
                    circular.setTitulo(titulo);
                if (fecha != null)
                    circular.setFecha(fecha);
                if (idRemitente != null)
                    circular.setAdministradoridAdministrador(AdministradorDAO.getAdministradorByORMID(idRemitente));
                if (contenido != null)
                    circular.setContenido(contenido);
                transaction.commit();
                success = true;
            }
        } catch (Exception e) { // Not a very good practice but it'll do for now
            e.printStackTrace();
            success = false;
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }

        return success;
    }

    public static boolean delete(int id) throws PersistentException {
        boolean success = false;

        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
            Circular circular = CircularDAO.getCircularByORMID(id);

            if (circular != null && CircularDAO.delete(circular)) {
                transaction.commit();
                success = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }

        return success;
    }

    public static Circular getById(int id) throws PersistentException {
        Circular circular = null;

        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();

            circular = CircularDAO.getCircularByORMID(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }

        return circular;
    }


    public static Circular[] getAll() throws PersistentException {
        Circular[] circulars = null;
        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
            circulars = CircularDAO.listCircularByQuery(null, "fecha DESC");
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            EscuelaPersistentManager.instance().disposePersistentManager();
        }

        return circulars;
    }
}
