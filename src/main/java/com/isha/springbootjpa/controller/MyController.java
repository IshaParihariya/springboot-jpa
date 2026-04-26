package com.isha.springbootjpa.controller;

import com.isha.springbootjpa.service.Logic;
import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    private Logic logic;

    public String logic()
    {
        return logic.logic();
    }
}
