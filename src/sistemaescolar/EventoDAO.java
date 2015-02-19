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

public class EventoDAO {
	public static Evento loadEventoByORMID(int idCircular) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return loadEventoByORMID(session, idCircular);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(int idCircular) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return getEventoByORMID(session, idCircular);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(int idCircular, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return loadEventoByORMID(session, idCircular, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(int idCircular, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return getEventoByORMID(session, idCircular, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(PersistentSession session, int idCircular) throws PersistentException {
		try {
			return (Evento) session.load(Evento.class, new Integer(idCircular));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(PersistentSession session, int idCircular) throws PersistentException {
		try {
			return (Evento) session.get(Evento.class, new Integer(idCircular));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByORMID(PersistentSession session, int idCircular, LockMode lockMode) throws PersistentException {
		try {
			return (Evento) session.load(Evento.class, new Integer(idCircular), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento getEventoByORMID(PersistentSession session, int idCircular, LockMode lockMode) throws PersistentException {
		try {
			return (Evento) session.get(Evento.class, new Integer(idCircular), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return queryEvento(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return queryEvento(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return listEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return listEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvento(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Evento as Evento");
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
	
	public static List queryEvento(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Evento as Evento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evento", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvento(session, condition, orderBy);
			return (Evento[]) list.toArray(new Evento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento[] listEventoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvento(session, condition, orderBy, lockMode);
			return (Evento[]) list.toArray(new Evento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return loadEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return loadEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Evento[] eventos = listEventoByQuery(session, condition, orderBy);
		if (eventos != null && eventos.length > 0)
			return eventos[0];
		else
			return null;
	}
	
	public static Evento loadEventoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Evento[] eventos = listEventoByQuery(session, condition, orderBy, lockMode);
		if (eventos != null && eventos.length > 0)
			return eventos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return iterateEventoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscuelaPersistentManager.instance().getSession();
			return iterateEventoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Evento as Evento");
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
	
	public static java.util.Iterator iterateEventoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From sistemaescolar.Evento as Evento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Evento", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento createEvento() {
		return new Evento();
	}
	
	public static boolean save(Evento evento) throws PersistentException {
		try {
			EscuelaPersistentManager.instance().saveObject(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Evento evento) throws PersistentException {
		try {
			EscuelaPersistentManager.instance().deleteObject(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Evento evento)throws PersistentException {
		try {
			if(evento.getAdministradoridAdministrador() != null) {
				evento.getAdministradoridAdministrador().evento.remove(evento);
			}
			
			return delete(evento);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Evento evento, PersistentSession session)throws PersistentException {
		try {
			if(evento.getAdministradoridAdministrador() != null) {
				evento.getAdministradoridAdministrador().evento.remove(evento);
			}
			
			try {
				session.delete(evento);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Evento evento) throws PersistentException {
		try {
			EscuelaPersistentManager.instance().getSession().refresh(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Evento evento) throws PersistentException {
		try {
			EscuelaPersistentManager.instance().getSession().evict(evento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Evento loadEventoByCriteria(EventoCriteria eventoCriteria) {
		Evento[] eventos = listEventoByCriteria(eventoCriteria);
		if(eventos == null || eventos.length == 0) {
			return null;
		}
		return eventos[0];
	}
	
	public static Evento[] listEventoByCriteria(EventoCriteria eventoCriteria) {
		return eventoCriteria.listEvento();
	}
}
