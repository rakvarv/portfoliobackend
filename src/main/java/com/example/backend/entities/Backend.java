package com.example.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name="BACKEND")
public class Backend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="PROJECTNAME")
    private String projectName;

    @Column(name="COLLABORATORS")
    private String collaborators;

    @Column(name="DESCRIPTION")
    private String description;

    public Backend() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(String collaborators) {
        this.collaborators = collaborators;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
