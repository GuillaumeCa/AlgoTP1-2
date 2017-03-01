package com.isep.algo.tp2.payment;

/**
 * Created by Guillaume on 01/03/2017.
 */
public class PaymentContext {
    private State state;

    public PaymentContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextStep() {
        state.nextStep(this);
    }

}
