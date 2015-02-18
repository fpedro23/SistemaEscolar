package sistemaescolar.dbmanagement;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import sistemaescolar.*;

/**
 * Created by Pedro on 03/02/15.
 */
public class DevicesDBManager {

    public static boolean createDevice(String UUID) throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();

        try {
            Devices device = DevicesDAO.createDevices();
            // Initialize the properties of the persistent object here
            device.setUDUID(UUID);
            ;
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
