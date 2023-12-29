package com.madaclinicspa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseUnit {
    @JsonProperty("amount")
    private AmountWithBreakdown amountWithBreakdown;
    @JsonProperty("custom_id")
    private String customId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("id")
    private String id;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("items")
    private List<Item> items;
    @JsonProperty("payee")
    private Payee payee;
    @JsonProperty("payment_instruction")
    private PaymentInstruction paymentInstruction;
    @JsonProperty("payments")
    private PaymentCollection payments;
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("shipping")
    private ShippingDetail shippingDetail;
    @JsonProperty("soft_descriptor")
    private String softDescriptor;
}
