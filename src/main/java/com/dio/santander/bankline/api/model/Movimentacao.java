package com.dio.santander.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movimentacao {

    private Integer id;
    private LocalDateTime dataHora;
    private String descricao;
    private Double valor;

    private MovimentacaoTipo tipo;
}
