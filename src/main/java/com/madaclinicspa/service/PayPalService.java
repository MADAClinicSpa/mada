package com.madaclinicspa.service;

import com.paypal.orders.Order;
import com.paypal.orders.OrderRequest;

import java.util.Optional;

public interface PayPalService {
    Optional<Order> createOrder(OrderRequest orderRequest);
}
