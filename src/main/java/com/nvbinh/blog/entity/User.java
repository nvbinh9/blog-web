package com.nvbinh.blog.entity;

import com.nvbinh.blog.entity.audit.UserDateAudit;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "role")
    private String role;
}
