package bts.sio.azurimmo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bts.sio.azurimmo.model.dto.InterventionDTO;
import bts.sio.azurimmo.service.InterventionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/interventions")
@Tag(name = "Interventions", description = "Gestion des Interventions")
public class InterventionController {

    @Autowired
    private InterventionService interventionService;
    
   
    @GetMapping("/{InterventionId}")
    @Operation(summary = "Récupère une Intervention par son ID")
    public Optional<InterventionDTO> getInterventionDTO(@PathVariable long InterventionId) {
        return interventionService.getInterventionDTO(InterventionId);
    }

    
    
    @GetMapping("/")
    @Operation(summary = "Récupère toutes les Interventions")
    public List<InterventionDTO> getInterventions() {
        return interventionService.getInterventionsDTO(); 
    }
    
    
    @PostMapping("/")
    @Operation(summary = "Créer une nouvelle Intervention", description = "Enregistre une Intervention à partir des informations fournies.")
    public ResponseEntity<InterventionDTO> createIntervention(@RequestBody InterventionDTO dto) {
    	InterventionDTO savedDTO = interventionService.saveInterventionDTO(dto);
        return ResponseEntity.status(201).body(savedDTO);
    }
}
