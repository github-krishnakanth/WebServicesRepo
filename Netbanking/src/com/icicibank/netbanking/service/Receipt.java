// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.icicibank.netbanking.service;


public class Receipt {
    protected java.lang.String transactionNo;
    protected java.lang.String status;
    
    public Receipt() {
    }
    
    public Receipt(java.lang.String transactionNo, java.lang.String status) {
        this.transactionNo = transactionNo;
        this.status = status;
    }
    
    public java.lang.String getTransactionNo() {
        return transactionNo;
    }
    
    public void setTransactionNo(java.lang.String transactionNo) {
        this.transactionNo = transactionNo;
    }
    
    public java.lang.String getStatus() {
        return status;
    }
    
    public void setStatus(java.lang.String status) {
        this.status = status;
    }
}
