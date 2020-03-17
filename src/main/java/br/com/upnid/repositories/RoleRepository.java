package br.com.upnid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.upnid.entities.Roles;

public interface RoleRepository extends JpaRepository<Roles, Long> {

}
