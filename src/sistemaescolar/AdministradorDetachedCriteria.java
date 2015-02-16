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

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression idAdministrador;
    public final StringExpression nombreAdministrador;
    public final StringExpression password;
    public final CollectionExpression circular;
    public final CollectionExpression aviso;
    public final CollectionExpression evento;

    public AdministradorDetachedCriteria() {
        super(Administrador.class, AdministradorCriteria.class);
        idAdministrador = new IntegerExpression("idAdministrador", this.getDetachedCriteria());
        nombreAdministrador = new StringExpression("nombreAdministrador", this.getDetachedCriteria());
        password = new StringExpression("password", this.getDetachedCriteria());
        circular = new CollectionExpression("ORM_Circular", this.getDetachedCriteria());
        aviso = new CollectionExpression("ORM_Aviso", this.getDetachedCriteria());
        evento = new CollectionExpression("ORM_Evento", this.getDetachedCriteria());
    }

    public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, AdministradorCriteria.class);
        idAdministrador = new IntegerExpression("idAdministrador", this.getDetachedCriteria());
        nombreAdministrador = new StringExpression("nombreAdministrador", this.getDetachedCriteria());
        password = new StringExpression("password", this.getDetachedCriteria());
        circular = new CollectionExpression("ORM_Circular", this.getDetachedCriteria());
        aviso = new CollectionExpression("ORM_Aviso", this.getDetachedCriteria());
        evento = new CollectionExpression("ORM_Evento", this.getDetachedCriteria());
    }

    public CircularDetachedCriteria createCircularCriteria() {
        return new CircularDetachedCriteria(createCriteria("ORM_Circular"));
    }

    public AvisoDetachedCriteria createAvisoCriteria() {
        return new AvisoDetachedCriteria(createCriteria("ORM_Aviso"));
    }

    public EventoDetachedCriteria createEventoCriteria() {
        return new EventoDetachedCriteria(createCriteria("ORM_Evento"));
    }

    public Administrador uniqueAdministrador(PersistentSession session) {
        return (Administrador) super.createExecutableCriteria(session).uniqueResult();
    }

    public Administrador[] listAdministrador(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Administrador[]) list.toArray(new Administrador[list.size()]);
    }
}

