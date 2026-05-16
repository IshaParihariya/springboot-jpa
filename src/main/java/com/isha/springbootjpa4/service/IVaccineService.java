package com.isha.springbootjpa4.service;

import com.isha.springbootjpa4.entity.Vaccine;
import com.isha.springbootjpa4.view.ResultView;

import java.util.List;

public interface IVaccineService
{
    //for fetching fields using the cost
    List<ResultView> findByCost(Double cost);
}