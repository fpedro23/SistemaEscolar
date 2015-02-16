/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;

public class ListEscuelaData {
    private static final int ROW_COUNT = 100;

    public static void main(String[] args) {
        try {
            ListEscuelaData listEscuelaData = new ListEscuelaData();
            try {
                listEscuelaData.listTestData();
                //listEscuelaData.listByCriteria();
            } finally {
                sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listTestData() throws PersistentException {
        System.out.println("Listing Circular...");
        sistemaescolar.Circular[] sistemaEscolarCirculars = sistemaescolar.CircularDAO.listCircularByQuery(null, null);
        int length = Math.min(sistemaEscolarCirculars.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarCirculars[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Aviso...");
        sistemaescolar.Aviso[] sistemaEscolarAvisos = sistemaescolar.AvisoDAO.listAvisoByQuery(null, null);
        length = Math.min(sistemaEscolarAvisos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAvisos[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Evento...");
        sistemaescolar.Evento[] sistemaEscolarEventos = sistemaescolar.EventoDAO.listEventoByQuery(null, null);
        length = Math.min(sistemaEscolarEventos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarEventos[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Alumno...");
        sistemaescolar.Alumno[] sistemaEscolarAlumnos = sistemaescolar.AlumnoDAO.listAlumnoByQuery(null, null);
        length = Math.min(sistemaEscolarAlumnos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAlumnos[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Administrador...");
        sistemaescolar.Administrador[] sistemaEscolarAdministradors = sistemaescolar.AdministradorDAO.listAdministradorByQuery(null, null);
        length = Math.min(sistemaEscolarAdministradors.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAdministradors[i]);
        }
        System.out.println(length + " record(s) retrieved.");

        System.out.println("Listing Devices...");
        sistemaescolar.Devices[] sistemaEscolarDeviceses = sistemaescolar.DevicesDAO.listDevicesByQuery(null, null);
        length = Math.min(sistemaEscolarDeviceses.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarDeviceses[i]);
        }
        System.out.println(length + " record(s) retrieved.");

    }

    public void listByCriteria() throws PersistentException {
        System.out.println("Listing Circular by Criteria...");
        sistemaescolar.CircularCriteria sistemaEscolarCircularCriteria = new sistemaescolar.CircularCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarCircularCriteria.idCircular.eq();
        sistemaEscolarCircularCriteria.setMaxResults(ROW_COUNT);
        sistemaescolar.Circular[] sistemaEscolarCirculars = sistemaEscolarCircularCriteria.listCircular();
        int length = sistemaEscolarCirculars == null ? 0 : Math.min(sistemaEscolarCirculars.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarCirculars[i]);
        }
        System.out.println(length + " Circular record(s) retrieved.");

        System.out.println("Listing Aviso by Criteria...");
        sistemaescolar.AvisoCriteria sistemaEscolarAvisoCriteria = new sistemaescolar.AvisoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAvisoCriteria.idCircular.eq();
        sistemaEscolarAvisoCriteria.setMaxResults(ROW_COUNT);
        sistemaescolar.Aviso[] sistemaEscolarAvisos = sistemaEscolarAvisoCriteria.listAviso();
        length = sistemaEscolarAvisos == null ? 0 : Math.min(sistemaEscolarAvisos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAvisos[i]);
        }
        System.out.println(length + " Aviso record(s) retrieved.");

        System.out.println("Listing Evento by Criteria...");
        sistemaescolar.EventoCriteria sistemaEscolarEventoCriteria = new sistemaescolar.EventoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarEventoCriteria.idCircular.eq();
        sistemaEscolarEventoCriteria.setMaxResults(ROW_COUNT);
        sistemaescolar.Evento[] sistemaEscolarEventos = sistemaEscolarEventoCriteria.listEvento();
        length = sistemaEscolarEventos == null ? 0 : Math.min(sistemaEscolarEventos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarEventos[i]);
        }
        System.out.println(length + " Evento record(s) retrieved.");

        System.out.println("Listing Alumno by Criteria...");
        sistemaescolar.AlumnoCriteria sistemaEscolarAlumnoCriteria = new sistemaescolar.AlumnoCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAlumnoCriteria.idAlumno.eq();
        sistemaEscolarAlumnoCriteria.setMaxResults(ROW_COUNT);
        sistemaescolar.Alumno[] sistemaEscolarAlumnos = sistemaEscolarAlumnoCriteria.listAlumno();
        length = sistemaEscolarAlumnos == null ? 0 : Math.min(sistemaEscolarAlumnos.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAlumnos[i]);
        }
        System.out.println(length + " Alumno record(s) retrieved.");

        System.out.println("Listing Administrador by Criteria...");
        sistemaescolar.AdministradorCriteria sistemaEscolarAdministradorCriteria = new sistemaescolar.AdministradorCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarAdministradorCriteria.idAdministrador.eq();
        sistemaEscolarAdministradorCriteria.setMaxResults(ROW_COUNT);
        sistemaescolar.Administrador[] sistemaEscolarAdministradors = sistemaEscolarAdministradorCriteria.listAdministrador();
        length = sistemaEscolarAdministradors == null ? 0 : Math.min(sistemaEscolarAdministradors.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarAdministradors[i]);
        }
        System.out.println(length + " Administrador record(s) retrieved.");

        System.out.println("Listing Devices by Criteria...");
        sistemaescolar.DevicesCriteria sistemaEscolarDevicesCriteria = new sistemaescolar.DevicesCriteria();
        // Please uncomment the follow line and fill in parameter(s)
        //sistemaEscolarDevicesCriteria.idDevice.eq();
        sistemaEscolarDevicesCriteria.setMaxResults(ROW_COUNT);
        sistemaescolar.Devices[] sistemaEscolarDeviceses = sistemaEscolarDevicesCriteria.listDevices();
        length = sistemaEscolarDeviceses == null ? 0 : Math.min(sistemaEscolarDeviceses.length, ROW_COUNT);
        for (int i = 0; i < length; i++) {
            System.out.println(sistemaEscolarDeviceses[i]);
        }
        System.out.println(length + " Devices record(s) retrieved.");

    }
}
