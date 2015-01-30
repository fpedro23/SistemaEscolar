package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.Circular;
import sistemaescolar.CircularDAO;
import sistemaescolar.EscuelaPersistentManager;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 10:18 AM
 */
public class TestEndpointOperations {

    public void update(int id) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
        Circular circular = CircularDAO.getCircularByORMID(id);
        circular.setContenido("Nuevo contenido");
        t.commit();
    }

    public void delete(int id) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
        Circular circular = CircularDAO.getCircularByORMID(id);
        CircularDAO.delete(circular);
        t.commit();
    }

    public static void main(String[] args) {
        try {
            TestEndpointOperations test = new TestEndpointOperations();
            try {
                test.update(3);
            }
            finally {
                EscuelaPersistentManager.instance().disposePersistentManager();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
