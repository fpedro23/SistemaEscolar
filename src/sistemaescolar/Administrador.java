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

public class Administrador {
    org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
        public java.util.Set getSet(int key) {
            return this_getSet(key);
        }

    };
    public final CircularSetCollection circular = new CircularSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_CIRCULAR, ORMConstants.KEY_CIRCULAR_ADMINISTRADORIDADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
    public final AvisoSetCollection aviso = new AvisoSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_AVISO, ORMConstants.KEY_AVISO_ADMINISTRADORIDADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
    public final EventoSetCollection evento = new EventoSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_EVENTO, ORMConstants.KEY_EVENTO_ADMINISTRADORIDADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
    @Expose
    private int idAdministrador;
    @Expose
    private String nombreAdministrador;
    private String password;
    private java.util.Set ORM_circular = new java.util.HashSet();
    private java.util.Set ORM_aviso = new java.util.HashSet();
    private java.util.Set ORM_evento = new java.util.HashSet();

    public Administrador() {
    }

    private java.util.Set this_getSet(int key) {
        if (key == ORMConstants.KEY_ADMINISTRADOR_CIRCULAR) {
            return ORM_circular;
        } else if (key == ORMConstants.KEY_ADMINISTRADOR_AVISO) {
            return ORM_aviso;
        } else if (key == ORMConstants.KEY_ADMINISTRADOR_EVENTO) {
            return ORM_evento;
        }

        return null;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    private void setIdAdministrador(int value) {
        this.idAdministrador = value;
    }

    public int getORMID() {
        return getIdAdministrador();
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String value) {
        this.nombreAdministrador = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    private java.util.Set getORM_Circular() {
        return ORM_circular;
    }

    private void setORM_Circular(java.util.Set value) {
        this.ORM_circular = value;
    }

    private java.util.Set getORM_Aviso() {
        return ORM_aviso;
    }

    private void setORM_Aviso(java.util.Set value) {
        this.ORM_aviso = value;
    }

    private java.util.Set getORM_Evento() {
        return ORM_evento;
    }

    private void setORM_Evento(java.util.Set value) {
        this.ORM_evento = value;
    }

    public String toString() {
        return String.valueOf(getIdAdministrador());
    }

}
