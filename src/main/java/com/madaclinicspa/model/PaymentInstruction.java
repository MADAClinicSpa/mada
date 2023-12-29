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
public class PaymentInstruction {
    @JsonProperty("disbursement_mode")
    private String disbursementMode;
    @JsonProperty("platform_fees")
    private List<PlatformFee> platformFees;
}
