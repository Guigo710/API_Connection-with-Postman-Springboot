package com.ambydata.api_connection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambydata.api_connection.model.MaquinasModel;
import com.ambydata.api_connection.repository.MaquinasRepository;

@Service
public class MaquinasService {
    @Autowired
    private MaquinasRepository maquinasRepository;

    public List<MaquinasModel>listarTodos(){
       return maquinasRepository.findAll();
    }

    public MaquinasModel salvar(MaquinasModel maquinas) {
        return maquinasRepository.save(maquinas);
    }

    
    public MaquinasModel buscarPorId(Integer id) {
        return maquinasRepository.findById(id).orElse(null);
    }

    
    public MaquinasModel atualizar(Integer id, MaquinasModel maquinaNovo) {

        MaquinasModel maquinasExistente = buscarPorId(id);

        maquinasExistente.setNome(maquinaNovo.getNome());
        maquinasExistente.setSetor(maquinaNovo.getSetor());
        maquinasExistente.setTipo(maquinaNovo.gettipo());

        return maquinasRepository.save(maquinasExistente);
    }

    //DELETAR
    public void deletar(Integer id) {
    maquinasRepository.deleteById(id);
}
}