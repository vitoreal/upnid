package br.com.upnid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.upnid.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
