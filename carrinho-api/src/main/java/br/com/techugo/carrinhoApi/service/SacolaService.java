package br.com.techugo.carrinhoApi.service;

import br.com.techugo.carrinhoApi.model.Item;
import br.com.techugo.carrinhoApi.model.Sacola;
import br.com.techugo.carrinhoApi.resource.dto.ItemDto;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDto itemDto);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
