/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package sistemaescolar;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;

import java.util.List;

public class DevicesDAO {
    public static Devices loadDevicesByORMID(int idDevice) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadDevicesByORMID(session, idDevice);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices getDevicesByORMID(int idDevice) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getDevicesByORMID(session, idDevice);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByORMID(int idDevice, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadDevicesByORMID(session, idDevice, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices getDevicesByORMID(int idDevice, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getDevicesByORMID(session, idDevice, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByORMID(PersistentSession session, int idDevice) throws PersistentException {
        try {
            return (Devices) session.load(Devices.class, new Integer(idDevice));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices getDevicesByORMID(PersistentSession session, int idDevice) throws PersistentException {
        try {
            return (Devices) session.get(Devices.class, new Integer(idDevice));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByORMID(PersistentSession session, int idDevice, LockMode lockMode) throws PersistentException {
        try {
            return (Devices) session.load(Devices.class, new Integer(idDevice), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices getDevicesByORMID(PersistentSession session, int idDevice, LockMode lockMode) throws PersistentException {
        try {
            return (Devices) session.get(Devices.class, new Integer(idDevice), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryDevices(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryDevices(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryDevices(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryDevices(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices[] listDevicesByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listDevicesByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices[] listDevicesByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listDevicesByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryDevices(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Devices as Devices");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryDevices(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Devices as Devices");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Devices", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices[] listDevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryDevices(session, condition, orderBy);
            return (Devices[]) list.toArray(new Devices[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices[] listDevicesByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            List list = queryDevices(session, condition, orderBy, lockMode);
            return (Devices[]) list.toArray(new Devices[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadDevicesByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadDevicesByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Devices[] deviceses = listDevicesByQuery(session, condition, orderBy);
        if (deviceses != null && deviceses.length > 0)
            return deviceses[0];
        else
            return null;
    }

    public static Devices loadDevicesByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        Devices[] deviceses = listDevicesByQuery(session, condition, orderBy, lockMode);
        if (deviceses != null && deviceses.length > 0)
            return deviceses[0];
        else
            return null;
    }

    public static java.util.Iterator iterateDevicesByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateDevicesByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateDevicesByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateDevicesByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateDevicesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Devices as Devices");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateDevicesByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Devices as Devices");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Devices", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices createDevices() {
        return new Devices();
    }

    public static boolean save(Devices devices) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().saveObject(devices);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(Devices devices) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().deleteObject(devices);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(Devices devices) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().refresh(devices);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(Devices devices) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().evict(devices);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Devices loadDevicesByCriteria(DevicesCriteria devicesCriteria) {
        Devices[] deviceses = listDevicesByCriteria(devicesCriteria);
        if (deviceses == null || deviceses.length == 0) {
            return null;
        }
        return deviceses[0];
    }

    public static Devices[] listDevicesByCriteria(DevicesCriteria devicesCriteria) {
        return devicesCriteria.listDevices();
    }
}
