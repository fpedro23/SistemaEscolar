/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import com.google.gson.JsonObject;
import org.orm.*;
public class DeleteEscuelaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();
        JsonObject jsonResponse = new JsonObject();
		try {
			sistemaescolar.Circular sistemaEscolarCircular = sistemaescolar.CircularDAO.getCircularByORMID(2);
			// Delete the persistent object
			if(sistemaescolar.CircularDAO.delete(sistemaEscolarCircular))
                jsonResponse.addProperty("Result", "Success");
            else
                jsonResponse.addProperty("Result", "Failure");

//			sistemaescolar.Aviso sistemaEscolarAviso = sistemaescolar.AvisoDAO.loadAvisoByQuery(null, null);
//			// Delete the persistent object
//			sistemaescolar.AvisoDAO.delete(sistemaEscolarAviso);
//			sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.loadEventoByQuery(null, null);
//			// Delete the persistent object
//			sistemaescolar.EventoDAO.delete(sistemaEscolarEvento);
			t.commit();

            System.out.println(jsonResponse);
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
