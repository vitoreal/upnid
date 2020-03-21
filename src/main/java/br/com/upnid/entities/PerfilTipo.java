package br.com.upnid.entities;

public enum PerfilTipo {
	ADMIN(1, "ADMIN"), CLIENTE(2, "CLIENTE");
	
	private long cod;
	private String desc;

	private PerfilTipo(long cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public long getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
}
