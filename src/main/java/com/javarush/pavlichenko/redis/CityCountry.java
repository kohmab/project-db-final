package com.javarush.pavlichenko.redis;

import com.javarush.pavlichenko.domain.Continent;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@NoArgsConstructor
public class CityCountry {
    Integer id;

    String name;

    String district;

    Integer population;

    String countryCode;

    String alternativeCountryCode;

    String countryName;

    Continent continent;

    String countryRegion;

    BigDecimal countrySurfaceArea;

    Integer countryPopulation;

    Set<Language> languages;

}