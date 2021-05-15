package com.avanade.dio.api.models;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
   
    private int codigo;
    private String descricao;
    private Date Validade;
    private String ean;
    private boolean inativo;
}
