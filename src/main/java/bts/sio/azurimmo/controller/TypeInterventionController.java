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
import bts.sio.azurimmo.model.dto.TypeInterventionDTO;
import bts.sio.azurimmo.service.InterventionService;
import bts.sio.azurimmo.service.TypeInterventionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/TypeInterventions")
@Tag(name = "TypeInterventions", description = "Gestion des Types d'Interventions")
public class TypeInterventionController {

    @Autowired
    private TypeInterventionService typeInterventionService;
    
   
    @GetMapping("/{TypeInterventionId}")
    @Operation(summary = "Récupère une Type d'Intervention par son ID")
    public Optional<TypeInterventionDTO> getTypeInterventionDTO(@PathVariable long TypeInterventionId) {
        return typeInterventionService.getTypeInterventionDTO(TypeInterventionId);
    }

    
    
    @GetMapping("/")
    @Operation(summary = "Récupère toutes les Types d'Interventions")
    public List<TypeInterventionDTO> getTypeInterventions() {
        return typeInterventionService.getTypeInterventionsDTO(); 
    }
    
    
    @PostMapping("/")
    @Operation(summary = "Créer un nouveau Type d'Intervention", description = "Enregistre un Type d'Intervention à partir des informations fournies.")
    public ResponseEntity<TypeInterventionDTO> createTypeIntervention(@RequestBody TypeInterventionDTO dto) {
    	TypeInterventionDTO savedDTO = typeInterventionService.saveTypeInterventionDTO(dto);
        return ResponseEntity.status(201).body(savedDTO);
    }
}
