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

public class Alumno {
    private int idAlumno;
    private String nombreAlumno;
    private String passwordAlumno;

    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    private void setIdAlumno(int value) {
        this.idAlumno = value;
    }

    public int getORMID() {
        return getIdAlumno();
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

    public String getPasswordAlumno() {
        return passwordAlumno;
    }

    public void setPasswordAlumno(String value) {
        this.passwordAlumno = value;
    }

    public String toString() {
        return String.valueOf(getIdAlumno());
    }

}
