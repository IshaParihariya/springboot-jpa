package com.isha.springbootjpa5.service;
import com.isha.springbootjpa5.repo.IVaccineRepo;
import com.isha.springbootjpa5.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService {
    @Autowired
    private IVaccineRepo repo;

}
