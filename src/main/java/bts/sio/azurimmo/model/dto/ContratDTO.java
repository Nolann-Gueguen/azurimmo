package bts.sio.azurimmo.model.dto;

import java.util.Date;

import bts.sio.azurimmo.model.Appartement;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
}