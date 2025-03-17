package br.com.nedson.Controle_Orcamento.repository;

import br.com.nedson.Controle_Orcamento.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {
    Perfil findByNome(String nome);
}
