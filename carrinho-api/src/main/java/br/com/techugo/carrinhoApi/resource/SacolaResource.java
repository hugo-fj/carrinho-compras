package br.com.techugo.carrinhoApi.resource;

import br.com.techugo.carrinhoApi.model.Item;
import br.com.techugo.carrinhoApi.model.Sacola;
import br.com.techugo.carrinhoApi.resource.dto.ItemDto;
import br.com.techugo.carrinhoApi.service.SacolaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class SacolaResource {

    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
        return  sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable() Long id){
        return sacolaService.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId,formaPagamento);
    }
}
