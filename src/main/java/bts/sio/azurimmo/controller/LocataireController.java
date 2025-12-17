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

import bts.sio.azurimmo.model.dto.LocataireDTO;

import bts.sio.azurimmo.service.LocataireService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/locataires")
@Tag(name = "Locataires", description = "Gestion des Locataires")
public class LocataireController {

    @Autowired
    private LocataireService locataireService;
    
   
    @GetMapping("/{LocataireId}")
    @Operation(summary = "Récupère un Locataire par son ID")
    public Optional<LocataireDTO> getLocataireDTO(@PathVariable long LocataireId) {
        return locataireService.getLocataireDTO(LocataireId);
    }

    
    
    @GetMapping("/")
    @Operation(summary = "Récupère tous les Locataires")
    public List<LocataireDTO> getLocataires() {
        return locataireService.getLocatairesDTO(); 
    }
    
    
    @PostMapping("/")
    @Operation(summary = "Créer un nouveau Locataire", description = "Enregistre un Locataire à partir des informations fournies.")
    public ResponseEntity<LocataireDTO> createLocataire(@RequestBody LocataireDTO dto) {
    	LocataireDTO savedDTO = locataireService.saveLocataireDTO(dto);
        return ResponseEntity.status(201).body(savedDTO);
    }
}
