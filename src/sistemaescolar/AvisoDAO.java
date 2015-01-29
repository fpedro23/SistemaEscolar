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

public class AvisoDAO {
	public static Aviso loadAvisoByORMID(int idCircular) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return loadAvisoByORMID(session, idCircular);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso getAvisoByORMID(int idCircular) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return getAvisoByORMID(session, idCircular);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByORMID(int idCircular, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return loadAvisoByORMID(session, idCircular, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso getAvisoByORMID(int idCircular, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return getAvisoByORMID(session, idCircular, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByORMID(PersistentSession session, int idCircular) throws PersistentException {
		try {
			return (Aviso) session.load(Aviso.class, new Integer(idCircular));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso getAvisoByORMID(PersistentSession session, int idCircular) throws PersistentException {
		try {
			return (Aviso) session.get(Aviso.class, new Integer(idCircular));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByORMID(PersistentSession session, int idCircular, LockMode lockMode) throws PersistentException {
		try {
			return (Aviso) session.load(Aviso.class, new Integer(idCircular), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso getAvisoByORMID(PersistentSession session, int idCircular, LockMode lockMode) throws PersistentException {
		try {
			return (Aviso) session.get(Aviso.class, new Integer(idCircular), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAviso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return queryAviso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAviso(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return queryAviso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso[] listAvisoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return listAvisoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso[] listAvisoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return listAvisoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAviso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Aviso as Aviso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAviso(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Aviso as Aviso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Aviso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso[] listAvisoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAviso(session, condition, orderBy);
			return (Aviso[]) list.toArray(new Aviso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso[] listAvisoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryAviso(session, condition, orderBy, lockMode);
			return (Aviso[]) list.toArray(new Aviso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return loadAvisoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return loadAvisoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Aviso[] avisos = listAvisoByQuery(session, condition, orderBy);
		if (avisos != null && avisos.length > 0)
			return avisos[0];
		else
			return null;
	}
	
	public static Aviso loadAvisoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Aviso[] avisos = listAvisoByQuery(session, condition, orderBy, lockMode);
		if (avisos != null && avisos.length > 0)
			return avisos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAvisoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return iterateAvisoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAvisoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = sistemaescolar.EscuelaPersistentManager.instance().getSession();
			return iterateAvisoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAvisoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Aviso as Aviso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAvisoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Aviso as Aviso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Aviso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso createAviso() {
		return new Aviso();
	}
	
	public static boolean save(Aviso aviso) throws PersistentException {
		try {
			sistemaescolar.EscuelaPersistentManager.instance().saveObject(aviso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Aviso aviso) throws PersistentException {
		try {
			sistemaescolar.EscuelaPersistentManager.instance().deleteObject(aviso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Aviso aviso) throws PersistentException {
		try {
			sistemaescolar.EscuelaPersistentManager.instance().getSession().refresh(aviso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Aviso aviso) throws PersistentException {
		try {
			sistemaescolar.EscuelaPersistentManager.instance().getSession().evict(aviso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Aviso loadAvisoByCriteria(AvisoCriteria avisoCriteria) {
		Aviso[] avisos = listAvisoByCriteria(avisoCriteria);
		if(avisos == null || avisos.length == 0) {
			return null;
		}
		return avisos[0];
	}
	
	public static Aviso[] listAvisoByCriteria(AvisoCriteria avisoCriteria) {
		return avisoCriteria.listAviso();
	}
}
