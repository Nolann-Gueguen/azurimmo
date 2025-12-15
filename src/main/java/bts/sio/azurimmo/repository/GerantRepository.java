package bts.sio.azurimmo.repository;

import org.springframework.stereotype.Repository;

import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.model.Gerant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GerantRepository extends JpaRepository<Gerant, Long> {
	List<Gerant> findByBatiment_Id(long id);
}