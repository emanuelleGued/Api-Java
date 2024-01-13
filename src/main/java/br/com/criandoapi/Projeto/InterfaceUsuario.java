package br.com.criandoapi.Projeto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceUsuario extends CrudRepository<Usuario, Integer> {
}
