package com.encrypt.demo.demoencrypt.model;

public class PaymentFeedbackItem {

    private int paymentId;
    private String paymentMethod;
    private String authResponseCode;
    private String creditCardNumber;

    @Override
    public String toString() {
        return "PaymentFeedbackItem{" +
                "paymentId=" + paymentId +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", authResponseCode='" + authResponseCode + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                '}';
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAuthResponseCode() {
        return authResponseCode;
    }

    public void setAuthResponseCode(String authResponseCode) {
        this.authResponseCode = authResponseCode;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


}
