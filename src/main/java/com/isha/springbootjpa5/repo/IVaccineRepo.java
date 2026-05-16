package com.isha.springbootjpa5.repo;

import com.isha.springbootjpa5.entity.Vaccine;
import com.isha.springbootjpa5.view.ResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine,Integer> {


}