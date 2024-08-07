package com.javarush.pavlichenko;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javarush.pavlichenko.domain.City;
import com.javarush.pavlichenko.domain.Country;
import com.javarush.pavlichenko.domain.CountryLanguage;
import io.lettuce.core.RedisClient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    private final SessionFactory sessionFactory;
    private final RedisClient redisClient;

    private final ObjectMapper mapper;

    private final CityDAO cityDAO;
    private final CountryDAO countryDAO;

    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(CountryLanguage.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {


            session.createQuery("from CountryLanguage ", CountryLanguage.class)
                    .list()
                    .forEach(System.out::println);

        }

    }
}