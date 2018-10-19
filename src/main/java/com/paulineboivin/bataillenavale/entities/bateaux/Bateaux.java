package com.paulineboivin.bataillenavale.entities.bateaux;

import java.util.ArrayList;

import com.paulineboivin.bataillenavale.entities.maps.Case;

public abstract class Bateaux {
	
	
	private int id;
	private int width;
	private int nb;
	private ArrayList<Case> arrayCase = new ArrayList<Case>();
	
	public int getId() {
		return id;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getNb() {
		return nb;
	}
		
	public Bateaux (int id, int width, int nb){
		super();
		this.id = id;
		this.width = width;
		this.nb = nb;
	}
	
	
}
