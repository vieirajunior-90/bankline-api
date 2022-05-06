package com.dio.santander.bankline.api.model;

import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "correntista")
public class Correntista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PRIVATE) private Integer id;

    @Column(length = 20, nullable = false)
    private String cpf;

    @Column(length = 100, nullable = false)
    private String nome;

    @Embedded
    private Conta conta;

}
