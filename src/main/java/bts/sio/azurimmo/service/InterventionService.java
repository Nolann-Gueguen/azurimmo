package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.model.dto.InterventionDTO;
import bts.sio.azurimmo.repository.InterventionRepository;
import bts.sio.azurimmo.model.mapper.InterventionMapper;

@Service
public class InterventionService {

    @Autowired
    private InterventionRepository interventionRepository;

    public Optional<InterventionDTO> getInterventionDTO(Long id) {
    	return interventionRepository.findById(id)
                .map(InterventionMapper::toDTO);
}
    public List<InterventionDTO> getInterventionsDTO() {
        return interventionRepository.findAll()
                                 .stream()
                                 .map(InterventionMapper::toDTO)
                                 .collect(Collectors.toList());
}
    public InterventionDTO saveInterventionDTO(InterventionDTO dto) {
    	Intervention entity = InterventionMapper.toEntity(dto);
    	Intervention saved = interventionRepository.save(entity);
        return InterventionMapper.toDTO(saved);
    }
}




