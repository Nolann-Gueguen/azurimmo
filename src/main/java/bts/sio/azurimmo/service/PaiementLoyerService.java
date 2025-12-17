package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.model.PaiementLoyer;
import bts.sio.azurimmo.model.dto.GerantDTO;
import bts.sio.azurimmo.model.dto.PaiementLoyerDTO;
import bts.sio.azurimmo.repository.GerantRepository;
import bts.sio.azurimmo.repository.PaiementLoyerRepository;
import bts.sio.azurimmo.model.mapper.GerantMapper;
import bts.sio.azurimmo.model.mapper.PaiementLoyerMapper;

@Service
public class PaiementLoyerService {

    @Autowired
    private PaiementLoyerRepository paiementLoyerRepository;

    public Optional<PaiementLoyerDTO> getPaiementLoyerDTO(Long id) {
    	return paiementLoyerRepository.findById(id)
                .map(PaiementLoyerMapper::toDTO);
}
    public List<PaiementLoyerDTO> getPaiementLoyersDTO() {
        return paiementLoyerRepository.findAll()
                                 .stream()
                                 .map(PaiementLoyerMapper::toDTO)
                                 .collect(Collectors.toList());
}
    public PaiementLoyerDTO savePaiementLoyerDTO(PaiementLoyerDTO dto) {
    	PaiementLoyer entity = PaiementLoyerMapper.toEntity(dto);
    	PaiementLoyer saved = paiementLoyerRepository.save(entity);
        return PaiementLoyerMapper.toDTO(saved);
    }
}




