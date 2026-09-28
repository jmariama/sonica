package com.github.jmariama.sonica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vinyl_types")
public class VinylTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type" , length = 100)
    //33, 45, or 78 are the only allowed inputs
    private int type;






}
