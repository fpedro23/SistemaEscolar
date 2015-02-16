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

public class Evento {
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public void setOwner(Object owner, int key) {
            this_setOwner(owner, key);
        }

    };
    private int idCircular;
    private String titulo;
    private String fecha;
    private String contenido;
    private java.sql.Time hora;
    private Administrador administradoridAdministrador;

    public Evento() {
    }

    private void this_setOwner(Object owner, int key) {
        if (key == ORMConstants.KEY_EVENTO_ADMINISTRADORIDADMINISTRADOR) {
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

    public java.sql.Time getHora() {
        return hora;
    }

    public void setHora(java.sql.Time value) {
        this.hora = value;
    }

    public Administrador getAdministradoridAdministrador() {
        return administradoridAdministrador;
    }

    public void setAdministradoridAdministrador(Administrador value) {
        if (administradoridAdministrador != null) {
            administradoridAdministrador.evento.remove(this);
        }
        if (value != null) {
            value.evento.add(this);
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
