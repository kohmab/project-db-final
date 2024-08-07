package com.javarush.pavlichenko.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@Entity
@Table(schema = "world", name = "country_language")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    String language;

    @Column(name = "is_official", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    Boolean official;

    BigDecimal percentage;

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", country=" + country +
                '}';
    }
}
