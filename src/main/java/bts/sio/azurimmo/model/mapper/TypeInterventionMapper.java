package bts.sio.azurimmo.model.mapper;
import bts.sio.azurimmo.model.TypeIntervention;
import bts.sio.azurimmo.model.dto.TypeInterventionDTO;
public class TypeInterventionMapper {
	
	public static TypeInterventionDTO toDTO(TypeIntervention a) {
        if (a == null) return null;

        TypeInterventionDTO dto = new TypeInterventionDTO();
        dto.setLibelle(a.getLibelle());
        dto.setDescription(a.getDescription());
        
        return dto;
    }

    public static TypeIntervention toEntity(TypeInterventionDTO dto) {
        if (dto == null) return null;

        TypeIntervention a = new TypeIntervention();
        a.setLibelle(dto.getLibelle());
        a.setDescription(dto.getDescription());
        
        return a;
    }
}