package sistemaescolar.action;

import org.orm.PersistentException;
import sistemaescolar.Administrador;
import sistemaescolar.dbmanagement.AdministratorDBManager;
import sistemaescolar.dbmanagement.AvisoAD;

/**
 * Created by Pedro on 17/02/15.
 */
public class AdministradorAction {
    public String resultado;
    public Administrador[] administradors;
    private int id;
    private String nombre, password;
    private Administrador administrador;
    private boolean mobile;


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
}