package br.com.upnid.services;

import br.com.upnid.entities.User;

public interface UserService {
	
    User save(User user);

    User findByUsername(String username);
}
