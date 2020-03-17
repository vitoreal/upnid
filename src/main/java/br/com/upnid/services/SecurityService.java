package br.com.upnid.services;

public interface SecurityService {

	String findLoggedInUsername();

	void autoLogin(String username, String password);
}
