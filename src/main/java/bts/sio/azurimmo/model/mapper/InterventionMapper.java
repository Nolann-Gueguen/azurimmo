package bts.sio.azurimmo.model.mapper;
import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.model.dto.InterventionDTO;
public class InterventionMapper {
	
	public static InterventionDTO toDTO(Intervention a) {
        if (a == null) return null;

        InterventionDTO dto = new InterventionDTO();
        dto.setLibelle(a.getLibelle());
        dto.setDescription(a.getDescription());
        dto.setVille(a.getAdresse());
        dto.setVille(a.getVille());
        dto.setHeure(a.getHeure());
        return dto;
    }

    public static Intervention toEntity(InterventionDTO dto) {
        if (dto == null) return null;

        Intervention a = new Intervention();
        a.setLibelle(dto.getLibelle());
        a.setDescription(dto.getDescription());
        a.setAdresse(dto.getAdresse());
        a.setVille(dto.getVille());

        a.setHeure(dto.getHeure());
        return a;
    }
}