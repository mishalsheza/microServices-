package com.example.e_gov.services;

import com.example.e_gov.dtos.WaterConnectionDto;
import com.example.e_gov.models.WaterConnection;


public interface WaterConnectionService {
    WaterConnection getWaterConnectionById(Long id);
    WaterConnection createWaterConnection(WaterConnectionDto waterConnectionDto);
    WaterConnection updateWaterConnection(Long id,WaterConnection waterConnection);
}
