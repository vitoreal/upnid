package br.com.upnid.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.upnid.entities.User;
import br.com.upnid.repositories.UserRepository;
import br.com.upnid.service.exceptions.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;
    
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User save(User user){
		//user.setSenha(bCryptPasswordEncoder.encode(user.getSenha()));
		return userRepository.save(user);
	}
	
	@Override
    public User findByUsername(String email) {
        return userRepository.findByEmail(email);
    }
	
}
