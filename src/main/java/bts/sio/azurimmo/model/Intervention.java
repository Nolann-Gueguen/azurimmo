package bts.sio.azurimmo.model;

import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "intervention")
public class Intervention {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	@Column(name="adresse")
	 private String adresse;
	
	@Column(name="ville")
	 private String ville;

	 @Column(name="libelle")
	 private String libelle;
	 
	 @Column(name="description")
	 private String description;

	 
	 @Column(name="heure")
	 private Time heure;
	 
	 @ManyToOne
	    @JoinColumn(name = "appartement_id")
	    private Appartement appartement;
	 
	 @ManyToOne
	    @JoinColumn(name = "typeIntervention_id")
	    @JsonBackReference
	    private TypeIntervention typeIntervention;
	 
}
