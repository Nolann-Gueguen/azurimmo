package bts.sio.azurimmo.model;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "intervention")
public class Intervention {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(name="libelle")
	 private String libelle;
	 
	 @Column(name="description")
	 private String description;

	 @Column(name="lieux")
	 private String lieux;
	 
	 @Column(name="heure")
	 private Time heure;
	 
	 
	 
}
