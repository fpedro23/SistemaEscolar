package ormsamples;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.Circular;
import sistemaescolar.CircularDAO;
import sistemaescolar.EscuelaPersistentManager;
import sistemaescolar.dbmanagement.CircularDBManager;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 10:18 AM
 */
public class TestEndpointOperations {

    public void update(int id) throws PersistentException {
        CircularDBManager.update(id,
                null,
                null,
                null,
                "Contenido actualizado");
    }

    public void delete(int id) throws PersistentException {
        CircularDBManager.delete(id);
    }

    public static void main(String[] args) {
        try {
            TestEndpointOperations test = new TestEndpointOperations();
            try {
                test.update(3);
                test.delete(3);
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
