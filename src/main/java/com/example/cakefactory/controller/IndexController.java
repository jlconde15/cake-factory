package com.example.cakefactory.controller;

import com.example.cakefactory.service.PastryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author jose
 */

@Controller
public class IndexController  {

    @Autowired
    private PastryService pastryService;

    @GetMapping("/")
    public ModelAndView index(Map<String, Object> model) {
        model.put("pastries", pastryService.findAll());
        return new ModelAndView("index", model);
    }
}
