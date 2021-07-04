/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.notificacao;

import com.elisson.apifood.modelo.Cliente;
import org.springframework.stereotype.Component;

/**
 *
 * @author elisson
 */
@TipoDoNotificador(NivelUrgencia.CRITICO )
@Component
public class NotificadorSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
