/*
 * Copyright (C) 2020 Aptly GmbH
 */

package com.example.cakefactory.service;

import com.example.cakefactory.model.Pastry;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jose
 */
@Service
public class PastryServiceImpl implements PastryService {
    public static List<Pastry> pastries = List.of(
            new Pastry(1, "Alexandertorte", "Alexandertorte.jpg"),
            new Pastry(2, "Alfajor", "Alfajor.jpg"),
            new Pastry(3, "Aloo pie", "Aloo_Pie.jpg")
            );
    @Override
    public List<Pastry> findAll() {
        return pastries;
    }
}
