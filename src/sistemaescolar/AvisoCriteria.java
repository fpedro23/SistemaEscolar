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

public class AvisoCriteria extends AbstractORMCriteria {
    public final IntegerExpression idCircular;
    public final StringExpression titulo;
    public final StringExpression fecha;
    public final StringExpression contenido;
    public final IntegerExpression administradoridAdministradorId;
    public final AssociationExpression administradoridAdministrador;

    public AvisoCriteria(Criteria criteria) {
        super(criteria);
        idCircular = new IntegerExpression("idCircular", this);
        titulo = new StringExpression("titulo", this);
        fecha = new StringExpression("fecha", this);
        contenido = new StringExpression("contenido", this);
        administradoridAdministradorId = new IntegerExpression("administradoridAdministrador.idAdministrador", this);
        administradoridAdministrador = new AssociationExpression("administradoridAdministrador", this);
    }

    public AvisoCriteria(PersistentSession session) {
        this(session.createCriteria(Aviso.class));
    }

    public AvisoCriteria() throws PersistentException {
        this(EscuelaPersistentManager.instance().getSession());
    }

    public AdministradorCriteria createAdministradoridAdministradorCriteria() {
        return new AdministradorCriteria(createCriteria("administradoridAdministrador"));
    }

    public Aviso uniqueAviso() {
        return (Aviso) super.uniqueResult();
    }

    public Aviso[] listAviso() {
        java.util.List list = super.list();
        return (Aviso[]) list.toArray(new Aviso[list.size()]);
    }
}

