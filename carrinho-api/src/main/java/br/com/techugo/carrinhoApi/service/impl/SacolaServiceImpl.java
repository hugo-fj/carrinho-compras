package br.com.techugo.carrinhoApi.service.impl;

import br.com.techugo.carrinhoApi.enumeration.FormaPagamento;
import br.com.techugo.carrinhoApi.model.Item;
import br.com.techugo.carrinhoApi.model.Sacola;
import br.com.techugo.carrinhoApi.repository.SacolaRepository;
import br.com.techugo.carrinhoApi.resource.dto.ItemDto;
import br.com.techugo.carrinhoApi.service.SacolaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SacolaServiceImpl implements SacolaService {

    private final SacolaRepository sacolaRepository;

    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {
        return sacolaRepository.findById(id).orElseThrow(
                () -> {
                    throw new RuntimeException("Essa sacola não existe");
                }
        );
    }

    @Override
    public Sacola fecharSacola(Long id, int numeroFormaPagamento) {
        Sacola sacola = verSacola(id);

        if(sacola.getItens().isEmpty()){
           throw new RuntimeException("Inclua itens na sacola");
        }

        FormaPagamento formaPagamento =
                numeroFormaPagamento == 0 ? FormaPagamento.DINHEIRO : FormaPagamento.MAQUINETA;
        sacola.setFormaPagamento(formaPagamento);
        sacola.setFechada(true);

        return sacolaRepository.save(sacola);
    }

}
