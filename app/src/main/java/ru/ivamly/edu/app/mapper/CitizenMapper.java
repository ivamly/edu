package ru.ivamly.edu.app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.ivamly.edu.app.config.MapstructConfig;
import ru.ivamly.edu.app.entity.Citizen;
import ru.ivamly.edu.dto.CreateCitizenRq;
import ru.ivamly.edu.dto.CreateCitizenRs;

@Mapper(config = MapstructConfig.class)
public interface CitizenMapper {

    @Mapping(target = "passport.series", source = "passportSeries")
    @Mapping(target = "passport.number", source = "passportNumber")
    @Mapping(target = "passport.address.country", source = "addressCountry")
    @Mapping(target = "passport.address.city", source = "addressCity")
    @Mapping(target = "passport.address.street", source = "addressStreet")
    @Mapping(target = "passport.address.number", source = "addressNumber")
    Citizen map(CreateCitizenRq source);

    CreateCitizenRs map(Citizen citizen);
}
