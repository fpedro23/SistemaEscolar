package sistemaescolar.action;

import org.orm.PersistentException;
import sistemaescolar.dbmanagement.DevicesDBManager;

/**
 * Created by Pedro on 17/02/15.
 */
public class DeviceAction {
    private String UUID;
    public String resultado;



    public String createDevice() throws PersistentException {
        try {
            boolean transaccionExitosa = DevicesDBManager.createDevice(
                    UUID);
            resultado = "Dispositivo creado existosamente";
        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al crear Aviso";
        }

        return "success";
    }

}
