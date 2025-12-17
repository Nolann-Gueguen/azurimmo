package bts.sio.azurimmo.model.mapper;
import java.util.Date;

import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.model.PaiementLoyer;
import bts.sio.azurimmo.model.dto.GerantDTO;
import bts.sio.azurimmo.model.dto.PaiementLoyerDTO;

public class PaiementLoyerMapper {
	
	public static PaiementLoyerDTO toDTO(PaiementLoyer a) {
        if (a == null) return null;

        PaiementLoyerDTO dto = new PaiementLoyerDTO();
        dto.setDatePaiement(a.getDatePaiement());
        return dto;
    }

    public static PaiementLoyer toEntity(PaiementLoyerDTO dto) {
        if (dto == null) return null;

        PaiementLoyer a = new PaiementLoyer();
        a.setDatePaiement((java.sql.Date) dto.getDatePaiement());
        
        return a;
    }
}