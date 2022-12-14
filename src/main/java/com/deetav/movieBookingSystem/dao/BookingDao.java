package com.deetav.movieBookingSystem.dao;

import com.deetav.movieBookingSystem.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookingDao extends JpaRepository<Booking, Integer> {


}
