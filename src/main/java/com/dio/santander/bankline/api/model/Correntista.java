package com.dio.santander.bankline.api.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Correntista {

    @Setter(AccessLevel.PRIVATE) private Integer id;
    private String cpf;
    private String nome;

    private Conta conta;

}
