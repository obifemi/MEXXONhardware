package com.example.MEXXONhardware.DB;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String standort;

    @Temporal(TemporalType.DATE)
    private Date anschaffungsdatum;

    private String ipAdresse;

    private String operationSystem;
}
