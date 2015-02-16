/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;

public class RetrieveAndUpdateEscuelaData {
    public static void main(String[] args) {
        try {
            RetrieveAndUpdateEscuelaData retrieveAndUpdateEscuelaData = new RetrieveAndUpdateEscuelaData();
            try {
                retrieveAndUpdateEscuelaData.retrieveAndUpdateTestData();
                //retrieveAndUpdateEscuelaData.retrieveByCriteria();
            } finally {
                sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void retrieveAndUpdateTestData() throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();
        try {
            sistemaescolar.Circular sistemaEscolarCircular = sistemaescolar.CircularDAO.loadCircularByQuery(null, null);
            // Update the properties of the persistent object
            sistemaescolar.CircularDAO.save(sistemaEscolarCircular);
            sistemaescolar.Aviso sistemaEscolarAviso = sistemaescolar.AvisoDAO.loadAvisoByQuery(null, null);
            // Update the properties of the persistent object
            sistemaescolar.AvisoDAO.save(sistemaEscolarAviso);
            sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.loadEventoByQuery(null, null);
            // Update the properties of the persistent object
            sistemaescolar.EventoDAO.save(sistemaEscolarEvento);
            sistemaescolar.Alumno sistemaEscolarAlumno = sistemaescolar.AlumnoDAO.loadAlumnoByQuery(null, null);
            // Update the properties of the persistent object
            sistemaescolar.AlumnoDAO.save(sistemaEscolarAlumno);
            sistemaescolar.Administrador sistemaEscolarAdministrador = sistemaescolar.AdministradorDAO.loadAdministradorByQuery(null, null);
            // Update the properties of the persistent object
            sistemaescolar.AdministradorDAO.save(sistemaEscolarAdministrador);
            sistemaescolar.Devices sistemaEscolarDevices = sistemaescolar.DevicesDAO.loadDevicesByQuery(null, null);
            // Update the properties of the persistent object
            sistemaescolar.DevicesDAO.save(sistemaEscolarDevices);
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }

    public void retrieveByCriteria() throws PersistentException {
        System.out.println("Retrieving Circular by CircularCriteria");
        sistemaescolar.CircularCriteria sistemaEscolarCircularCriteria = new sistemaescolar.CircularCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarCircularCriteria.idCircular.eq();
        System.out.println(sistemaEscolarCircularCriteria.uniqueCircular());

        System.out.println("Retrieving Aviso by AvisoCriteria");
        sistemaescolar.AvisoCriteria sistemaEscolarAvisoCriteria = new sistemaescolar.AvisoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAvisoCriteria.idCircular.eq();
        System.out.println(sistemaEscolarAvisoCriteria.uniqueAviso());

        System.out.println("Retrieving Evento by EventoCriteria");
        sistemaescolar.EventoCriteria sistemaEscolarEventoCriteria = new sistemaescolar.EventoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarEventoCriteria.idCircular.eq();
        System.out.println(sistemaEscolarEventoCriteria.uniqueEvento());

        System.out.println("Retrieving Alumno by AlumnoCriteria");
        sistemaescolar.AlumnoCriteria sistemaEscolarAlumnoCriteria = new sistemaescolar.AlumnoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAlumnoCriteria.idAlumno.eq();
        System.out.println(sistemaEscolarAlumnoCriteria.uniqueAlumno());

        System.out.println("Retrieving Administrador by AdministradorCriteria");
        sistemaescolar.AdministradorCriteria sistemaEscolarAdministradorCriteria = new sistemaescolar.AdministradorCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAdministradorCriteria.idAdministrador.eq();
        System.out.println(sistemaEscolarAdministradorCriteria.uniqueAdministrador());

        System.out.println("Retrieving Devices by DevicesCriteria");
        sistemaescolar.DevicesCriteria sistemaEscolarDevicesCriteria = new sistemaescolar.DevicesCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarDevicesCriteria.idDevice.eq();
        System.out.println(sistemaEscolarDevicesCriteria.uniqueDevices());

    }
}
