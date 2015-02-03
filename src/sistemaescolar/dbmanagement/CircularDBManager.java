package sistemaescolar.dbmanagement;

import org.orm.PersistentTransaction;
import sistemaescolar.Circular;
import sistemaescolar.CircularDAO;
import sistemaescolar.EscuelaPersistentManager;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 2:50 PM
 */
public class CircularDBManager {
    public static boolean create(String titulo, String fecha, String remitente, String contenido) {
        boolean success = false;

        if(titulo != null && fecha != null && remitente != null && contenido != null)
            try {
                PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
                Circular circular = CircularDAO.createCircular();

                circular.setTitulo(titulo);
                circular.setFecha(fecha);
                circular.setRemitente(remitente);
                circular.setContenido(contenido);

                if(CircularDAO.save(circular)) {
                    success = true;
                    transaction.commit();
                }
            }
            catch (Exception e) { // Not a very good practice but it'll do for now
                e.printStackTrace();
            }

        return success;
    }

    public static boolean update(int id, String titulo, String fecha, String remitente, String contenido) {
        boolean success = false;

        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
            Circular circular = CircularDAO.getCircularByORMID(id);
            if(circular != null) {
                if(titulo != null)
                    circular.setTitulo(titulo);
                if(fecha != null)
                    circular.setFecha(fecha);
                if(remitente != null)
                    circular.setRemitente(remitente);
                if(contenido != null)
                    circular.setContenido(contenido);
                transaction.commit();
            }
        }
        catch (Exception e) { // Not a very good practice but it'll do for now
            e.printStackTrace();
        }

        return success;
    }

    public static boolean delete(int id) {
        boolean success = false;

        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
            Circular circular = CircularDAO.getCircularByORMID(id);

            if(circular != null && CircularDAO.delete(circular)) {
                transaction.commit();
                success = true;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    public static Circular getById(int id) {
        Circular circular = null;

        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();

            circular = CircularDAO.getCircularByORMID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return circular;
    }


    public static Circular[] getAll() {
        Circular[] circulars = null;
        try {
            PersistentTransaction transaction = EscuelaPersistentManager.instance().getSession().beginTransaction();
            circulars = CircularDAO.listCircularByQuery(null, null);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return circulars;
    }
}
