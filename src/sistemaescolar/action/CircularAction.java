package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import sistemaescolar.Circular;
import sistemaescolar.ZeroPushHelper;
import sistemaescolar.dbmanagement.CircularDBManager;

import java.io.UnsupportedEncodingException;

/**
 * SistemaEscolar
 * Created by mng687 on 1/30/15 at 2:25 PM
 */
public class CircularAction extends ActionSupport {
    public String resultado;
    public Circular elementoEscolar;
    private int id;
    private String fecha, idRemitente, contenido, titulo;
    private boolean mobile;
    private Circular circular;
    private Circular[] circulars;
    private String tipo;
    private String notifyUsers;

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String create() throws PersistentException, UnsupportedEncodingException {

        Circular circularResult = CircularDBManager.create(
                getTitulo(),
                getFecha(),
                Integer.parseInt(getIdRemitente()),
                getContenido()
        );

        if (circularResult!=null) {

            resultado = "success";

            if (notifyUsers != null)

                ZeroPushHelper.sendBroadcast("Nueva Circular", titulo, Integer.toString(circularResult.getIdCircular()), "circular");

            return "success";
        } else {
            resultado = "failure";
            return "failure";
        }
    }

    public String nuevoRegistro(){
        tipo= "Circular";
        return "success";
    }


    public String update() throws PersistentException, UnsupportedEncodingException {
        Circular circularResult = CircularDBManager.update(
                getId(),
                getTitulo(),
                getFecha(),
                Integer.parseInt(getIdRemitente()),
                getContenido()
        );

        if (circularResult != null) {

            resultado = "success";

            if (notifyUsers != null)
                ZeroPushHelper.sendBroadcast("Circular Actualizada", titulo, Integer.toString(circularResult.getIdCircular()), "circular");

            return "success";
        } else {
            resultado = "failure";
            return "failure";
        }
    }

    public String delete() throws PersistentException {
        if (CircularDBManager.delete(getId())) {
            resultado = "success";
            return "success";
        } else {
            resultado = "failure";
            return "failure";
        }
    }

    public String getAll() throws PersistentException {
        Circular[] circulars = CircularDBManager.getAll();
        if (circulars != null) {
            setCirculars(circulars);
            if (isMobile()) {
                return "json";
            }
            else
                return "success";
        } else
            return "failure";
    }

    public String getById() throws PersistentException {
        Circular circular = CircularDBManager.getById(getId());
        if (circular != null) {
            setCircular(circular);
            return "success";
        } else
            return "failure";
    }

    public String getAllMobile() throws PersistentException {
        setCirculars(CircularDBManager.getAll());
        if(circulars != null)
            return "json";
        else
            return "failure";
    }

    public String getMobileCircularByID() throws PersistentException {
        elementoEscolar = CircularDBManager.getById(getId());
        if (elementoEscolar != null) {
            setCircular(elementoEscolar);
            return "success";
        } else
            return "failure";

    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getNotifyUsers() {
        return notifyUsers;
    }

    public void setNotifyUsers(String notifyUsers) {
        this.notifyUsers = notifyUsers;
    }
}
