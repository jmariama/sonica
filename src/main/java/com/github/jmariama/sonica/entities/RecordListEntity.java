package com.github.jmariama.sonica.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "records_list")
public class RecordListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String name;

    @Column(length = 500)
    private String description;

    @OneToMany
    @JoinTable(name = "LIST_RECORD")
    private List<RecordEntity> list;
}
