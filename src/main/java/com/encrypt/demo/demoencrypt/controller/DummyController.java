package com.encrypt.demo.demoencrypt.controller;

import com.encrypt.demo.demoencrypt.model.CreatePaymentResponse;
import com.encrypt.demo.demoencrypt.model.DepositFeedbackList;
import com.encrypt.demo.demoencrypt.model.PaymentFeedbackItem;
import com.encrypt.demo.demoencrypt.model.PaymentFeedbackList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/v2/payments")
public class DummyController {

    final Logger LOGGER = LoggerFactory.getLogger(DummyController.class);

    @RequestMapping(value = "/bill/wireless", params = {"data1", "data2"}, method = RequestMethod.POST)
    public ResponseEntity<CreatePaymentResponse> wirelessCreatePayment(@RequestBody String body,
                                                                       @RequestParam("data1") String data1,
                                                                       @RequestParam("data2") String data2) {
        LOGGER.info("DATA: {}", body);
        return new ResponseEntity<>(newCreatePaymentResponse(), HttpStatus.OK);
    }

    public CreatePaymentResponse newCreatePaymentResponse() {
        CreatePaymentResponse createPaymentResponse = new CreatePaymentResponse();

        createPaymentResponse.setInvoiceId(1234567);
        createPaymentResponse.setPaymentFeedbackList(getPaymentFeedbackList());
//        createPaymentResponse.setDepositFeedbackList(getDepositFeedbackList());

        return createPaymentResponse;
    }

    public PaymentFeedbackItem getPaymentFeedbackItem() {
        PaymentFeedbackItem paymentFeedbackItem = new PaymentFeedbackItem();

        paymentFeedbackItem.setPaymentId(12345);
        paymentFeedbackItem.setAuthResponseCode("200");
        paymentFeedbackItem.setCreditCardNumber("001992-1923");
        paymentFeedbackItem.setPaymentMethod("CC");

        return paymentFeedbackItem;
    }

    public DepositFeedbackList getDepositFeedbackList() {
        return new DepositFeedbackList();
    }

    public PaymentFeedbackList getPaymentFeedbackList() {
        PaymentFeedbackList paymentFeedbackList = new PaymentFeedbackList();

        paymentFeedbackList.setPaymentFeedbackItem(getPaymentFeedbackItem());

        return paymentFeedbackList;
    }
}
