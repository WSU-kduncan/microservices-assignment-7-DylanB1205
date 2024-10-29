package com.wsu.shopflowproservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsu.shopflowproservice.model.ServiceOrder;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Integer> {

    @Query(nativeQuery = true, value = "Select s.")
}
