package com.example.e_gov.services;

import com.example.e_gov.dtos.WaterConnectionDto;
import com.example.e_gov.models.WaterConnection;
import com.example.e_gov.repo.WaterConnectionRepo;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service

public class SelfWaterConnectionService implements WaterConnectionService {
    private final WaterConnectionRepo WaterConnectionRepo;
    private WaterConnectionRepo connectionRepository;
    public SelfWaterConnectionService(WaterConnectionRepo connectionRepository, WaterConnectionRepo waterConnectionRepository) {
        this.connectionRepository = connectionRepository;
        this.WaterConnectionRepo = waterConnectionRepository;
    }

    @Override
    public WaterConnection getWaterConnectionById(Long id) {
        Optional<WaterConnection> waterConnectionOptional = connectionRepository.findById(id);
        if (waterConnectionOptional.isEmpty()) {
            throw new Error("There is no water connection with id " + id);
        }

        return waterConnectionOptional.get();
    }
    @Override
    public WaterConnection createWaterConnection(WaterConnectionDto waterConnectionDto) {
        WaterConnection waterConnection = new WaterConnection();
        waterConnection.setWaterConnectionId(waterConnectionDto.getWaterconnectionId());
        waterConnection.setPropertyId(waterConnectionDto.getPropertyId());
        waterConnection.setDescription(waterConnectionDto.getDescription());

        WaterConnectionRepo.save(waterConnection);
        return waterConnection;
    }
    @Override
    public WaterConnection updateWaterConnection(Long id, WaterConnection updatedWaterConnection) {
        Optional<WaterConnection> optionalConnection = WaterConnectionRepo.findById(id);


        WaterConnection waterConnection = optionalConnection.get();
        if(updatedWaterConnection.getDescription() != null){
            waterConnection.setDescription(updatedWaterConnection.getDescription());
        }

        return WaterConnectionRepo.save(waterConnection);
    }

}
