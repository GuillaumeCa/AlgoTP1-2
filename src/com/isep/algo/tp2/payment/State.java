package com.isep.algo.tp2.payment;

/**
 * Created by Guillaume on 01/03/2017.
 */
public interface State {
    void nextStep(PaymentContext ctx);
}
