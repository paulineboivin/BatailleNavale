package com.paulineboivin.bataillenavale.entities.maps;

public class Case {

	private int x;
	private int y;
	private String contenu;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Case(int x, int y, String contenu) {
		super();
		this.x = x;
		this.y = y;
		this.contenu = contenu;
	}
}
