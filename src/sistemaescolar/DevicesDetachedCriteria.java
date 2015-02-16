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

public class DevicesDetachedCriteria extends AbstractORMDetachedCriteria {
    public final IntegerExpression idDevice;
    public final StringExpression UDUID;

    public DevicesDetachedCriteria() {
        super(Devices.class, DevicesCriteria.class);
        idDevice = new IntegerExpression("idDevice", this.getDetachedCriteria());
        UDUID = new StringExpression("UDUID", this.getDetachedCriteria());
    }

    public DevicesDetachedCriteria(DetachedCriteria aDetachedCriteria) {
        super(aDetachedCriteria, DevicesCriteria.class);
        idDevice = new IntegerExpression("idDevice", this.getDetachedCriteria());
        UDUID = new StringExpression("UDUID", this.getDetachedCriteria());
    }

    public Devices uniqueDevices(PersistentSession session) {
        return (Devices) super.createExecutableCriteria(session).uniqueResult();
    }

    public Devices[] listDevices(PersistentSession session) {
        List list = super.createExecutableCriteria(session).list();
        return (Devices[]) list.toArray(new Devices[list.size()]);
    }
}

