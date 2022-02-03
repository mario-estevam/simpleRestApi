package com.example.simpleapi.service;


import com.example.simpleapi.model.Transferencia;
import com.example.simpleapi.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    private TransferenciaRepository transferenciaRepository;

    @Autowired
    private void setTransferenciaRepository(TransferenciaRepository repository){
        this.transferenciaRepository = repository;
    }

    public Transferencia insert(Transferencia transferencia){
        return transferenciaRepository.save(transferencia);
    }

    public List<Transferencia> getAll(){
        return transferenciaRepository.findAll();
    }

}
