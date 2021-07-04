/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.listener;

import com.elisson.apifood.notificacao.NivelUrgencia;
import com.elisson.apifood.notificacao.Notificador;
import com.elisson.apifood.notificacao.TipoDoNotificador;
import com.elisson.apifood.service.ClientAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author elisson
 */
@Component
public class NotificacaoService {
    
    @TipoDoNotificador(NivelUrgencia.CRITICO)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clientAtivadoListener(ClientAtivadoEvent event) {
        
        notificador.notificar(event.getCliente(), "O cadastro de " + event.getCliente().getNome() + " está ativo!");
        
    }
}
