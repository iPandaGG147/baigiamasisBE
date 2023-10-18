package com.baigiamasis.gytis.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "position")

public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String jobType;
    private double salary;
    private String hours;
    private String requirements;
    private String sector;

    public Positions() {
    }

    //<editor-fold desc="getter setter">
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    //</editor-fold>

}
