package com.wsu.shopflowproservice.controller;

import org.hibernate.mapping.Map;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wsu.shopflowproservice.dto.MechanicDTO;
import com.wsu.shopflowproservice.service.MechanicService;
import com.wsu.shopflowproservice.utilities.Constants;

import jakarta.validation.Valid;

import static com.wsu.shopflowproservice.utilities.Constants.MESSAGE;
import static com.wsu.shopflowproservice.utilities.Constants.PAGE_COUNT;
import static com.wsu.shopflowproservice.utilities.Constants.RESULT_COUNT;



import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mechanics")
public class MechanicController {

    private final MechanicService mechanicService;

    /**
     * Will need a GetMapping to retireve page of Mechanics based on filter
     * It will look somewhat roughly like this? I based it off the mechanics one for work order pro
     * I dont completely understand the @RequestParam parts.
     * @return - ServiceResponseDTO which include list of technicians and pagination info along with success message.
     */
    
     @GetMapping
     public ResponseEntity<ServiceResponseDTO> getAllMechanics(@RequestParam(required = false) String search,
                                                                            @RequestParam(required = false, defaultValue = "1") Integer page,
                                                                            @RequestParam(required = false, defaultValue = "10") Integer rpp,
                                                                            @RequestParam(required = false, defaultValue = "technicianCode") String sortField,
                                                                            @RequestParam(required = false, defaultValue = Constants.DESC) String sortOrder){

        Page<MechanicDTO> mechanicDTOPage = mechanicService.get(search, sortField, sortOrder, page, rpp);
        return new ResponseEntity<>(ServiceResponseDTO.builder().meta(Map.of(MESSAGE, "Successfully retrieved mechanics.", PAGE_COUNT,
                    mechanicDTOPage.getTotalPages(), RESULT_COUNT, mechanicDTOPage.getTotalElements()))
                .data(mechanicDTOPage.getContent()).build(), HttpStatus.OK);
           
           }

    /**
     * Next enpoint will be for the @PostMapping to create new mechanics
     * @param mechanicDTO - contains mechanic info
     * @return - ServiceResponseDTO has HTTP status
     */

     @PostMapping
     public ResponseEntity<ServiceResponseDTO> save(@RequestBody @Valid MechanicDTO mechanicDTO) {
        if (!StringUtils.hasLength(mechanicDTO.getCode())) {
          throw new InvalidRequestException
        }
     }


     /**
      * This endpoint is for updating mechanics via their mechanic id.
      * @param mechanicID - mechanicID
      * @param mechanicDTO - has mechanic info
      * @return - HTTP status and DTO
      */
      
      @PutMapping("/{mechanicID}")
      public ResponseEntity<ServiceResponseDTO> update(@PathVariable Integer mechanicID, @RequestBody @Valid MechanicDTO mechanicDTO) {
        /**
         * block of code thet has MESSAGE of mechanic updated successfully
         * useing mechanicService.update() and using builder()
         */
      }

      /**
       * This endpoint is for deleting mechanics
       * @param id - mechanicsID used for deleting technician
       * @return - HTTP Status of deleted Mechanic
       */

       @DeleteMapping("/{id}")
       public ResponseEntity<ServiceResponseDTO> deleteMechanic(@PathVariable Integer id) {
        /**
         * use delete() method within mechanicService
         * return Message For successfully deleted mechanic
         */
       }

}
