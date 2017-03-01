package com.isep.algo.tp2.payment;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class PayTest {
    public static void main(String[] args) {
        PaymentContext ctx = new PaymentContext(new SelectCardState());
        ctx.nextStep();
        ctx.nextStep();
        ctx.nextStep();
    }
}
