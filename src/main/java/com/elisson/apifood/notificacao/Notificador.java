/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.notificacao;

import com.elisson.apifood.modelo.Cliente;

/**
 *
 * @author elisson
 */
public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
    
}
