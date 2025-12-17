package bts.sio.azurimmo.model.mapper;


import bts.sio.azurimmo.model.Contrat;
import bts.sio.azurimmo.model.dto.ContratDTO;

public class ContratMapper {
	
	public static ContratDTO toDTO(Contrat a) {
        if (a == null) return null;

        ContratDTO dto = new ContratDTO();
        dto.setDescription(a.getDescription());
        dto.setMontantBrut(a.getMontantBrut());
        dto.setMontantCharge(a.getMontantCharge());
        return dto;
    }

    public static Contrat toEntity(ContratDTO dto) {
        if (dto == null) return null;

        Contrat a = new Contrat();
        a.setDescription(dto.getDescription());
        a.setMontantBrut(dto.getMontantBrut());
        a.setMontantCharge(dto.getMontantCharge());
        return a;
    }
}