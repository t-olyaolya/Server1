package com.clientserver;

import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main (String[] args) throws Exception {
        System.out.println("Initializing...");
       // System.setSecurityManager(new RMISecurityManager());
        Registry registry= LocateRegistry.createRegistry(1099);
        ServerInt serv = new Server();
        UnicastRemoteObject.unexportObject(serv,true);
        //ServerInt stub =
        //        (ServerInt) UnicastRemoteObject.exportObject(serv, 0);
        Remote stub=UnicastRemoteObject.exportObject(serv,0);
        registry.bind("Server1", stub);
        //LocateRegistry.createRegistry(1099);

        while (true) {
            Thread.sleep(Integer.MAX_VALUE);
        }

    }
}
