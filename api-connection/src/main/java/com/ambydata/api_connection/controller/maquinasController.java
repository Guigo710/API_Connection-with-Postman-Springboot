package com.ambydata.api_connection.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ambydata.api_connection.model.MaquinasModel;
import com.ambydata.api_connection.service.MaquinasService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value ="/maquinas")
public class maquinasController {
    @Autowired
    MaquinasService maquinasService;

    @GetMapping
    public List<MaquinasModel>listar(){
        return maquinasService.listarTodos();
    }
    
    @PostMapping
    public MaquinasModel criar (@RequestBody MaquinasModel maquinas){
        return maquinasService.salvar(maquinas);
    
    }

    @PutMapping("/{id}")
        public MaquinasModel atualizar(
            @RequestBody MaquinasModel maquinas,
            @PathVariable Integer id) {
                return maquinasService.atualizar(id,maquinas);
            }
 
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        maquinasService.deletar(id);
     }
 }