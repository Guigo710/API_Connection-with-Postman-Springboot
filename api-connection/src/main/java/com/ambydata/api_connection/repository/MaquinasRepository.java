package com.ambydata.api_connection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambydata.api_connection.model.MaquinasModel;

public interface MaquinasRepository extends JpaRepository<MaquinasModel, Integer>{
    
}
