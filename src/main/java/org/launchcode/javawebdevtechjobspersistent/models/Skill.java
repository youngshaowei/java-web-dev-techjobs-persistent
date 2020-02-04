package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=255, message="Description too long!")
    public String description;

    @ManyToMany(mappedBy="skills")
    public List<Job> jobs = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public Skill() {
    }

    public void setDescription(String description) {
        this.description = description;
    }
}