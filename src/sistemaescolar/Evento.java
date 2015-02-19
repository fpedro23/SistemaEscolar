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

public class Evento {
	public Evento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTO_ADMINISTRADORIDADMINISTRADOR) {
			this.administradoridAdministrador = (Administrador) owner;
		}
	}
	
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
	private String contenido;

    @Expose
	private java.sql.Time horaInicio;
    @Expose
    private Administrador administradoridAdministrador;

    @Expose
	private java.sql.Time horaFinal;
	
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
	
	public void setContenido(String value) {
		this.contenido = value;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setHoraInicio(java.sql.Time value) {
		this.horaInicio = value;
	}
	
	public java.sql.Time getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraFinal(java.sql.Time value) {
		this.horaFinal = value;
	}
	
	public java.sql.Time getHoraFinal() {
		return horaFinal;
	}
	
	public void setAdministradoridAdministrador(Administrador value) {
		if (administradoridAdministrador != null) {
			administradoridAdministrador.evento.remove(this);
		}
		if (value != null) {
			value.evento.add(this);
		}
	}
	
	public Administrador getAdministradoridAdministrador() {
		return administradoridAdministrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_AdministradoridAdministrador(Administrador value) {
		this.administradoridAdministrador = value;
	}
	
	private Administrador getORM_AdministradoridAdministrador() {
		return administradoridAdministrador;
	}
	
	public String toString() {
		return String.valueOf(getIdCircular());
	}
	
}
