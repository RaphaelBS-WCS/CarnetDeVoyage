package com.wildcodeschool.carnetdevoyage.controller;


import com.wildcodeschool.carnetdevoyage.entity.Journey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.wildcodeschool.carnetdevoyage.repository.JourneyRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/journeys")
public class JourneyController extends AbstractCrudIntegerController{

    @Autowired
    private JourneyRepository journeyRepository;


    @Override
    protected JpaRepository getRepository() {
        return journeyRepository;
    }

    @Override
    protected String getControllerRoute() {
        return "journeys";
    }

    @Override
    protected String[] getElementFields() {
        return new String[] {"country", "jStart", "jEnd"};
    }

    @Override
    protected Class getElementClass() {
        return Journey.class;
    }
}
