package bts.sio.azurimmo.repository;

import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.PaiementLoyer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PaiementLoyerRepository extends JpaRepository<PaiementLoyer, Long> {
}