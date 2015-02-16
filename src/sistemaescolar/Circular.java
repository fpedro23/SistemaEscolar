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

import com.google.gson.annotations.Expose;

public class Circular {
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };
    @Expose
    private int idCircular;
    @Expose
    private String titulo;
    @Expose
    private String fecha;
    @Expose
    private Administrador administradoridAdministrador;
    @Expose
    private String contenido;

    public Circular() {
    }

    private void this_setOwner(Object owner, int key) {
        if (key == ORMConstants.KEY_CIRCULAR_ADMINISTRADORIDADMINISTRADOR) {
            this.administradoridAdministrador = (Administrador) owner;
        }
    }

    public int getIdCircular() {
        return idCircular;
    }

    private void setIdCircular(int value) {
        this.idCircular = value;
    }

    public int getORMID() {
        return getIdCircular();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String value) {
        this.titulo = value;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String value) {
        this.fecha = value;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String value) {
        this.contenido = value;
    }

    public Administrador getAdministradoridAdministrador() {
        return administradoridAdministrador;
    }

    public void setAdministradoridAdministrador(Administrador value) {
        if (administradoridAdministrador != null) {
            administradoridAdministrador.circular.remove(this);
        }
        if (value != null) {
            value.circular.add(this);
        }
    }

    private Administrador getORM_AdministradoridAdministrador() {
        return administradoridAdministrador;
    }

    /**
     * This method is for internal use only.
     */
    public void setORM_AdministradoridAdministrador(Administrador value) {
        this.administradoridAdministrador = value;
    }

    public String toString() {
        return String.valueOf(getIdCircular());
    }

}
