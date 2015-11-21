package com.mario.tdd;

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
