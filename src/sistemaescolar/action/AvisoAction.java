package sistemaescolar.action;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opensymphony.xwork2.ActionSupport;
import org.orm.PersistentException;
import sistemaescolar.Aviso;
import sistemaescolar.ZeroPushHelper;
import sistemaescolar.dbmanagement.AvisoAD;

/**
 * Created by Pedro on 03/02/15.
 */
public class AvisoAction extends ActionSupport {
    public String resultado;
    public Aviso[] avisos;
    public Aviso elementoEscolar;
    private int id;
    private String fecha, idRemitente, contenido, titulo;
    private Aviso aviso;
    private boolean mobile;
    private String tipo;
    private String notifyUsers;

    public String createAviso() throws PersistentException {
        try {
            Aviso transaccionExitosa = AvisoAD.createAviso(
                    fecha,
                    Integer.parseInt(getIdRemitente()),
                    contenido,
                    titulo);
            resultado = "Aviso creado existosamente";

            if(notifyUsers.equals("on")){
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                ZeroPushHelper.sendBroadcast("Nuevo Aviso", titulo, Integer.toString(transaccionExitosa.getIdCircular()), "aviso");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al crear Aviso";
        }

        return "success";
    }

    public String readAvisos() throws PersistentException {
        avisos = AvisoAD.listAvisos();
        if (isMobile()) return "json";
        else
            return "success";
    }

    public String readAvisoById() throws PersistentException {
        aviso = AvisoAD.listAvisosById(id);
        return "success";
    }

    public String updateAviso() throws PersistentException {
        try {
            Aviso transaccionExitosa = AvisoAD.updateAviso(
                    id,
                    fecha,
                    Integer.parseInt(getIdRemitente()),
                    contenido,
                    titulo);
            resultado = "Aviso actualizado existosamente";
            if(notifyUsers.equals("on")){
                Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
                ZeroPushHelper.sendBroadcast("Aviso Actualizado", titulo, Integer.toString(transaccionExitosa.getIdCircular()), "aviso");
            }


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

    public String nuevoRegistro(){
        tipo= "Aviso";
        return "success";
    }


    public String getMobileAvisoByID() throws PersistentException {
        elementoEscolar = AvisoAD.listAvisosById(id);
        if (elementoEscolar != null) {
            return "success";
        } else
            return "failure";

    }

    public String readAvisosMobile() throws PersistentException {
        avisos = AvisoAD.listAvisos();

        if(avisos != null)
            return "json";
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

    public Aviso getAviso() {
        return aviso;
    }

    public void setAviso(Aviso aviso) {
        this.aviso = aviso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNotifyUsers() {
        return notifyUsers;
    }

    public void setNotifyUsers(String notifyUsers) {
        this.notifyUsers = notifyUsers;
    }
}
