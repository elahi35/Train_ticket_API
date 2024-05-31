package com.Train_Tickets.Train_Tickets_RestAPI.Entities;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.*;

import jakarta.persistence.GenerationType;

@Entity
public class UserDetails {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String fromStation;
    private String toStation;
    private String seatAllocation;

    public UserDetails() {}

    public UserDetails(String firstName, String lastName, String email, String fromStation, String toStation, String seatAllocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.fromStation = fromStation;
        this.toStation = toStation;
        this.seatAllocation = seatAllocation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public String getSeatAllocation() {
        return seatAllocation;
    }

    public void setSeatAllocation(String seatAllocation) {
        this.seatAllocation = seatAllocation;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                ", seatAllocation='" + seatAllocation + '\'' +
                '}';
    }

	public UserDetails save(UserDetails userDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<UserDetails> findById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long userId) {
		// TODO Auto-generated method stub
		
	}

	
}
