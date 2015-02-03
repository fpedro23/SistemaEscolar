package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import sistemaescolar.Aviso;
import sistemaescolar.AvisoAD;

/**
 * Created by Pedro on 03/02/15.
 */
public class AvisoAction extends ActionSupport {
    public String resultado;
    public Aviso[] avisos;
    private int id;
    private String fecha, remitente, contenido, titulo;
    private Aviso aviso;

    public String createAviso() throws PersistentException {
        try {
            boolean transaccionExitosa = AvisoAD.createAviso(fecha, remitente, contenido, titulo);
            resultado = "Aviso creado existosamente";
        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al crear Aviso";
        }

        return "success";
    }

    public String readAvisos() throws PersistentException {
        avisos = AvisoAD.listAvisos();
        return "success";
    }

    public String readAvisoById() throws PersistentException {
        aviso = AvisoAD.listAvisosById(id);
        return "success";
    }

    public String updateAviso() throws PersistentException {
        try {
            boolean transaccionExitosa = AvisoAD.updateAviso(id, fecha, remitente, contenido, titulo);
            resultado = "Aviso actualizado existosamente";

        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al actualizar Aviso";
        }

        return "success";
    }

    public String deleteAviso() throws PersistentException {
        try {
            boolean transaccionExitosa = AvisoAD.deleteAviso(id);
            resultado = "Aviso eliminado existosamente";

        } catch (Exception e) {
            resultado = "Error al eliminar Aviso";
            System.out.println(e.toString());
        }

        return "success";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aviso getAviso() {
        return aviso;
    }

    public void setAviso(Aviso aviso) {
        this.aviso = aviso;
    }
}
