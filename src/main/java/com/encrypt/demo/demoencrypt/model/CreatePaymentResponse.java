package com.encrypt.demo.demoencrypt.model;

public class CreatePaymentResponse {

    private int invoiceId;
    private PaymentFeedbackList paymentFeedbackList;
    private DepositFeedbackList depositFeedbackList;

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public PaymentFeedbackList getPaymentFeedbackList() {
        return paymentFeedbackList;
    }

    public void setPaymentFeedbackList(PaymentFeedbackList paymentFeedbackList) {
        this.paymentFeedbackList = paymentFeedbackList;
    }

    public DepositFeedbackList getDepositFeedbackList() {
        return depositFeedbackList;
    }

    public void setDepositFeedbackList(DepositFeedbackList depositFeedbackList) {
        this.depositFeedbackList = depositFeedbackList;
    }

    @Override
    public String toString() {
        return "CreatePaymentResponse{" +
                "invoiceId=" + invoiceId +
                ", paymentFeedbackList=" + paymentFeedbackList +
                ", depositFeedbackList=" + depositFeedbackList +
                '}';
    }
}
