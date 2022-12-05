package com.freddy.APIrest.models;

import jakarta.persistence.*;


@Entity
@Table(name = "Canchas")
public class Canchas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
