package com.wildcodeschool.carnetdevoyage.controller;

import com.wildcodeschool.carnetdevoyage.entity.Link;
import com.wildcodeschool.carnetdevoyage.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/links")
public class LinkController extends AbstractCrudIntegerController{

    @Autowired
    private LinkRepository linkRepository;

    @Override
    protected JpaRepository getRepository() {
        return linkRepository;
    }

    @Override
    protected String getControllerRoute() {
        return "links";
    }

    @Override
    protected String[] getElementFields() {
        return new String[] {"name", "link", "description"};
    }

    @Override
    protected Class getElementClass() {
        return Link.class;
    }
}
