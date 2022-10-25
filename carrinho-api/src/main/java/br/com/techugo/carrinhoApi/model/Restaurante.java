package br.com.techugo.carrinhoApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handle"})
@NoArgsConstructor
public class Restaurante {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;

    @Embedded
    private Endereco endereco;



}
