package com.deetav.movieBookingSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deetav.movieBookingSystem.entities.Status;

public interface StatusDao extends JpaRepository<Status, Integer> {
    public Status findByStatusName(String statusName);
}
