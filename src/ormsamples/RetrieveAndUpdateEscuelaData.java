/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import sistemaescolar.model.*;
import org.orm.*;

public class RetrieveAndUpdateEscuelaData {
    public void retrieveAndUpdateTestData() throws PersistentException {
        PersistentTransaction t = EscuelaPersistentManager.instance().getSession().beginTransaction();
        try {
            Circular sistemaEscolarCircular = CircularDAO.loadCircularByQuery(null, null);
            // Update the properties of the persistent object
            CircularDAO.save(sistemaEscolarCircular);
            Aviso sistemaEscolarAviso = AvisoDAO.loadAvisoByQuery(null, null);
            // Update the properties of the persistent object
            AvisoDAO.save(sistemaEscolarAviso);
            Evento sistemaEscolarEvento = EventoDAO.loadEventoByQuery(null, null);
            // Update the properties of the persistent object
            EventoDAO.save(sistemaEscolarEvento);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

    public void retrieveByCriteria() throws PersistentException {
        System.out.println("Retrieving Circular by CircularCriteria");
        CircularCriteria sistemaEscolarCircularCriteria = new CircularCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarCircularCriteria.idCircular.eq();
        System.out.println(sistemaEscolarCircularCriteria.uniqueCircular());

        System.out.println("Retrieving Aviso by AvisoCriteria");
        AvisoCriteria sistemaEscolarAvisoCriteria = new AvisoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAvisoCriteria.idCircular.eq();
        System.out.println(sistemaEscolarAvisoCriteria.uniqueAviso());

        System.out.println("Retrieving Evento by EventoCriteria");
        EventoCriteria sistemaEscolarEventoCriteria = new EventoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarEventoCriteria.idCircular.eq();
        System.out.println(sistemaEscolarEventoCriteria.uniqueEvento());

    }


    public static void main(String[] args) {
        try {
            RetrieveAndUpdateEscuelaData retrieveAndUpdateEscuelaData = new RetrieveAndUpdateEscuelaData();
            try {
                retrieveAndUpdateEscuelaData.retrieveAndUpdateTestData();
                //retrieveAndUpdateEscuelaData.retrieveByCriteria();
            } finally {
                EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
