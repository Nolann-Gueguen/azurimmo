package bts.sio.azurimmo.model.dto;

import java.util.Date;
import java.util.List;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ContratDTO {
	 private String description;
	 private Float montantBrut;
	 private Float montantCharge;
	 private Date dateDebut;
	 private Date dateFin;
	 private String statut;
	 private List<LocataireDTO> locataires;

}