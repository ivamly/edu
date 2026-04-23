package ru.ivamly.edu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivamly.edu.app.entity.Citizen;

import java.util.UUID;

public interface CitizenRepository extends JpaRepository<Citizen, UUID> {
}
