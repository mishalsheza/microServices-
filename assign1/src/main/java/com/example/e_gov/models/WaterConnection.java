package com.example.e_gov.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;


import org.springframework.data.annotation.Id;

@Entity@Table(name = "waterconnectiondb") // Ensure table name matches your DB


@NoArgsConstructor
@Getter
@Setter
public class WaterConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long waterConnectionId;
    private Long propertyId;
    private String description;
    @jakarta.persistence.Id
    private Long id;

    public Long getWaterConnectionId() {
        return waterConnectionId;
    }

    public void setWaterConnectionId(Long waterConnectionId) {
        this.waterConnectionId = waterConnectionId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
