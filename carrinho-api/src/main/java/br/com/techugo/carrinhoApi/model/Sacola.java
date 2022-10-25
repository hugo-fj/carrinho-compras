package br.com.techugo.carrinhoApi.model;

import br.com.techugo.carrinhoApi.enumeration.FormaPagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Sacola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JsonIgnore
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;

    private Double valorTotal;

    @Enumerated
    private FormaPagamento FormaPagamento;

    private boolean fechada;

}
