/*
 * Copyright (C) 2020 Aptly GmbH
 */

package com.example.cakefactory.repository;

import com.example.cakefactory.model.Pastry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jose
 */

public interface PastryRepository extends JpaRepository<Pastry, Long> {
}
