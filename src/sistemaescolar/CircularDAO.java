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

public class CircularDAO {
    public static Circular loadCircularByORMID(int idCircular) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadCircularByORMID(session, idCircular);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular getCircularByORMID(int idCircular) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getCircularByORMID(session, idCircular);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByORMID(int idCircular, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadCircularByORMID(session, idCircular, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular getCircularByORMID(int idCircular, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getCircularByORMID(session, idCircular, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByORMID(PersistentSession session, int idCircular) throws PersistentException {
        try {
            return (Circular) session.load(Circular.class, new Integer(idCircular));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular getCircularByORMID(PersistentSession session, int idCircular) throws PersistentException {
        try {
            return (Circular) session.get(Circular.class, new Integer(idCircular));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByORMID(PersistentSession session, int idCircular, LockMode lockMode) throws PersistentException {
        try {
            return (Circular) session.load(Circular.class, new Integer(idCircular), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular getCircularByORMID(PersistentSession session, int idCircular, LockMode lockMode) throws PersistentException {
        try {
            return (Circular) session.get(Circular.class, new Integer(idCircular), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryCircular(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryCircular(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryCircular(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryCircular(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular[] listCircularByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listCircularByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular[] listCircularByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listCircularByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryCircular(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Circular as Circular");
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

    public static List queryCircular(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Circular as Circular");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Circular", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular[] listCircularByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryCircular(session, condition, orderBy);
            return (Circular[]) list.toArray(new Circular[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular[] listCircularByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            List list = queryCircular(session, condition, orderBy, lockMode);
            return (Circular[]) list.toArray(new Circular[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadCircularByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadCircularByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Circular[] circulars = listCircularByQuery(session, condition, orderBy);
        if (circulars != null && circulars.length > 0)
            return circulars[0];
        else
            return null;
    }

    public static Circular loadCircularByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        Circular[] circulars = listCircularByQuery(session, condition, orderBy, lockMode);
        if (circulars != null && circulars.length > 0)
            return circulars[0];
        else
            return null;
    }

    public static java.util.Iterator iterateCircularByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateCircularByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateCircularByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateCircularByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateCircularByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Circular as Circular");
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

    public static java.util.Iterator iterateCircularByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Circular as Circular");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Circular", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular createCircular() {
        return new Circular();
    }

    public static boolean save(Circular circular) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().saveObject(circular);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(Circular circular) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().deleteObject(circular);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(Circular circular) throws PersistentException {
        try {
            if (circular.getAdministradoridAdministrador() != null) {
                circular.getAdministradoridAdministrador().circular.remove(circular);
            }

            return delete(circular);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(Circular circular, PersistentSession session) throws PersistentException {
        try {
            if (circular.getAdministradoridAdministrador() != null) {
                circular.getAdministradoridAdministrador().circular.remove(circular);
            }

            try {
                session.delete(circular);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(Circular circular) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().refresh(circular);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(Circular circular) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().evict(circular);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Circular loadCircularByCriteria(CircularCriteria circularCriteria) {
        Circular[] circulars = listCircularByCriteria(circularCriteria);
        if (circulars == null || circulars.length == 0) {
            return null;
        }
        return circulars[0];
    }

    public static Circular[] listCircularByCriteria(CircularCriteria circularCriteria) {
        return circularCriteria.listCircular();
    }
}
