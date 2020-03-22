package br.com.upnid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.upnid.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByEmail(String email);
}
