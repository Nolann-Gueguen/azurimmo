package bts.sio.azurimmo.repository;

import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.Gerant;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GerantRepository extends JpaRepository<Gerant, Long> {
}