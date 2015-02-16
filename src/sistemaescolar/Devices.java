/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package sistemaescolar;

public class Devices {
    private int idDevice;
    private String UDUID;

    public Devices() {
    }

    public int getIdDevice() {
        return idDevice;
    }

    private void setIdDevice(int value) {
        this.idDevice = value;
    }

    public int getORMID() {
        return getIdDevice();
    }

    public String getUDUID() {
        return UDUID;
    }

    public void setUDUID(String value) {
        this.UDUID = value;
    }

    public String toString() {
        return String.valueOf(getIdDevice());
    }

}
