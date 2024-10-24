package com.wsu.shopflowproservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

@Table(name = "Mechanics")
public class Mechanic {

    /**
     * lists coloums of the mechanics table and the type 
     * Uses @JoinTable, not quite certain what we could use this for
     */
}
