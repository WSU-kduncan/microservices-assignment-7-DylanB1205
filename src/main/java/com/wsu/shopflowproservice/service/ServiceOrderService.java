package com.wsu.shopflowproservice.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wsu.shopflowproservice.dto.MechanicDTO;
import com.wsu.shopflowproservice.model.Mechanic;
import com.wsu.shopflowproservice.model.ServiceOrder;
import com.wsu.shopflowproservice.repository.ServiceOrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceOrderService {

    private final ServiceOrderRepository serviceOrderRepository;


    public ServiceOrder get(){
        /**
         * Retrieve a serviceOrder
         * has try catch block
         * throws DatabaseException when failed to retrieve mechanic
         */
    }

    public ServiceOrder add() {
        /**
         * Adds a serviceOrder
         * uses try catch block
         * throws databseErrorException
         */
    }


    public ServiceOrder update(){
        /**
         * Updates serviceOrder 
         * uses try catch block
         * throws databaseErrorException
         */
    }

    public void delete(){
        /**
         * Deletes a service order
         * uses try catch block
         * throws databseErrorException
         */
    }

}
