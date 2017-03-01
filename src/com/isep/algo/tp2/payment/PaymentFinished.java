package com.isep.algo.tp2.payment;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class PaymentFinished implements State {
    @Override
    public void nextStep(PaymentContext ctx) {
        System.out.println("The payment is done");
    }
}
