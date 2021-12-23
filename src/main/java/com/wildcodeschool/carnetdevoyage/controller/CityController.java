package com.wildcodeschool.carnetdevoyage.controller;

import com.wildcodeschool.carnetdevoyage.entity.City;
import com.wildcodeschool.carnetdevoyage.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CityController extends AbstractCrudIntegerController{

    @Autowired
    private CityRepository cityRepository;

    @Override
    protected JpaRepository getRepository() {
        return cityRepository;
    }

    @Override
    protected String getControllerRoute() {
        return "cities";
    }

    @Override
    protected String[] getElementFields() {
        return new String[]{"name", "stopDate", "summary"};
    }

    @Override
    protected Class getElementClass() {
        return City.class;
    }
}
