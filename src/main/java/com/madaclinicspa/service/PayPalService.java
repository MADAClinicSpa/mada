package com.madaclinicspa.service;

import com.madaclinicspa.model.paypal.Capture;
import com.madaclinicspa.model.paypal.CapturePayment;
import com.madaclinicspa.model.paypal.Order;
import com.madaclinicspa.model.paypal.OrderRequest;

import java.util.Optional;

public interface PayPalService {
    Optional<Order> createOrder(OrderRequest orderRequest);

    Optional<CapturePayment> captureOrderPayment(String orderId);
}
