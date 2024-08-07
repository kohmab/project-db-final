package com.javarush.pavlichenko.redis;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
public class Language {
    String language;
    Boolean official;
    BigDecimal percentage;

}