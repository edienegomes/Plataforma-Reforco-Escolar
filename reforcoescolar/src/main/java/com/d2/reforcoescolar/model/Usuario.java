package com.d2.reforcoescolar.model;

import jakarta.persistence.*;

@Entity
public class Usuario extends Pessoa{

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
