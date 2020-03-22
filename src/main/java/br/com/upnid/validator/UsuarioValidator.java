package br.com.upnid.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.upnid.entities.Usuario;
import br.com.upnid.services.UsuarioService;

@Component
public class UsuarioValidator implements Validator {
	@Autowired
	private UsuarioService userService;

	@Override
	public boolean supports(Class<?> aClass) {
		return Usuario.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Usuario user = (Usuario) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if (user.getEmail().length() < 6 || user.getEmail().length() > 32) {
			errors.rejectValue("username", "Size.userForm.username");
		}
		if (userService.loadUserByUsername(user.getEmail()) != null) {
			errors.rejectValue("username", "Duplicate.userForm.username");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getSenha().length() < 8 || user.getSenha().length() > 32) {
			errors.rejectValue("password", "Size.userForm.password");
		}

	}
}
