package com.isha.springbootjpa;

import com.isha.springbootjpa.entity.Alien;
import com.isha.springbootjpa.repo.IAleinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

/*
CommandLineRunner in Spring Boot is an interface that lets you run code automatically
after the Spring application starts.

Spring Boot:
Starts the application
Creates all beans
Connects database
Then calls the run() method of CommandLineRunner

That’s why this code executes automatically
 */
@Controller
public class JPARunner implements CommandLineRunner
{
    @Autowired
    private IAleinRepo iAleinRepo;

    @Override
    public void run(String... args) throws Exception
    {
        // updation or insertion of the data
      iAleinRepo.save(new Alien(1,"Isha","Jaipur"));
    }

}
