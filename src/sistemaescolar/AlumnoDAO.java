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

public class AlumnoDAO {
    public static Alumno loadAlumnoByORMID(int idAlumno) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAlumnoByORMID(session, idAlumno);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno getAlumnoByORMID(int idAlumno) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getAlumnoByORMID(session, idAlumno);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByORMID(int idAlumno, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAlumnoByORMID(session, idAlumno, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno getAlumnoByORMID(int idAlumno, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return getAlumnoByORMID(session, idAlumno, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByORMID(PersistentSession session, int idAlumno) throws PersistentException {
        try {
            return (Alumno) session.load(Alumno.class, new Integer(idAlumno));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno getAlumnoByORMID(PersistentSession session, int idAlumno) throws PersistentException {
        try {
            return (Alumno) session.get(Alumno.class, new Integer(idAlumno));
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByORMID(PersistentSession session, int idAlumno, LockMode lockMode) throws PersistentException {
        try {
            return (Alumno) session.load(Alumno.class, new Integer(idAlumno), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno getAlumnoByORMID(PersistentSession session, int idAlumno, LockMode lockMode) throws PersistentException {
        try {
            return (Alumno) session.get(Alumno.class, new Integer(idAlumno), lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryAlumno(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryAlumno(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryAlumno(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return queryAlumno(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno[] listAlumnoByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listAlumnoByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno[] listAlumnoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return listAlumnoByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static List queryAlumno(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Alumno as Alumno");
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

    public static List queryAlumno(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Alumno as Alumno");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Alumno", lockMode);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno[] listAlumnoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        try {
            List list = queryAlumno(session, condition, orderBy);
            return (Alumno[]) list.toArray(new Alumno[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno[] listAlumnoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            List list = queryAlumno(session, condition, orderBy, lockMode);
            return (Alumno[]) list.toArray(new Alumno[list.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAlumnoByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return loadAlumnoByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        Alumno[] alumnos = listAlumnoByQuery(session, condition, orderBy);
        if (alumnos != null && alumnos.length > 0)
            return alumnos[0];
        else
            return null;
    }

    public static Alumno loadAlumnoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        Alumno[] alumnos = listAlumnoByQuery(session, condition, orderBy, lockMode);
        if (alumnos != null && alumnos.length > 0)
            return alumnos[0];
        else
            return null;
    }

    public static java.util.Iterator iterateAlumnoByQuery(String condition, String orderBy) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateAlumnoByQuery(session, condition, orderBy);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateAlumnoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
        try {
            PersistentSession session = EscuelaPersistentManager.instance().getSession();
            return iterateAlumnoByQuery(session, condition, orderBy, lockMode);
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static java.util.Iterator iterateAlumnoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Alumno as Alumno");
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

    public static java.util.Iterator iterateAlumnoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
        StringBuffer sb = new StringBuffer("From sistemaescolar.Alumno as Alumno");
        if (condition != null)
            sb.append(" Where ").append(condition);
        if (orderBy != null)
            sb.append(" Order By ").append(orderBy);
        try {
            Query query = session.createQuery(sb.toString());
            query.setLockMode("Alumno", lockMode);
            return query.iterate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno createAlumno() {
        return new Alumno();
    }

    public static boolean save(Alumno alumno) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().saveObject(alumno);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean delete(Alumno alumno) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().deleteObject(alumno);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean refresh(Alumno alumno) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().refresh(alumno);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static boolean evict(Alumno alumno) throws PersistentException {
        try {
            EscuelaPersistentManager.instance().getSession().evict(alumno);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }

    public static Alumno loadAlumnoByCriteria(AlumnoCriteria alumnoCriteria) {
        Alumno[] alumnos = listAlumnoByCriteria(alumnoCriteria);
        if (alumnos == null || alumnos.length == 0) {
            return null;
        }
        return alumnos[0];
    }

    public static Alumno[] listAlumnoByCriteria(AlumnoCriteria alumnoCriteria) {
        return alumnoCriteria.listAlumno();
    }
}
