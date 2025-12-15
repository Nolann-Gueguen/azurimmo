package bts.sio.azurimmo.model.mapper;

import java.util.stream.Collectors;

import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.model.dto.BatimentDTO;
import bts.sio.azurimmo.model.dto.GerantDTO;

public class GerantMapper {
	
	public static GerantDTO toDTO(Gerant a) {
        if (a == null) return null;

        GerantDTO dto = new GerantDTO();
        dto.setPrenom(a.getPrenom());
        dto.setNom(a.getNom());
        dto.setTel(a.getTel());
        dto.setMail(a.getMail());
        return dto;
    }

    public static Gerant toEntity(GerantDTO dto) {
        if (dto == null) return null;

        Gerant a = new Gerant();
        a.setPrenom(dto.getPrenom());
        a.setNom(dto.getNom());
        a.setTel(dto.getTel());
        a.setMail(dto.getMail());
        return a;
    }
}