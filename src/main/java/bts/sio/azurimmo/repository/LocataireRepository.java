package bts.sio.azurimmo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bts.sio.azurimmo.model.Locataire;

@Repository
public interface LocataireRepository extends JpaRepository<Locataire, Long> {
	
}