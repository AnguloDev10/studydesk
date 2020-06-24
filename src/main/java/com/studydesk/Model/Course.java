package com.studydesk.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="course")
@Getter
@Setter
public class Course extends  AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotNull
    @NotBlank
    @Size(max=100)
    @Column(unique = true)
    private String title;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            mappedBy = "course")///ve a posts tags y ahi esta la info, solo configuracion en la parte de muchos
    @JsonIgnore
    private List<Career> careers;

    @Override
    public void setUser(User user) {

    }
}
