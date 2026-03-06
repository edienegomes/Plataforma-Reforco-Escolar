package com.d2.reforcoescolar.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "/tb_aluno")
public class Aluno extends Pessoa{

    @NotBlank
    private String serie;

    @Column (unique = true, nullable = false)
    private String matricula;

    private Double nota;
}
