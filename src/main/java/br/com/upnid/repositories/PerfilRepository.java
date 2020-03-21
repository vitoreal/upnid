package br.com.upnid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.upnid.entities.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
