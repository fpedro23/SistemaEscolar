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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorCriteria extends AbstractORMCriteria {
    public final IntegerExpression idAdministrador;
    public final StringExpression nombreAdministrador;
    public final StringExpression password;
    public final CollectionExpression circular;
    public final CollectionExpression aviso;
    public final CollectionExpression evento;

    public AdministradorCriteria(Criteria criteria) {
        super(criteria);
        idAdministrador = new IntegerExpression("idAdministrador", this);
        nombreAdministrador = new StringExpression("nombreAdministrador", this);
        password = new StringExpression("password", this);
        circular = new CollectionExpression("ORM_Circular", this);
        aviso = new CollectionExpression("ORM_Aviso", this);
        evento = new CollectionExpression("ORM_Evento", this);
    }

    public AdministradorCriteria(PersistentSession session) {
        this(session.createCriteria(Administrador.class));
    }

    public AdministradorCriteria() throws PersistentException {
        this(EscuelaPersistentManager.instance().getSession());
    }

    public CircularCriteria createCircularCriteria() {
        return new CircularCriteria(createCriteria("ORM_Circular"));
    }

    public AvisoCriteria createAvisoCriteria() {
        return new AvisoCriteria(createCriteria("ORM_Aviso"));
    }

    public EventoCriteria createEventoCriteria() {
        return new EventoCriteria(createCriteria("ORM_Evento"));
    }

    public Administrador uniqueAdministrador() {
        return (Administrador) super.uniqueResult();
    }

    public Administrador[] listAdministrador() {
        java.util.List list = super.list();
        return (Administrador[]) list.toArray(new Administrador[list.size()]);
    }
}

