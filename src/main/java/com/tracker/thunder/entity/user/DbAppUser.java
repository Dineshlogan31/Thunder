package com.tracker.thunder.entity.user;

import com.tracker.thunder.entity.base.DbBaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "db_app_user", uniqueConstraints = @UniqueConstraint(columnNames = {"email"}))
public class DbAppUser extends DbBaseEntity {

    @Id
    @Column(name = "user_id", nullable = false, length = 200)
    private String userId;
    @Column(name = "first_name", nullable = false, length = 25)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;
    @Column(name = "password_hash", nullable = true, length = 50)
    private String passwordHash;
    @Column(name = "email", nullable = false, length = 30)
    private String email;
    @Column(name = "contact_number", nullable = false, length = 15)
    private String contactNumber;
    @Column(name = "user_role", nullable = false, length = 10)
    private String userRole;
    @Column(name = "active", nullable = false)
    private boolean active;
    @Column(name = "gender",nullable = false, length = 10)
    private String gender;



}
