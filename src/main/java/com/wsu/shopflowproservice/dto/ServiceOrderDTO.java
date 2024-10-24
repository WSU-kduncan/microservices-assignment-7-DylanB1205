package com.wsu.shopflowproservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceOrderDTO {

    /**
     * fields for 
     * ServiceOrderId
     * VIN
     * MechanicID
     * ServiceID
     * DateRecieved
     * DateCompleted
     * CustomerFirstName
     * CustomerLastName
     * ServiceCost
     * 
     * All are @NotBlank EXCEPT DateCompleted
     */
}
