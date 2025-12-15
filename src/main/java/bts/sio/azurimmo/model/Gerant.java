package bts.sio.azurimmo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "gerant")
public class Gerant {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 @Column(name="prenom")
	 private String prenom;
	 
	 @Column(name="nom")
	 private String nom;
	 
	 @Column(name="tel")
	 private String tel;

	 @Column(name="mail")
	 private String mail;

}