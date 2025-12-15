package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.model.TypeIntervention;
import bts.sio.azurimmo.model.dto.InterventionDTO;
import bts.sio.azurimmo.model.dto.TypeInterventionDTO;
import bts.sio.azurimmo.repository.InterventionRepository;
import bts.sio.azurimmo.repository.TypeInterventionRepository;
import bts.sio.azurimmo.model.mapper.InterventionMapper;
import bts.sio.azurimmo.model.mapper.TypeInterventionMapper;

@Service
public class TypeInterventionService {

    @Autowired
    private TypeInterventionRepository typeInterventionRepository;

    public Optional<TypeInterventionDTO> getTypeInterventionDTO(Long id) {
    	return typeInterventionRepository.findById(id)
                .map(TypeInterventionMapper::toDTO);
}
    public List<TypeInterventionDTO> getTypeInterventionsDTO() {
        return typeInterventionRepository.findAll()
                                 .stream()
                                 .map(TypeInterventionMapper::toDTO)
                                 .collect(Collectors.toList());
}
    public TypeInterventionDTO saveTypeInterventionDTO(TypeInterventionDTO dto) {
    	TypeIntervention entity = TypeInterventionMapper.toEntity(dto);
    	TypeIntervention saved = typeInterventionRepository.save(entity);
        return TypeInterventionMapper.toDTO(saved);
    }
}




