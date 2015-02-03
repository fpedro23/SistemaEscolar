package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import sistemaescolar.Evento;
import sistemaescolar.EventoAD;

/**
 * Created by Pedro on 03/02/15.
 */
public class EventoAction extends ActionSupport {
    public String resultado;
    public Evento[] eventos;
    private int id;
    private String fecha, remitente, contenido, titulo;
    private Evento evento;

    public String createEvent() throws PersistentException {
        EventoAD eventoManager = new EventoAD();
        try {
            boolean transaccionExitosa = eventoManager.createEvent(fecha, remitente, contenido, titulo);
            resultado = "Evento creado existosamente";
        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al crear evento";
        }

        return "success";
    }

    public String readEvents() throws PersistentException {
        EventoAD eventoManager = new EventoAD();
        eventos = eventoManager.listEvents();
        return "success";
    }

    public String updateEvent() throws PersistentException {
        EventoAD eventoManager = new EventoAD();
        try {
            boolean transaccionExitosa = eventoManager.updateEvent(id, fecha, remitente, contenido, titulo);
            resultado = "Evento actualizado existosamente";

        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al actualizar Evento";
        }

        return "success";
    }

    public String deleteEvent() throws PersistentException {
        EventoAD eventoManager = new EventoAD();
        try {
            boolean transaccionExitosa = eventoManager.deleteEvento(id);
            resultado = "Evento eliminado existosamente";

        } catch (Exception e) {
            resultado = "Error al eliminar Evento";
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

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
