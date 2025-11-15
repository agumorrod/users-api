package es.module.users.api.model;

import es.module.users.api.model.audit.AuditModel;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "users")
@Getter
@Setter
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE item_id = ?")
@SQLRestriction("deleted = false")
// Si alguna entidad necesita ver también registros borrados, deberás usar un repositorio o un método con una query explícita.
@EqualsAndHashCode(callSuper = false)
public class Item extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long idItem;

    @Column(length = 4000)
    private String observations;

    private Double price;

    private Double priceSecondHand;
}
