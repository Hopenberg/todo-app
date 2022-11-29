package io.hopenberg.apps.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "project_steps")
public class ProjectStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "The description cannot be empty")
    private String description;
    private Integer daysToDeadline;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public ProjectStep() {
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDaysToDeadline() {
        return daysToDeadline;
    }

    public void setDaysToDeadline(Integer daysToDeadline) {
        this.daysToDeadline = daysToDeadline;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
