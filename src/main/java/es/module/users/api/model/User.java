package es.module.users.api.model;

import es.module.users.api.model.audit.AuditExtendsModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Getter
@Setter
@Entity
@Table(name = "users")
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE user_id = ?")
@SQLRestriction("deleted = false")
public class User extends AuditExtendsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long idUser;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;
}

