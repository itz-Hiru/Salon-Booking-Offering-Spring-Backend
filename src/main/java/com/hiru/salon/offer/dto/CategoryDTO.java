package com.hiru.salon.offer.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private String image;
    private Long salonId;
}
