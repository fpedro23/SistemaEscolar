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

public class AlumnoCriteria extends AbstractORMCriteria {
    public final IntegerExpression idAlumno;
    public final StringExpression nombreAlumno;
    public final StringExpression passwordAlumno;

    public AlumnoCriteria(Criteria criteria) {
        super(criteria);
        idAlumno = new IntegerExpression("idAlumno", this);
        nombreAlumno = new StringExpression("nombreAlumno", this);
        passwordAlumno = new StringExpression("passwordAlumno", this);
    }

    public AlumnoCriteria(PersistentSession session) {
        this(session.createCriteria(Alumno.class));
    }

    public AlumnoCriteria() throws PersistentException {
        this(EscuelaPersistentManager.instance().getSession());
    }

    public Alumno uniqueAlumno() {
        return (Alumno) super.uniqueResult();
    }

    public Alumno[] listAlumno() {
        java.util.List list = super.list();
        return (Alumno[]) list.toArray(new Alumno[list.size()]);
    }
}

