/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import com.google.gson.JsonObject;
import sistemaescolar.model.Circular;
import sistemaescolar.model.CircularDAO;
import sistemaescolar.model.EscuelaPersistentManager;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class DeleteEscuelaData {
    public static void main(String[] args) {
        try {
            DeleteEscuelaData deleteEscuelaData = new DeleteEscuelaData();
            try {
                deleteEscuelaData.deleteTestData();
            } finally {
                EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTestData() throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
        JsonObject jsonResponse = new JsonObject();
        try {
            Circular sistemaEscolarCircular = CircularDAO.getCircularByORMID(2);
            // Delete the persistent object
            if (CircularDAO.delete(sistemaEscolarCircular))
                jsonResponse.addProperty("Result", "Success");
            else
                jsonResponse.addProperty("Result", "Failure");

//			sistemaescolar.model.Aviso sistemaEscolarAviso = sistemaescolar.model.AvisoDAO.loadAvisoByQuery(null, null);
//			// Delete the persistent object
//			sistemaescolar.model.AvisoDAO.delete(sistemaEscolarAviso);

//			sistemaescolar.model.Evento sistemaEscolarEvento = sistemaescolar.model.EventoDAO.loadEventoByQuery(null, null);
//			// Delete the persistent object
//			sistemaescolar.model.EventoDAO.delete(sistemaEscolarEvento);
            t.commit();

            System.out.println(jsonResponse);
        } catch (Exception e) {
            t.rollback();
        }

    }
}
