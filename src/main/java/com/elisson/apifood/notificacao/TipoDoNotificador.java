/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elisson.apifood.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author elisson
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
    NivelUrgencia value();
}
