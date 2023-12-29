package com.madaclinicspa.model;

public class PayPalOrder {
    private String id;
    private String intent;
    private String status;

}

/*{
        "intent": "CAPTURE",
        "purchase_units": [
        {
        "items": [
        {
        "name": "T-Shirt",
        "description": "Green XL",
        "quantity": "1",
        "unit_amount": {
        "currency_code": "GBP",
        "value": "100.00"
        }
        }
        ],
        "amount": {
        "currency_code": "GBP",
        "value": "100.00",
        "breakdown": {
        "item_total": {
        "currency_code": "GBP",
        "value": "100.00"
        }
        }
        }
        }
        ],
        "application_context": {
        "return_url": "https://example.com/return",
        "cancel_url": "https://example.com/cancel"
        }
        }*/

/*{
        "id": "28J702264J869482J",
        "intent": "CAPTURE",
        "status": "CREATED",
        "purchase_units": [
        {
        "reference_id": "default",
        "amount": {
        "currency_code": "GBP",
        "value": "100.00",
        "breakdown": {
        "item_total": {
        "currency_code": "GBP",
        "value": "100.00"
        }
        }
        },
        "payee": {
        "email_address": "sb-shmsi28794785@business.example.com",
        "merchant_id": "YXQZNG8RVKN9C"
        },
        "items": [
        {
        "name": "T-Shirt",
        "unit_amount": {
        "currency_code": "GBP",
        "value": "100.00"
        },
        "quantity": "1",
        "description": "Green XL"
        }
        ]
        }
        ],
        "create_time": "2023-12-27T22:35:36Z",
        "links": [
        {
        "href": "https://api.sandbox.paypal.com/v2/checkout/orders/28J702264J869482J",
        "rel": "self",
        "method": "GET"
        },
        {
        "href": "https://www.sandbox.paypal.com/checkoutnow?token=28J702264J869482J",
        "rel": "approve",
        "method": "GET"
        },
        {
        "href": "https://api.sandbox.paypal.com/v2/checkout/orders/28J702264J869482J",
        "rel": "update",
        "method": "PATCH"
        },
        {
        "href": "https://api.sandbox.paypal.com/v2/checkout/orders/28J702264J869482J/capture",
        "rel": "capture",
        "method": "POST"
        }
        ]
        }*/
