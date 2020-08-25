/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.electricalbah.core.logic;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.ejb.Stateless;

/**
 *
 * @author electricalbah
 */
@Stateless
public class IndexLogic {

    public String getHostname() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

    public String getIpAddress() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

}
