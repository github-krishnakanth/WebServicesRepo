// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.icicibank.netbanking.service;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class FundsTransfer_neft_RequestStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private com.icicibank.netbanking.service.FundsTransfer_neft_RequestStruct _instance;
    private com.icicibank.netbanking.service.Account fromAc;
    private com.icicibank.netbanking.service.Account toAc;
    private com.icicibank.netbanking.service.NeftDetails neftDetails;
    private static final int myFROMAC_INDEX = 0;
    private static final int myTOAC_INDEX = 1;
    private static final int myNEFTDETAILS_INDEX = 2;
    
    public FundsTransfer_neft_RequestStruct_SOAPBuilder() {
    }
    
    public void setFromAc(com.icicibank.netbanking.service.Account fromAc) {
        this.fromAc = fromAc;
    }
    
    public void setToAc(com.icicibank.netbanking.service.Account toAc) {
        this.toAc = toAc;
    }
    
    public void setNeftDetails(com.icicibank.netbanking.service.NeftDetails neftDetails) {
        this.neftDetails = neftDetails;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myFROMAC_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myTOAC_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myNEFTDETAILS_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myFROMAC_INDEX:
                    _instance.setFromAc((com.icicibank.netbanking.service.Account)memberValue);
                    break;
                case myTOAC_INDEX:
                    _instance.setToAc((com.icicibank.netbanking.service.Account)memberValue);
                    break;
                case myNEFTDETAILS_INDEX:
                    _instance.setNeftDetails((com.icicibank.netbanking.service.NeftDetails)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (com.icicibank.netbanking.service.FundsTransfer_neft_RequestStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
