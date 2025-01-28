package com.example.e_gov.dtos;


public class WaterConnectionDto {
    private Long waterconnection_id;
    private Long property_id;
    private String description;

    public Long getWaterconnectionId() {
        return waterconnection_id;
    }

    public void setWaterConnectionId(Long waterconnection_id) {
        this.waterconnection_id = waterconnection_id;
    }

    public Long getPropertyId() {
        return property_id;
    }

    public void setPropertyId(Long property_id) {
        this.property_id = property_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
