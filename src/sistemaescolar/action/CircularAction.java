package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import sistemaescolar.Circular;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 2:25 PM
 */
public class CircularAction extends ActionSupport{
    private int  id;
    private String fecha, remitente, contenido, titulo;
    private Circular circular;
    public String resultado;


    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String create() {
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

    public Circular getCircular() {
        return circular;
    }

    public void setCircular(Circular circular) {
        this.circular = circular;
    }
}
