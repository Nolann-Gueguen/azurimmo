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

import bts.sio.azurimmo.model.dto.ContratDTO;
import bts.sio.azurimmo.service.ContratService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/contrats")
@Tag(name = "Contrats", description = "Gestion des Contrats")
public class ContratController {

    @Autowired
    private ContratService contratService;
    
   
    @GetMapping("/{ContratId}")
    @Operation(summary = "Récupère un Contrat par son ID")
    public Optional<ContratDTO> getContratDTO(@PathVariable long ContratId) {
        return contratService.getContratDTO(ContratId);
    }

    
    
    @GetMapping("/")
    @Operation(summary = "Récupère tous les Contrats")
    public List<ContratDTO> getContrats() {
        return contratService.getContratsDTO(); 
    }
    
    
    @PostMapping("/")
    @Operation(summary = "Créer un nouveau Contrat", description = "Enregistre un Contrat à partir des informations fournies.")
    public ResponseEntity<ContratDTO> createContrat(@RequestBody ContratDTO dto) {
    	ContratDTO savedDTO = contratService.saveContratDTO(dto);
        return ResponseEntity.status(201).body(savedDTO);
    }
}
