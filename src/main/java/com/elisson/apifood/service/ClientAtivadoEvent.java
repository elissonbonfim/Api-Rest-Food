/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.service;

import com.elisson.apifood.modelo.Cliente;

/**
 *
 * @author elisson
 */
public class ClientAtivadoEvent {
    
    private Cliente cliente;

    public ClientAtivadoEvent(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}
