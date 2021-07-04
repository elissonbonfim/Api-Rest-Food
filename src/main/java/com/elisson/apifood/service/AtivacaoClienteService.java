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
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 *
 * @author elisson
 */
@Component
public class AtivacaoClienteService {

//    @TipoDoNotificador(NivelUrgencia.CRITICO)
//    @Autowired
//    private Notificador notificador;
    
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    
    public void ativar(Cliente cliente) {
        cliente.ativar();

        eventPublisher.publishEvent(new ClientAtivadoEvent(cliente));
        
//        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
