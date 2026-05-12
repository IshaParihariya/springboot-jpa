package com.isha.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Alien
{
    @Id
    private Integer id;

    private String name;

    private String city;

    // zero param constructor
    public Alien()
    {
        System.out.println("zero param constructor of Alien");
    }
    // param constructor of Alien
    public Alien(int id, String name, String city)
    {
        System.out.println(" param constructor of Alien");
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }

    public Integer getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getNmae()
    {
        return name;
    }

    public void setId(String city)
    {
        this.city=city;
    }

    public String getCity()
    {
        return city;
    }

    public String toString()
    {
        return "id =" +id +" name = "+name+" city = "+city+" ";
    }
}
