package bts.sio.azurimmo.model.mapper;


import bts.sio.azurimmo.model.Locataire;
import bts.sio.azurimmo.model.dto.LocataireDTO;

public class LocataireMapper {
	
	public static LocataireDTO toDTO(Locataire a) {
        if (a == null) return null;

        LocataireDTO dto = new LocataireDTO();
        dto.setPrenom(a.getPrenom());
        dto.setNom(a.getNom());
        dto.setTel(a.getTel());
        dto.setMail(a.getMail());
        return dto;
    }

    public static Locataire toEntity(LocataireDTO dto) {
        if (dto == null) return null;

        Locataire a = new Locataire();
        a.setPrenom(dto.getPrenom());
        a.setNom(dto.getNom());
        a.setTel(dto.getTel());
        a.setMail(dto.getMail());
        return a;
    }
}