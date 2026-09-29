package com.github.jmariama.sonica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "records")
public class RecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String title;

    @Column(length = 500)
    private String description;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(columnDefinition = "BOOLEAN")
    private boolean owned;

    @Column(name = "buy_date")
    private Date buyDate;

    @Column(name = "num_of_discs")
    private int numOfDiscs;

    private int size;
    private double speed;

    @ManyToOne
    @JoinColumn(name = "type")
    private VinylTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "genre")
    private GenreEntity genre;

    @OneToMany()
    @JoinTable(name = "record_artist")
    List<ArtistEntity> artists;
}
