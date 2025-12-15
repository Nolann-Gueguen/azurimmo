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
import bts.sio.azurimmo.service.GerantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/gerants")
@Tag(name = "Gerants", description = "Gestion des Gerants")
public class GerantController {

    @Autowired
    private GerantService gerantService;
    
   
    @GetMapping("/{GerantId}")
    @Operation(summary = "Récupère un gérant par son ID")
    public Optional<GerantDTO> getGerantDTO(@PathVariable long GerantId) {
        return gerantService.getGerantDTO(GerantId);
    }

    
    
    @GetMapping("/")
    @Operation(summary = "Récupère tous les gérants")
    public List<GerantDTO> getGerants() {
        return gerantService.getGerantsDTO(); 
    }
    
    
    @PostMapping("/")
    @Operation(summary = "Créer un nouveau gérant", description = "Enregistre un gérant à partir des informations fournies.")
    public ResponseEntity<GerantDTO> createGerant(@RequestBody GerantDTO dto) {
        GerantDTO savedDTO = gerantService.saveGerantDTO(dto);
        return ResponseEntity.status(201).body(savedDTO);
    }
}
