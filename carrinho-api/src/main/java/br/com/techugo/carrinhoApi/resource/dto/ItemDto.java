package br.com.techugo.carrinhoApi.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor

public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long idSacola;
}
