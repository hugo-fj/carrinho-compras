package br.com.techugo.carrinhoApi.repository;

import br.com.techugo.carrinhoApi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
