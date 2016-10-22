package com.clientserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

/**
 * Created by tyuly on 22.10.2016.
 */
public class Server extends UnicastRemoteObject implements ServerInt {

    Server() throws RemoteException {
        super();
    }

    @Override
    public int addition(int a, int b) throws RemoteException {
        int c = a + b;
        return c;
    }

    @Override
    public int median(int[] a) throws RemoteException {
        Arrays.sort(a);
        int c = a[(a.length / 2)];
        return c;
    }

    @Override
    public int [][] multiplication(int[][] a, int[][] b) throws RemoteException {
        int l_a = a.length;
        int l_b0 = b[0].length;
        int l_b = b.length;
        int[][] result = new int[l_a][l_b0];
        for (int i = 0; i < l_a; i++) {
            for (int j = 0; j < l_b0; j++) {
                for (int k = 0; k < l_b; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }


            return result;
        }

}
