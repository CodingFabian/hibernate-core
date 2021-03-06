package org.hibernate.envers.test.integration.inheritance.mixed.entities;

import org.hibernate.envers.Audited;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Audited
@Entity
@DiscriminatorValue(value = "NORMAL")
public class NormalActivity extends AbstractActivity {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NormalActivity)) {
            return false;
        }
        NormalActivity normalActivity = (NormalActivity) obj;
        return getId().equals(normalActivity.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
