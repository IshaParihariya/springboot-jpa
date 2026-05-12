package com.isha.springbootjpa1.service;

import com.isha.springbootjpa1.entity.Vaccine;

public interface IVaccineService
{
    public String registerVaccineInfo(Vaccine vaccine);

    /*

    Iterable<> :
    It is a parent interface of:
    List
    Set
    Queue
    So using Iterable makes the method flexible.
     */

    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccines);

    public Long vaccineCount();

    public Boolean checkAvailibiltyOfVaccineById(Integer id);
}
