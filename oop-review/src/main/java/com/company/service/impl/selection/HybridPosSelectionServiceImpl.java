package com.company.service.impl.selection;


import com.company.model.payment.AuthRequest;
import com.company.model.pos.Pos;
import com.company.service.PosSelectionService;

import static com.company.constant.StaticConstants.POS_LIST;

public class HybridPosSelectionServiceImpl implements PosSelectionService {

    @Override
    //Since there is no cost calculation among hybrid pos,
    // we are trying to find the pos that the merchant wants the payment to be made.
    public Pos decidePaymentPos(AuthRequest authRequest) {
        return POS_LIST.stream().
                filter(pos -> authRequest.getPosName().equals(pos.getName())).findFirst().orElse(POS_LIST.get(0));
    }
}
