package com.hiru.salon.offer.service;

import com.hiru.salon.offer.dto.CategoryDTO;
import com.hiru.salon.offer.dto.SalonDTO;
import com.hiru.salon.offer.dto.ServiceDTO;
import com.hiru.salon.offer.modal.ServiceOffering;

import java.util.Set;

public interface ServiceOfferingService {
    ServiceOffering createService(SalonDTO salonDTO,
                                  ServiceDTO serviceDTO,
                                  CategoryDTO categoryDTO);

    ServiceOffering updateService(Long serviceId, ServiceOffering service) throws Exception;

    Set<ServiceOffering> getAllServiceBySalonId(Long salonId, Long categoryId);

    Set<ServiceOffering> getServicesByIds(Set<Long> ids);
    ServiceOffering getServiceById(Long id) throws Exception;
}
