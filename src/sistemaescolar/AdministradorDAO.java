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

public class AdministradorDAO {
    public static Administrador loadAdministradorByORMID(int idAdministrador) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAdministradorByORMID(session, idAdministrador);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador getAdministradorByORMID(int idAdministrador) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getAdministradorByORMID(session, idAdministrador);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByORMID(int idAdministrador, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAdministradorByORMID(session, idAdministrador, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador getAdministradorByORMID(int idAdministrador, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getAdministradorByORMID(session, idAdministrador, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByORMID(PersistentSession session, int idAdministrador) throws PersistentException {
        try {
            return (Administrador) session.load(Administrador.class, new Integer(idAdministrador));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador getAdministradorByORMID(PersistentSession session, int idAdministrador) throws PersistentException {
        try {
            return (Administrador) session.get(Administrador.class, new Integer(idAdministrador));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByORMID(PersistentSession session, int idAdministrador, LockMode lockMode) throws PersistentException {
        try {
            return (Administrador) session.load(Administrador.class, new Integer(idAdministrador), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador getAdministradorByORMID(PersistentSession session, int idAdministrador, LockMode lockMode) throws PersistentException {
        try {
            return (Administrador) session.get(Administrador.class, new Integer(idAdministrador), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryAdministrador(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryAdministrador(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryAdministrador(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listAdministradorByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador[] listAdministradorByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listAdministradorByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Administrador as Administrador");
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

    public static List queryAdministrador(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Administrador as Administrador");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Administrador", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryAdministrador(session, condition, orderBy);
            return (Administrador[]) list.toArray(new Administrador[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            List list = queryAdministrador(session, condition, orderBy, lockMode);
            return (Administrador[]) list.toArray(new Administrador[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAdministradorByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAdministradorByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
        if (administradors != null && administradors.length > 0)
            return administradors[0];
        else
            return null;
    }

    public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
        if (administradors != null && administradors.length > 0)
            return administradors[0];
        else
            return null;
    }

    public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateAdministradorByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Administrador as Administrador");
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

    public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Administrador as Administrador");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Administrador", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador createAdministrador() {
        return new Administrador();
    }

    public static boolean save(Administrador administrador) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().saveObject(administrador);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(Administrador administrador) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().deleteObject(administrador);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(Administrador administrador) throws PersistentException {
        try {
            Circular[] lCirculars = administrador.circular.toArray();
            for (int i = 0; i < lCirculars.length; i++) {
                lCirculars[i].setAdministradoridAdministrador(null);
            }
            Aviso[] lAvisos = administrador.aviso.toArray();
            for (int i = 0; i < lAvisos.length; i++) {
                lAvisos[i].setAdministradoridAdministrador(null);
            }
            Evento[] lEventos = administrador.evento.toArray();
            for (int i = 0; i < lEventos.length; i++) {
                lEventos[i].setAdministradoridAdministrador(null);
            }
            return delete(administrador);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean deleteAndDissociate(Administrador administrador, PersistentSession session) throws PersistentException {
        try {
            Circular[] lCirculars = administrador.circular.toArray();
            for (int i = 0; i < lCirculars.length; i++) {
                lCirculars[i].setAdministradoridAdministrador(null);
            }
            Aviso[] lAvisos = administrador.aviso.toArray();
            for (int i = 0; i < lAvisos.length; i++) {
                lAvisos[i].setAdministradoridAdministrador(null);
            }
            Evento[] lEventos = administrador.evento.toArray();
            for (int i = 0; i < lEventos.length; i++) {
                lEventos[i].setAdministradoridAdministrador(null);
            }
            try {
                session.delete(administrador);
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(Administrador administrador) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().refresh(administrador);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(Administrador administrador) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().evict(administrador);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Administrador loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
        Administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
        if (administradors == null || administradors.length == 0) {
            return null;
        }
        return administradors[0];
    }

    public static Administrador[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
        return administradorCriteria.listAdministrador();
    }
}
