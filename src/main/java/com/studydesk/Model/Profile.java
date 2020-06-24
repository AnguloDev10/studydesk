package com.studydesk.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "profiles")
@Getter
@Setter
public class Profile extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max=30)
    private  String name;

    @NotNull
    @NotBlank
    @Size(max = 30)
    private  String sex;

    @NotNull
    @NotBlank
    @Size(max=30)
    private String FirstName;

    @NotNull
    @NotBlank
    @Size(max=30)
    private String LastName;


    @OneToOne(mappedBy = "user")
    private User user;



}
