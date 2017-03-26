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
public class Journal implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "journal_name")
    private String journalName;

    @OneToOne(cascade = CascadeType.ALL)
    private Layer layer;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Account> accounts;

    @ManyToOne(cascade = CascadeType.ALL)
    private Discipline discipline;
}
