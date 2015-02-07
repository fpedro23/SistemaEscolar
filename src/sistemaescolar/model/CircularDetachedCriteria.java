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

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CircularDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression idCircular;
    public final StringExpression titulo;
    public final StringExpression fecha;
    public final StringExpression remitente;
    public final StringExpression contenido;

    public CircularDetachedCriteria() {
        super(Circular.class, CircularCriteria.class);
        idCircular = new IntegerExpression("idCircular", this.getDetachedCriteria());
        titulo = new StringExpression("titulo", this.getDetachedCriteria());
        fecha = new StringExpression("fecha", this.getDetachedCriteria());
        remitente = new StringExpression("remitente", this.getDetachedCriteria());
        contenido = new StringExpression("contenido", this.getDetachedCriteria());
    }

    public CircularDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, CircularCriteria.class);
        idCircular = new IntegerExpression("idCircular", this.getDetachedCriteria());
        titulo = new StringExpression("titulo", this.getDetachedCriteria());
        fecha = new StringExpression("fecha", this.getDetachedCriteria());
        remitente = new StringExpression("remitente", this.getDetachedCriteria());
        contenido = new StringExpression("contenido", this.getDetachedCriteria());
    }

    public Circular uniqueCircular(PersistentSession session) {
        return (Circular) super.createExecutableCriteria(session).uniqueResult();
    }

    public Circular[] listCircular(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Circular[]) list.toArray(new Circular[list.size()]);
    }
}

