/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import sistemaescolar.model.*;
import org.orm.*;

public class ListEscuelaData {
    private static final int ROW_COUNT = 100;

    public void listTestData() throws PersistentException {
        System.out.println("Listing Circular...");
        Circular[] sistemaEscolarCirculars = CircularDAO.listCircularByQuery(null, null);
        int length = Math.min(sistemaEscolarCirculars.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarCirculars[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Aviso...");
        Aviso[] sistemaEscolarAvisos = AvisoDAO.listAvisoByQuery(null, null);
        length = Math.min(sistemaEscolarAvisos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAvisos[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Evento...");
        Evento[] sistemaEscolarEventos = EventoDAO.listEventoByQuery(null, null);
        length = Math.min(sistemaEscolarEventos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarEventos[i]);
        }
        System.out.println(length + " record(s) retrieved.");

    }

    public void listByCriteria() throws PersistentException {
        System.out.println("Listing Circular by Criteria...");
        CircularCriteria sistemaEscolarCircularCriteria = new CircularCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarCircularCriteria.idCircular.eq();
        sistemaEscolarCircularCriteria.setMaxResults(ROW_COUNT);
        Circular[] sistemaEscolarCirculars = sistemaEscolarCircularCriteria.listCircular();
        int length = sistemaEscolarCirculars == null ? 0 : Math.min(sistemaEscolarCirculars.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarCirculars[i]);
        }
        System.out.println(length + " Circular record(s) retrieved.");

        System.out.println("Listing Aviso by Criteria...");
        AvisoCriteria sistemaEscolarAvisoCriteria = new AvisoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAvisoCriteria.idCircular.eq();
        sistemaEscolarAvisoCriteria.setMaxResults(ROW_COUNT);
        Aviso[] sistemaEscolarAvisos = sistemaEscolarAvisoCriteria.listAviso();
        length = sistemaEscolarAvisos == null ? 0 : Math.min(sistemaEscolarAvisos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAvisos[i]);
        }
        System.out.println(length + " Aviso record(s) retrieved.");

        System.out.println("Listing Evento by Criteria...");
        EventoCriteria sistemaEscolarEventoCriteria = new EventoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarEventoCriteria.idCircular.eq();
        sistemaEscolarEventoCriteria.setMaxResults(ROW_COUNT);
        Evento[] sistemaEscolarEventos = sistemaEscolarEventoCriteria.listEvento();
        length = sistemaEscolarEventos == null ? 0 : Math.min(sistemaEscolarEventos.length, ROW_COUNT);
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
            } finally {
                EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
