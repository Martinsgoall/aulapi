package br.com.leonardo.aulaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardo.aulaapi.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
