package ru.ivamly.edu.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ivamly.edu.app.mapper.CitizenMapper;
import ru.ivamly.edu.app.service.CitizenService;
import ru.ivamly.edu.dto.CreateCitizenRq;
import ru.ivamly.edu.dto.CreateCitizenRs;

@RestController
@RequestMapping("/citizens")
@RequiredArgsConstructor
public class CitizenController {

    private final CitizenService citizenService;
    private final CitizenMapper citizenMapper;

    @PostMapping(version = "1")
    public CreateCitizenRs create(@RequestBody CreateCitizenRq request) {
        return citizenMapper.map(
                citizenService.create(
                        citizenMapper.map(request)
                )
        );
    }
}
