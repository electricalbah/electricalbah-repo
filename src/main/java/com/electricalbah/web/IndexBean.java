/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.electricalbah.web;

import com.electricalbah.core.logic.IndexLogic;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author electricalbah
 */
@Named
@ViewScoped
public class IndexBean implements Serializable {

    private static final long serialVersionUID = 1L;


    @Inject
    private IndexLogic indexLogic;

    @PostConstruct
    public void IndexBean() {
    }

    public String getHostname() throws UnknownHostException {
        return this.indexLogic.getHostname();
    }

    public String getIpAddress() throws UnknownHostException {
        return this.indexLogic.getIpAddress();
    }

    public void wiring() {
    }

}
