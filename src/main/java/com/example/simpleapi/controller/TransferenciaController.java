package com.example.simpleapi.controller;


import com.example.simpleapi.model.Transferencia;
import com.example.simpleapi.service.TransferenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/transferencias")
@CrossOrigin(origins = "http://localhost:4200", exposedHeaders = "Access-Control-Allow-Origin")
public class TransferenciaController {

    private TransferenciaService service;


    public TransferenciaController(TransferenciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transferencia> listAll(){
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<Transferencia> insert(@RequestBody Transferencia transferencia){
        service.insert(transferencia);
        return ResponseEntity.created(URI.create("/transferencias"+transferencia.getId())).body(transferencia);
    }
}
