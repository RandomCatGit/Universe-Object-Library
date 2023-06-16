package com.uol.organism;

import com.uol.UniverseObjectLibrary;

import lombok.EqualsAndHashCode;

/**
 * Alive is the RWP class of common properties of all living organisms.
 *
 * @author RandomCatGit
 */
@EqualsAndHashCode(callSuper = true)
public class Alive extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP Alive
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * isAlive indicates if the organism is alive or not. By default, every organism is alive.
	 */
	private boolean isAlive = true;

	/**
	 * kill method kills the Alive and it's isAlive state is set false.
	 *
	 */
	public void kill() {
		isAlive = false;
	}
}
