/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.service;

import com.elisson.apifood.modelo.Cliente;
import com.elisson.apifood.notificacao.NivelUrgencia;
import com.elisson.apifood.notificacao.Notificador;
import com.elisson.apifood.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author elisson
 */
@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.CRITICO)
    @Autowired
    private Notificador notificador;

//    @Autowired
//    public AtivacaoClienteService(Notificador notificador) {
//        this.notificador = notificador;
//    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
