package com.deetav.movieBookingSystem.dao;

import com.deetav.movieBookingSystem.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
    public City findByCityName(String cityName);
}
