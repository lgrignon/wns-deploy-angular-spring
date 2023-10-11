package fr.wcs.deployback.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.wcs.deployback.entities.Fire;

public interface FireRepository extends JpaRepository<Fire, Long> {
}