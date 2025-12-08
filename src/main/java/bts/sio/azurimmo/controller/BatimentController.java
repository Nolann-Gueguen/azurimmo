package bts.sio.azurimmo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bts.sio.azurimmo.model.dto.BatimentDTO;
import bts.sio.azurimmo.service.BatimentService;

@RestController
public class BatimentController {

    @Autowired
    private BatimentService batimentService;

    @GetMapping("/Batiment/{id}")
    public Optional<BatimentDTO> findByVille(@PathVariable Long id) {
        return batimentService.getBatimentDTO(id);
    }
}
