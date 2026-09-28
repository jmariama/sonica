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

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @Column(columnDefinition = "INT(1)")
    private boolean owned;

    @Column(name = "BUY_DATE")
    private Date buyDate;

    @Column(name = "NUM_OF_DISCS")
    private int numOfDiscs;

    private int size;
    private double speed;

    @ManyToOne
    @JoinColumn(name = "VINYL_TYPE_ID")
    private VinylTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private GenreEntity genre;

    @OneToMany()
    @JoinTable(name = "RECORD_ARTIST")
    List<ArtistEntity> artists;
}
