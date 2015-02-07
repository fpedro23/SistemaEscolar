/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import sistemaescolar.model.*;
import org.orm.*;

public class CreateEscuelaData {
    public void createTestData() throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
        try {
            Circular sistemaEscolarCircular = CircularDAO.createCircular();
            sistemaEscolarCircular.setContenido("Contenido de la circular");
            // Initialize the properties of the persistent object here
            CircularDAO.save(sistemaEscolarCircular);
            Aviso sistemaEscolarAviso = AvisoDAO.createAviso();
            // Initialize the properties of the persistent object here
            AvisoDAO.save(sistemaEscolarAviso);
            Evento sistemaEscolarEvento = EventoDAO.createEvento();
            // Initialize the properties of the persistent object here
            EventoDAO.save(sistemaEscolarEvento);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

    public static void main(String[] args) {
        try {
            CreateEscuelaData createEscuelaData = new CreateEscuelaData();
            try {
                createEscuelaData.createTestData();
            } finally {
                EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
