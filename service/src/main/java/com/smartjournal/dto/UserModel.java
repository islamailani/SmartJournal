package com.smartjournal.dto;

import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by KarpukDM on 22.10.2016.
 */
@Entity
public class UserModel implements Serializable, Persistable<String> {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "workplace")
    private String workPlace;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "profession")
    private String profession;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AtomModel> atoms;

    @OneToMany(cascade = CascadeType.ALL)
    private List<JournalTemplateModel> templates;

    public UserModel(String name, String workPlace, String specialty, String profession) {
        this.name = name;
        this.workPlace = workPlace;
        this.specialty = specialty;
        this.profession = profession;
    }

    public UserModel() {
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AtomModel> getAtoms() {
        return atoms;
    }

    public void setAtoms(List<AtomModel> atoms) {
        this.atoms = atoms;
    }

    public List<JournalTemplateModel> getTemplates() {
        return templates;
    }

    public void setTemplates(List<JournalTemplateModel> templates) {
        this.templates = templates;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
