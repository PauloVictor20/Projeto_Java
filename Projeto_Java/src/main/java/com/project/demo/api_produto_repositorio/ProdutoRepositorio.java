package com.project.demo.api_produto_repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.demo.api_produto_modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository <ProdutoModelo, Integer>{

        //Listar
    List<ProdutoModelo> findAll();

        //Pesquisar
    ProdutoModelo findByCodigo(int codigo);

        //Remover
    void delete(ProdutoModelo produto);
        //Cadastrar
    //ProdutoModelo save( ProdutoModelo produto);

    <ProdMod extends ProdutoModelo> ProdMod save (ProdMod produto);
    



    
}
