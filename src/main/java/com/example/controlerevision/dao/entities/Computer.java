package com.example.controlerevision.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pc;
    private String proce;
    private String ram;

    private String hardDrive;
    private Float price;
    private String macAddress;
}
