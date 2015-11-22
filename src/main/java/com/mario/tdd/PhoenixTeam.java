package com.mario.tdd;

import org.springframework.util.Assert;

/**
 * Clase que indica los bugs que ha resuelto el equipot Fenix
 * 
 * @author mvinuesa
 *
 */
public class PhoenixTeam {

	int bugsResolved; 
	
	/**
	 * Constructor principal
	 * 
	 * @param bugsResolved
	 */
	public PhoenixTeam(int bugsResolved) {
		Assert.isTrue(bugsResolved >= 0, "Los bugs deben ser mayores o igual a 0");
		this.bugsResolved = bugsResolved;
	}

	/**
	 * Devuelve del numero de bugs resueltos
	 * @return
	 */
	public int getBugsResolved() {
		return bugsResolved;
	}

}
