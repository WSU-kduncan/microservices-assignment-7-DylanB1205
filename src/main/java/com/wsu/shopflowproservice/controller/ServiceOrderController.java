package com.wsu.shopflowproservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wsu.shopflowproservice.dto.ServiceOrderDTO;
import com.wsu.shopflowproservice.service.ServiceOrderService;

public class ServiceOrderController {

    private final ServiceOrderService serviceOrderService;

    /**
     * This endpoint is used to get details of serviceOrder via the serviceOrderid
     * @param serviceOrderId - id used to get serviceORder details
     * @return - ServiceResponseDTO which contains details of serviceOrder
     */
    @GetMapping(value = "{serviceOrderId}")
    public ResponseEntity<ServiceResponseDTO> getServiceOrder(@PathVariable Integer serviceOrderId) {
        /**
         * returns message for successfully retrieved service order
         * Uses builder() and ServiceOrderService.get() with serviceOrderId
         */
    }

    /**
     * This endpoint used for add a new serviceOrder
     * @param serviceOrder - serviceOrder
     * @return - ServiceResponseDTO which include serviceOrder saved entity
     */
    
    @PostMapping
    public ResponseEntity<ServiceResponseDTO> addServiceOrder(@RequestBody ServiceOrderDTO serviceOrder) {
        /**
         * Message for serviceOrder added successfully
         * uses builder() and ServiceOrderService.add() with the serviceOrder
         */
    }

    /**
     * This endpoint used for update existing serviceOrders
     * @param serviceOrderId - serviceOrderId used to update existing serviceOrder
     * @param serviceOrder - serviceOrder payload contains updated serviceOrder
     * @return - ServiceResponseDTO which include serviceOrder updated entity model class.
     */
    //
    @PutMapping(value = "{serviceOrderId}")
    public ResponseEntity<ServiceResponseDTO> updateServiceOrder(@PathVariable Integer serviceOrderId, @RequestBody ServiceOrderDTO serviceOrder) {
        /**
         * returns message of service order updated successfully
         * USes builder() and ServiceOrder.update()
         */
    }
}
