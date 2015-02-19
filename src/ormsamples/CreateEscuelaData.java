/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
import sistemaescolar.CircularDAO;

public class CreateEscuelaData {
    public static void main(String[] args) {
        try {
            CreateEscuelaData createEscuelaData = new CreateEscuelaData();
            try {
                createEscuelaData.createTestData();
            } finally {
                sistemaescolar.EscuelaPersistentManager.instance().disposePersistentManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTestData() throws PersistentException {
        PersistentTransaction t = sistemaescolar.EscuelaPersistentManager.instance().getSession().beginTransaction();
        try {
            /*sistemaescolar.Circular sistemaEscolarCircular = sistemaescolar.CircularDAO.createCircular();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administradoridAdministrador
			sistemaescolar.CircularDAO.save(sistemaEscolarCircular);
			sistemaescolar.Aviso sistemaEscolarAviso = sistemaescolar.AvisoDAO.createAviso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administradoridAdministrador
			sistemaescolar.AvisoDAO.save(sistemaEscolarAviso);
			sistemaescolar.Evento sistemaEscolarEvento = sistemaescolar.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : administradoridAdministrador
			sistemaescolar.EventoDAO.save(sistemaEscolarEvento);
			sistemaescolar.Alumno sistemaEscolarAlumno = sistemaescolar.AlumnoDAO.createAlumno();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : passwordAlumno
			sistemaescolar.AlumnoDAO.save(sistemaEscolarAlumno);*/
            sistemaescolar.Administrador sistemaEscolarAdministrador = sistemaescolar.AdministradorDAO.createAdministrador();
            // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evento, aviso, circular
            sistemaEscolarAdministrador.setNombreAdministrador("pedro");
            sistemaEscolarAdministrador.setPassword("pedro");
            sistemaEscolarAdministrador.circular.add(CircularDAO.getCircularByORMID(1));
            sistemaescolar.AdministradorDAO.save(sistemaEscolarAdministrador);
			/*sistemaescolar.Devices sistemaEscolarDevices = sistemaescolar.DevicesDAO.createDevices();
			// Initialize the properties of the persistent object here
			sistemaescolar.DevicesDAO.save(sistemaEscolarDevices);*/
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }

    }
}
