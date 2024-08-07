package com.javarush.pavlichenko.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "country")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Country {

    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "code")
    String code;

    @Column(name = "code_2")
    String code2;

    @Column(name = "name")
    String name;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    Continent continent;

    @Column(name = "region")
    String region;

    @Column(name = "surface_area")
    BigDecimal surfaceArea;

    @Column(name = "indep_year")
    Integer year;

    @Column(name = "population")
    Integer population;

    @Column(name = "life_expectancy")
    BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    BigDecimal gnp;

    @Column(name = "gnpo_id")
    BigDecimal gnpoId;

    @Column(name = "local_name")
    String localName;

    @Column(name = "government_form")
    String governmentForm;

    @Column(name = "head_of_state")
    String headOfState;

    @OneToOne
    @JoinColumn(name = "capital")
    City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
