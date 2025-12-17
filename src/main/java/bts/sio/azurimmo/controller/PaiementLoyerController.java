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

import bts.sio.azurimmo.model.dto.GerantDTO;
import bts.sio.azurimmo.model.dto.PaiementLoyerDTO;
import bts.sio.azurimmo.service.GerantService;
import bts.sio.azurimmo.service.PaiementLoyerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/paiementLoyers")
@Tag(name = "PaiementLoyers", description = "Gestion des Paiement de Loyer")
public class PaiementLoyerController {

    @Autowired
    private PaiementLoyerService paiementLoyerService;
    
   
    @GetMapping("/{PaiementLoyerId}")
    @Operation(summary = "Récupère un Paiement de Loyer par son ID")
    public Optional<PaiementLoyerDTO> getPaiementLoyerDTO(@PathVariable long PaiementLoyerId) {
        return paiementLoyerService.getPaiementLoyerDTO(PaiementLoyerId);
    }

    
    
    @GetMapping("/")
    @Operation(summary = "Récupère tous les Paiement de Loyers")
    public List<PaiementLoyerDTO> getPaiementLoyers() {
        return paiementLoyerService.getPaiementLoyersDTO(); 
    }
    
    
    @PostMapping("/")
    @Operation(summary = "Créer un nouveau Paiement de Loyer", description = "Enregistre un Paiement de Loyer à partir des informations fournies.")
    public ResponseEntity<PaiementLoyerDTO> createPaiementLoyer(@RequestBody PaiementLoyerDTO dto) {
    	PaiementLoyerDTO savedDTO = paiementLoyerService.savePaiementLoyerDTO(dto);
        return ResponseEntity.status(201).body(savedDTO);
    }
}
