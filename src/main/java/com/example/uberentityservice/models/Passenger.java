package com.example.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" , "bookings"})
public class Passenger extends BaseModel {
    private String name;

    private String phoneNumber;
    private String email;
    private String password;
    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings = new ArrayList<>();
}
