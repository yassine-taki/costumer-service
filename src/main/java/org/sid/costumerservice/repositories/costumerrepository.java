package org.sid.costumerservice.repositories;

import org.sid.costumerservice.entities.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface costumerrepository extends JpaRepository<Costumer,Long> {
}
