package com.isha.springbootjpa2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // automatically generated the ids
    private Integer id;

    private String vaccineName;

    private String vaccineCompany;

    private Double cost;

    // Zero Param Constructor
    public Vaccine()
    {
        System.out.println("zero param constructor for Vaccine");
    }

    // Param Constructor
    public Vaccine( String vaccineName, String vaccineCompany, Double cost)
    {
        System.out.println("param constructor for Vaccine");
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.cost = cost;
    }

    // Getters

    public Integer getId()
    {
        return id;
    }

    public String getVaccineName()
    {
        return vaccineName;
    }

    public String getVaccineCompany()
    {
        return vaccineCompany;
    }

    public Double getCost()
    {
        return cost;
    }

    // Setters

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setVaccineName(String vaccineName)
    {
        this.vaccineName = vaccineName;
    }

    public void setVaccineCompany(String vaccineCompany)
    {
        this.vaccineCompany = vaccineCompany;
    }

    public void setCost(Double cost)
    {
        this.cost = cost;
    }

    // toString Method
    @Override
    public String toString()
    {
        return "Vaccine{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCompany='" + vaccineCompany + '\'' +
                ", cost=" + cost +
                '}';
    }
}
