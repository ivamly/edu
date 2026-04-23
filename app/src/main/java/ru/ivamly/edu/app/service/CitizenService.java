package ru.ivamly.edu.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ivamly.edu.app.entity.Citizen;
import ru.ivamly.edu.app.repository.CitizenRepository;

@Service
@RequiredArgsConstructor
public class CitizenService {

    private final CitizenRepository citizenRepository;

    public Citizen create(Citizen citizen) {
        return citizenRepository.save(citizen);
    }
}
