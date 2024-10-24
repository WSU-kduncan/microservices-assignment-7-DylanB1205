package com.wsu.shopflowproservice.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wsu.shopflowproservice.dto.MechanicDTO;
import com.wsu.shopflowproservice.model.Mechanic;
import com.wsu.shopflowproservice.repository.MechanicRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class MechanicService {

    private final MechanicRepository mechanicRepository;


    public Page<MechanicDTO> get(){
        /**
         * Retrieve a page of mechanics
         * has try catch block
         * throws DatabaseException when failed to retrieve mechanic
         */
    }


    public MechanicDTO save(){
        /**
         * Save method for creating mechanic
         * uses try catch block
         * throws databaseerrorException
         */
    }

    public Mechanic update(){
        /**
         * Updates mechanic based on mechanic ID and mechanicDTO
         * uses try catch block
         * throws databaseErrorException
         */
    }

    public void delete(){
        /**
         * Deletes a mechanic
         * uses try catch block
         * throws databseErrorException
         */
    }
}
