// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.axisbank.netbanking.service;

public interface FundsTransfer extends java.rmi.Remote {
    public com.axisbank.netbanking.service.Receipt neft(com.axisbank.netbanking.service.Account fromAc, com.axisbank.netbanking.service.Account toAc, com.axisbank.netbanking.service.NeftDetails neftDetails) throws 
         java.rmi.RemoteException;
}
