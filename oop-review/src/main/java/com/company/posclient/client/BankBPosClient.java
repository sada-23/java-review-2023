package com.company.posclient.client;


import com.company.model.pos.PosClientRequest;
import com.company.model.pos.PosClientResponse;
import com.company.posclient.AbstractPosClient;

public class BankBPosClient extends AbstractPosClient {

    // return dummy response
    @Override
    public PosClientResponse auth(PosClientRequest posClientRequest) {
        return new PosClientResponse(1, null, posClientRequest.getRequestedAmount());
    }

    // return dummy response
    @Override
    public PosClientResponse auth3D(PosClientRequest posClientRequest) {
        return new PosClientResponse(0, "1345", posClientRequest.getRequestedAmount());
    }
}
