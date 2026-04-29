package com.isha.springbootjpa.controller;

import com.isha.springbootjpa.service.Logic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// JPA (Java Persistence API) is a way (set of rules) in Java to store and fetch data
// from a database using objects instead of writing SQL manually.
@Controller
public class MyController
{
    @Autowired
    private Logic logic;

    public String logic()
    {
        return logic.logic();
    }
}
