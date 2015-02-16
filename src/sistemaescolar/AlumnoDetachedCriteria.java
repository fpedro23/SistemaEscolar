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

public class AlumnoDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression idAlumno;
    public final StringExpression nombreAlumno;
    public final StringExpression passwordAlumno;

    public AlumnoDetachedCriteria() {
        super(Alumno.class, AlumnoCriteria.class);
        idAlumno = new IntegerExpression("idAlumno", this.getDetachedCriteria());
        nombreAlumno = new StringExpression("nombreAlumno", this.getDetachedCriteria());
        passwordAlumno = new StringExpression("passwordAlumno", this.getDetachedCriteria());
    }

    public AlumnoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, AlumnoCriteria.class);
        idAlumno = new IntegerExpression("idAlumno", this.getDetachedCriteria());
        nombreAlumno = new StringExpression("nombreAlumno", this.getDetachedCriteria());
        passwordAlumno = new StringExpression("passwordAlumno", this.getDetachedCriteria());
    }

    public Alumno uniqueAlumno(PersistentSession session) {
        return (Alumno) super.createExecutableCriteria(session).uniqueResult();
    }

    public Alumno[] listAlumno(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Alumno[]) list.toArray(new Alumno[list.size()]);
    }
}

