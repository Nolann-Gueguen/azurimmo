package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.model.dto.BatimentDTO;
import bts.sio.azurimmo.model.dto.GerantDTO;
import bts.sio.azurimmo.repository.BatimentRepository;
import bts.sio.azurimmo.repository.GerantRepository;
import bts.sio.azurimmo.model.mapper.BatimentMapper;
import bts.sio.azurimmo.model.mapper.GerantMapper;

@Service
public class GerantService {

    @Autowired
    private GerantRepository gerantRepository;

    public Optional<GerantDTO> getGerantDTO(Long id) {
    	return gerantRepository.findById(id)
                .map(GerantMapper::toDTO);
}
    public List<GerantDTO> getGerantsDTO() {
        return gerantRepository.findAll()
                                 .stream()
                                 .map(GerantMapper::toDTO)
                                 .collect(Collectors.toList());
}
    public GerantDTO saveGerantDTO(GerantDTO dto) {
        Gerant entity = GerantMapper.toEntity(dto);
        Gerant saved = gerantRepository.save(entity);
        return GerantMapper.toDTO(saved);
    }
}




