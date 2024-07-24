package com.solux.greenish.User.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Getter
@NoArgsConstructor
public class Environment {

    @Id @Column(name = "environment_id")
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "environment")
    private User user;

    private String location;

    private double ave_temp;

    private double ave_humid;

    private String field;
}