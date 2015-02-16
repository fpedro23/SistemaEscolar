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

public class EventoCriteria extends AbstractORMCriteria {
    public final IntegerExpression idCircular;
    public final StringExpression titulo;
    public final StringExpression fecha;
    public final StringExpression contenido;
    public final TimeExpression hora;
    public final IntegerExpression administradoridAdministradorId;
    public final AssociationExpression administradoridAdministrador;

    public EventoCriteria(Criteria criteria) {
        super(criteria);
        idCircular = new IntegerExpression("idCircular", this);
        titulo = new StringExpression("titulo", this);
        fecha = new StringExpression("fecha", this);
        contenido = new StringExpression("contenido", this);
        hora = new TimeExpression("hora", this);
        administradoridAdministradorId = new IntegerExpression("administradoridAdministrador.idAdministrador", this);
        administradoridAdministrador = new AssociationExpression("administradoridAdministrador", this);
    }

    public EventoCriteria(PersistentSession session) {
        this(session.createCriteria(Evento.class));
    }

    public EventoCriteria() throws PersistentException {
        this(EscuelaPersistentManager.instance().getSession());
    }

    public AdministradorCriteria createAdministradoridAdministradorCriteria() {
        return new AdministradorCriteria(createCriteria("administradoridAdministrador"));
    }

    public Evento uniqueEvento() {
        return (Evento) super.uniqueResult();
    }

    public Evento[] listEvento() {
        java.util.List list = super.list();
        return (Evento[]) list.toArray(new Evento[list.size()]);
    }
}

