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
package sistemaescolar.model;

public class Evento {
    public Evento() {
    }

    private int idCircular;

    private String titulo;

    private String fecha;

    private String remitente;

    private String contenido;

    private void setIdCircular(int value) {
        this.idCircular = value;
    }

    public int getIdCircular() {
        return idCircular;
    }

    public int getORMID() {
        return getIdCircular();
    }

    public void setTitulo(String value) {
        this.titulo = value;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setFecha(String value) {
        this.fecha = value;
    }

    public String getFecha() {
        return fecha;
    }

    public void setRemitente(String value) {
        this.remitente = value;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setContenido(String value) {
        this.contenido = value;
    }

    public String getContenido() {
        return contenido;
    }

    public String toString() {
        return String.valueOf(getIdCircular());
    }

}
