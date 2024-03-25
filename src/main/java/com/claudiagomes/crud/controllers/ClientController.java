package com.claudiagomes.crud.controllers;

import com.claudiagomes.crud.dto.ClientDTO;
import com.claudiagomes.crud.entities.Client;
import com.claudiagomes.crud.repositories.ClientRepository;
import com.claudiagomes.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
       ClientDTO dto = service.findById(id);
        return dto;
}
}
