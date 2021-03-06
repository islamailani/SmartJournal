package com.smartjournal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcademicPlan implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "currentLayerId")
    private Long currentLayerId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Lesson> lessons;

    @OneToOne(cascade = CascadeType.MERGE)
    private Discipline discipline;

    @OneToOne(cascade = CascadeType.ALL)
    private Layer layer;

}
