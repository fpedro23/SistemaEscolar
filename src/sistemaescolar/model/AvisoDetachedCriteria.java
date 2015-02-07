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

public class AvisoDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression idCircular;
    public final StringExpression titulo;
    public final StringExpression fecha;
    public final StringExpression remitente;
    public final StringExpression contenido;

    public AvisoDetachedCriteria() {
        super(Aviso.class, AvisoCriteria.class);
        idCircular = new IntegerExpression("idCircular", this.getDetachedCriteria());
        titulo = new StringExpression("titulo", this.getDetachedCriteria());
        fecha = new StringExpression("fecha", this.getDetachedCriteria());
        remitente = new StringExpression("remitente", this.getDetachedCriteria());
        contenido = new StringExpression("contenido", this.getDetachedCriteria());
    }

    public AvisoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, AvisoCriteria.class);
        idCircular = new IntegerExpression("idCircular", this.getDetachedCriteria());
        titulo = new StringExpression("titulo", this.getDetachedCriteria());
        fecha = new StringExpression("fecha", this.getDetachedCriteria());
        remitente = new StringExpression("remitente", this.getDetachedCriteria());
        contenido = new StringExpression("contenido", this.getDetachedCriteria());
    }

    public Aviso uniqueAviso(PersistentSession session) {
        return (Aviso) super.createExecutableCriteria(session).uniqueResult();
    }

    public Aviso[] listAviso(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Aviso[]) list.toArray(new Aviso[list.size()]);
    }
}

