/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteEscuelaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();
		try {
			sistemaescolar.Circular sistemaEscolarCircular = sistemaescolar.CircularDAO.loadCircularByQuery(null, null);
			// Delete the persistent object
			sistemaescolar.CircularDAO.delete(sistemaEscolarCircular);
			sistemaescolar.Aviso sistemaEscolarAviso = sistemaescolar.AvisoDAO.loadAvisoByQuery(null, null);
			// Delete the persistent object
			sistemaescolar.AvisoDAO.delete(sistemaEscolarAviso);
			sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			sistemaescolar.EventoDAO.delete(sistemaEscolarEvento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEscuelaData deleteEscuelaData = new DeleteEscuelaData();
			try {
				deleteEscuelaData.deleteTestData();
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
