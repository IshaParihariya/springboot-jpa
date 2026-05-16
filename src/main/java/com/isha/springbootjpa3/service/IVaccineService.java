package com.isha.springbootjpa3.service;

import com.isha.springbootjpa3.entity.Vaccine;

import java.util.List;

public interface IVaccineService
{

    public Vaccine searchVaccineById(Integer id);

    // note : for jpa always List<>
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac);

    // to remove vaccineIndo by id
   public String removeVaccineInfoByIds(Iterable<Integer> ids);
}