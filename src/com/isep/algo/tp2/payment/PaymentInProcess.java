package com.isep.algo.tp2.payment;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class PaymentInProcess implements State {
    @Override
    public void nextStep(PaymentContext ctx) {
        ctx.setState(new PaymentFinished());
    }
}
