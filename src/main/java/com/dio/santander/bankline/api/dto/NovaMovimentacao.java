package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NovaMovimentacao {

    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;
}
