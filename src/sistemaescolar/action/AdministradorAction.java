package sistemaescolar.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.orm.PersistentException;
import sistemaescolar.Administrador;
import sistemaescolar.dbmanagement.AdministratorDBManager;
import sistemaescolar.dbmanagement.AvisoAD;

import java.util.Map;

/**
 * Created by Pedro on 17/02/15.
 */
public class AdministradorAction extends ActionSupport implements SessionAware {
    public String resultado;
    public Administrador[] administradors;
    private int id;
    private String nombre, password;
    private Administrador administrador;
    private boolean mobile;
    private Map<String, Object> sessionMap;
    public String mensajeResultado;
    private String tipo;
    public Administrador user;

    public String doLogin() throws PersistentException {

        Administrador resultado = AdministratorDBManager.doLogin(nombre, password);

        if (resultado != null) {
            System.out.println("Nombre: "+nombre+"User"+resultado.getNombreAdministrador());
            mensajeResultado = "Bienvenido " + resultado.getNombreAdministrador();

            sessionMap.put("USER", resultado);
            return "success";
        } else {
            mensajeResultado = "Login Fallido";
            return "error";
        }

    }

    public String doMobileLogin() throws PersistentException {
        user = AdministratorDBManager.doLogin(nombre, password);
        if(resultado != null)
            return "success";
        else
            return "failure";
    }

    public String nuevoRegistro() {
        tipo = "Administrador";
        return "success";
    }

    public String createAdministrador() throws PersistentException {
        try {
            boolean transaccionExitosa = AdministratorDBManager.createAdministrator(
                    nombre,
                    password);
            resultado = "Aviso creado existosamente";
        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al crear Aviso";
        }

        return "success";
    }

    public String readAdministrators() throws PersistentException {
        administradors = AdministratorDBManager.listAdministrators();
        return "success";
    }

    public String readAdministradorByID() throws PersistentException {
        administrador = AdministratorDBManager.listAdministradorById(id);

        if(isMobile())
            return "json";
        else
            return "success";
    }

    public String updateAdministrador() throws PersistentException {
        try {
            boolean transaccionExitosa = AdministratorDBManager.updateAdministrador(
                    id,
                    nombre,
                    password);
            resultado = "Aviso actualizado existosamente";

        } catch (Exception e) {
            System.out.println(e.toString());
            resultado = "Error al actualizar Aviso";
        }

        return "success";
    }

    public String deleteAdministrador() throws PersistentException {
        try {
            boolean transaccionExitosa = AdministratorDBManager.deleteAdministrador(id);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

}
