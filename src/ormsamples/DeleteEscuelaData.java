/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;

public class DeleteEscuelaData {
    public static void main(String[] args) {
        try {
            DeleteEscuelaData deleteEscuelaData = new DeleteEscuelaData();
            try {
                deleteEscuelaData.deleteTestData();
            } finally {
                sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            sistemaescolar.Alumno sistemaEscolarAlumno = sistemaescolar.AlumnoDAO.loadAlumnoByQuery(null, null);
            // Delete the persistent object
            sistemaescolar.AlumnoDAO.delete(sistemaEscolarAlumno);
            sistemaescolar.Administrador sistemaEscolarAdministrador = sistemaescolar.AdministradorDAO.loadAdministradorByQuery(null, null);
            // Delete the persistent object
            sistemaescolar.AdministradorDAO.delete(sistemaEscolarAdministrador);
            sistemaescolar.Devices sistemaEscolarDevices = sistemaescolar.DevicesDAO.loadDevicesByQuery(null, null);
            // Delete the persistent object
            sistemaescolar.DevicesDAO.delete(sistemaEscolarDevices);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }
}
