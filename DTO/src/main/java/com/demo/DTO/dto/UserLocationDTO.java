package com.demo.DTO.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLocationDTO{
    private Long id;
    private String  email;
    private String place;
    private double longitude;
    private double latitude;
}