package bts.sio.azurimmo.repository;

import org.springframework.stereotype.Repository;

import bts.sio.azurimmo.model.PaiementLoyer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PaiementLoyerRepository extends JpaRepository<PaiementLoyer, Long> {
	List<PaiementLoyer> findByContrat_id(long id);
}