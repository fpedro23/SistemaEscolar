/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateEscuelaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();
		try {
			sistemaescolar.Circular sistemaEscolarCircular = sistemaescolar.CircularDAO.createCircular();
            sistemaEscolarCircular.setContenido("Contenido de la circular");
			// Initialize the properties of the persistent object here
			sistemaescolar.CircularDAO.save(sistemaEscolarCircular);
			sistemaescolar.Aviso sistemaEscolarAviso = sistemaescolar.AvisoDAO.createAviso();
			// Initialize the properties of the persistent object here
			sistemaescolar.AvisoDAO.save(sistemaEscolarAviso);
			sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.createEvento();
			// Initialize the properties of the persistent object here
			sistemaescolar.EventoDAO.save(sistemaEscolarEvento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEscuelaData createEscuelaData = new CreateEscuelaData();
			try {
				createEscuelaData.createTestData();
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
