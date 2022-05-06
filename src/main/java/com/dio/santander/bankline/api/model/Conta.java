package com.dio.santander.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Conta {

    @Column(name = "numero_conta")
    private Long numero;

    @Column(name = "saldo")
    private Double saldo;
}
