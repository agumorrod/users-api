package es.module.users.api.model;

import es.module.users.api.model.audit.AuditModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends AuditModel {
    private String campo1;
    private String campo2;
}
