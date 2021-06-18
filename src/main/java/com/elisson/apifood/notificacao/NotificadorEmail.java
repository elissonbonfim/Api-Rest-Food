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
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }

}
