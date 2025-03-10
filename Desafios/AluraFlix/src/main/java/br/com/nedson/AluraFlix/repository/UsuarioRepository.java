package br.com.nedson.AluraFlix.repository;

import br.com.nedson.AluraFlix.model.Usuario;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login);

    Boolean existsByLogin(String login);
}
