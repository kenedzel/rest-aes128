package com.encrypt.demo.demoencrypt.model;

public class PaymentFeedbackList {

    private PaymentFeedbackItem paymentFeedbackItem;

    public PaymentFeedbackItem getPaymentFeedbackItem() {
        return paymentFeedbackItem;
    }

    public void setPaymentFeedbackItem(PaymentFeedbackItem paymentFeedbackItem) {
        this.paymentFeedbackItem = paymentFeedbackItem;
    }

    @Override
    public String toString() {
        return "PaymentFeedbackList{" +
                "paymentFeedbackItem=" + paymentFeedbackItem +
                '}';
    }
}
