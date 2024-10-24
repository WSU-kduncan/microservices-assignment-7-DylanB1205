package com.wsu.shopflowproservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsu.shopflowproservice.model.Mechanic;

public interface MechanicRepository extends JpaRepository<Mechanic, String> {

    /**
     * nativeQuery SQL script
     */

}
