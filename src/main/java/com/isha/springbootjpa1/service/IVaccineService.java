package com.isha.springbootjpa1.service;

import com.isha.springbootjpa1.entity.Vaccine;

import java.util.Optional;

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


    /*
    NOTE : Optional<>
  Optional<T> is a class in the java.util package that is used
  to store a value that may or may not be present,
  helping avoid NullPointerException.
     */
    public Optional<Vaccine> getVaccineById(Integer id);

   // to delete vaccine by id
    public String deleteVaccineById(Integer id);

    //delete with Vaccine object
    public String deleteVaccineByObject(Vaccine obj);

}
