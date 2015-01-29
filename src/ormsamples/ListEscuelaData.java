/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListEscuelaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Circular...");
		sistemaescolar.Circular[] sistemaEscolarCirculars = sistemaescolar.CircularDAO.listCircularByQuery(null, null);
		int length = Math.min(sistemaEscolarCirculars.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(sistemaEscolarCirculars[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Aviso...");
		sistemaescolar.Aviso[] sistemaEscolarAvisos = sistemaescolar.AvisoDAO.listAvisoByQuery(null, null);
		length = Math.min(sistemaEscolarAvisos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(sistemaEscolarAvisos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		sistemaescolar.Evento[] sistemaEscolarEventos = sistemaescolar.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(sistemaEscolarEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(sistemaEscolarEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Circular by Criteria...");
		sistemaescolar.CircularCriteria sistemaEscolarCircularCriteria = new sistemaescolar.CircularCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sistemaEscolarCircularCriteria.idCircular.eq();
		sistemaEscolarCircularCriteria.setMaxResults(ROW_COUNT);
		sistemaescolar.Circular[] sistemaEscolarCirculars = sistemaEscolarCircularCriteria.listCircular();
		int length =sistemaEscolarCirculars== null ? 0 : Math.min(sistemaEscolarCirculars.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(sistemaEscolarCirculars[i]);
		}
		System.out.println(length + " Circular record(s) retrieved."); 
		
		System.out.println("Listing Aviso by Criteria...");
		sistemaescolar.AvisoCriteria sistemaEscolarAvisoCriteria = new sistemaescolar.AvisoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sistemaEscolarAvisoCriteria.idCircular.eq();
		sistemaEscolarAvisoCriteria.setMaxResults(ROW_COUNT);
		sistemaescolar.Aviso[] sistemaEscolarAvisos = sistemaEscolarAvisoCriteria.listAviso();
		length =sistemaEscolarAvisos== null ? 0 : Math.min(sistemaEscolarAvisos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(sistemaEscolarAvisos[i]);
		}
		System.out.println(length + " Aviso record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		sistemaescolar.EventoCriteria sistemaEscolarEventoCriteria = new sistemaescolar.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//sistemaEscolarEventoCriteria.idCircular.eq();
		sistemaEscolarEventoCriteria.setMaxResults(ROW_COUNT);
		sistemaescolar.Evento[] sistemaEscolarEventos = sistemaEscolarEventoCriteria.listEvento();
		length =sistemaEscolarEventos== null ? 0 : Math.min(sistemaEscolarEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(sistemaEscolarEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEscuelaData listEscuelaData = new ListEscuelaData();
			try {
				listEscuelaData.listTestData();
				//listEscuelaData.listByCriteria();
			}
			finally {
				sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
