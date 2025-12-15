package bts.sio.azurimmo.model.dto;

import java.sql.Time;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class InterventionDTO {
	 private String libelle;
	 private String description;
	 private String adresse;
	 private String ville;
	 private Time heure;

}