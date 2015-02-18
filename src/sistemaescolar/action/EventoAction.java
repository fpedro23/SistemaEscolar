package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import sistemaescolar.Evento;
import sistemaescolar.dbmanagement.EventoAD;

/**
 * Created by Pedro on 03/02/15.
 */
public class EventoAction extends ActionSupport {
    public String resultado;
    public Evento[] eventos;
    private int id;
    private String fecha, idRemitente, contenido, titulo;
    private Evento evento;
    private boolean mobile;
    private String tipo;


    public String createEvent() throws PersistentException {
        try {
            boolean transaccionExitosa = EventoAD.createEvent(
                    fecha,
                    Integer.parseInt(getIdRemitente()),
                    contenido,
                    titulo);
            resultado = "Evento creado existosamente";
        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al crear evento";
        }

        return "success";
    }

    public String readEvents() throws PersistentException {
        eventos = EventoAD.listEvents();
        if (isMobile()) return "json";
        else return "success";
    }


    public String readEventById() throws PersistentException {
        evento = EventoAD.listEventById(id);
        return "success";
    }

    public String updateEvent() throws PersistentException {
        try {
            boolean transaccionExitosa = EventoAD.updateEvent(
                    id,
                    fecha,
                    Integer.parseInt(getIdRemitente()),
                    contenido,
                    titulo);
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
            boolean transaccionExitosa = EventoAD.deleteEvento(id);
            resultado = "Evento eliminado existosamente";

        } catch (Exception e) {
            resultado = "Error al eliminar Evento";
            System.out.println(e.toString());
        }

        return "success";
    }


    public String nuevoRegistro(){
        tipo= "Event";
        return "success";
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
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

    public String getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(String idRemitente) {
        this.idRemitente = idRemitente;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
