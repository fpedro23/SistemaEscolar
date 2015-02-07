package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import sistemaescolar.Circular;
import sistemaescolar.dbmanagement.CircularDBManager;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 2:25 PM
 */
public class CircularAction extends ActionSupport{
    private int  id;
    private String fecha, remitente, contenido, titulo;
    private boolean mobile;
    private Circular circular;
    private Circular[] circulars;
    public String resultado;



    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String create() throws PersistentException {
        if(CircularDBManager.create(
                getTitulo(),
                getFecha(),
                getRemitente(),
                getContenido()
        )) {
            resultado = "success";
            return "success";
        }
        else {
            resultado = "failure";
            return "failure";
        }
    }


    public String update() throws PersistentException {
        if(CircularDBManager.update(
                getId(),
                getTitulo(),
                getFecha(),
                getRemitente(),
                getContenido()
        )) {
            resultado = "success";
            return "success";
        }
        else {
            resultado = "failure";
            return "failure";
        }
    }

    public String delete() throws PersistentException {
        if(CircularDBManager.delete(getId())) {
            resultado = "success";
            return "success";
        }
        else {
            resultado = "failure";
            return "failure";
        }
    }

    public String getAll() throws PersistentException {
        Circular[] circulars = CircularDBManager.getAll();
        if(circulars != null) {
            setCirculars(circulars);
            if(isMobile())
                return "json";
            else
                return "success";
        }
        else
            return "failure";
    }

    public String getById() throws PersistentException {
        Circular circular = CircularDBManager.getById(getId());
        if(circular != null) {
            setCircular(circular);
            return "success";
        }
        else
            return "failure";
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

    public Circular[] getCirculars() {
        return circulars;
    }

    public void setCirculars(Circular[] circulars) {
        this.circulars = circulars;
    }
}
