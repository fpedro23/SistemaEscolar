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

public class DevicesCriteria extends AbstractORMCriteria {
    public final IntegerExpression idDevice;
    public final StringExpression UDUID;

    public DevicesCriteria(Criteria criteria) {
        super(criteria);
        idDevice = new IntegerExpression("idDevice", this);
        UDUID = new StringExpression("UDUID", this);
    }

    public DevicesCriteria(PersistentSession session) {
        this(session.createCriteria(Devices.class));
    }

    public DevicesCriteria() throws PersistentException {
        this(EscuelaPersistentManager.instance().getSession());
    }

    public Devices uniqueDevices() {
        return (Devices) super.uniqueResult();
    }

    public Devices[] listDevices() {
        java.util.List list = super.list();
        return (Devices[]) list.toArray(new Devices[list.size()]);
    }
}

