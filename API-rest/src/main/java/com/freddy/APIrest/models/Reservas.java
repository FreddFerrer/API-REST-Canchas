package com.freddy.APIrest.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Date dia;

    private String horas;

    private Boolean reservada;

    @ManyToOne
    @JoinColumn(name = "id_canchas_id")
    private Canchas idCanchas;

    public Canchas getIdCanchas() {
        return idCanchas;
    }

    public void setIdCanchas(Canchas idCanchas) {
        this.idCanchas = idCanchas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
