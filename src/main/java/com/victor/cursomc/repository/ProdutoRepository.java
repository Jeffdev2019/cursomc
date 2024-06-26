package com.victor.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victor.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

}
