package com.example.uberentityservice.models;


import jakarta.persistence.Entity;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExactLocation extends BaseModel{

    private Double lattitude;

    private Double longitude;
}
