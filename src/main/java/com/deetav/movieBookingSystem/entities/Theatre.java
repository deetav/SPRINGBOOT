package com.deetav.movieBookingSystem.entities;

import jakarta.persistence.*;

@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer theatreId;

    @Column(length = 20, nullable = false, unique = true)
    private String theatreName;

    @Column(length = 20, nullable = false, unique = true)
    private float ticketPrice = 150.00f;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    public Integer getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Integer theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "theatreId=" + theatreId +
                ", theatreName='" + theatreName + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
