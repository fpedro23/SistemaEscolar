/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import sistemaescolar.model.EscuelaPersistentManager;
import org.orm.*;

public class CreateEscuelaDatabaseSchema {
    public static void main(String[] args) {
        try {
            ORMDatabaseInitiator.createSchema(EscuelaPersistentManager.instance());
            EscuelaPersistentManager.instance().disposePersistentManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
