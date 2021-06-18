/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.config;

import com.elisson.apifood.notificacao.Notificador;
import com.elisson.apifood.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author elisson
 */
@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
}
