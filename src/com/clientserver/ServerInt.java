package com.clientserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by tyuly on 22.10.2016.
 */
public interface ServerInt extends Remote {
    int addition(int a, int b) throws RemoteException;
    int median(int [] a) throws RemoteException;
    int [][] multiplication(int [][]a,int [][]b ) throws RemoteException;

}
