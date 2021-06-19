/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.controller;

import com.elisson.apifood.modelo.Cliente;
import com.elisson.apifood.service.AtivacaoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author elisson
 */
@RestController
@RequestMapping(value = "/teste")
public class Controller {

    private AtivacaoClienteService ativacaoClienteService;

    @Autowired
    public Controller(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    public Cliente hello() {
        Cliente elisson = new Cliente("Elisson", "elisson100@outlook.com", "77991164192");

        ativacaoClienteService.ativar(elisson);
        return elisson;
    }
}
