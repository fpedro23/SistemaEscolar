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
package sistemaescolar.model;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CircularCriteria extends AbstractORMCriteria {
    public final IntegerExpression idCircular;
    public final StringExpression titulo;
    public final StringExpression fecha;
    public final StringExpression remitente;
    public final StringExpression contenido;

    public CircularCriteria(Criteria criteria) {
        super(criteria);
        idCircular = new IntegerExpression("idCircular", this);
        titulo = new StringExpression("titulo", this);
        fecha = new StringExpression("fecha", this);
        remitente = new StringExpression("remitente", this);
        contenido = new StringExpression("contenido", this);
    }

    public CircularCriteria(PersistentSession session) {
        this(session.createCriteria(Circular.class));
    }

    public CircularCriteria() throws PersistentException {
        this(EscuelaPersistentManager.instance().getSession());
    }

    public Circular uniqueCircular() {
        return (Circular) super.uniqueResult();
    }

    public Circular[] listCircular() {
        java.util.List list = super.list();
        return (Circular[]) list.toArray(new Circular[list.size()]);
    }
}

