package com.uol.organism.cell.multi_cell.eukaryote.animal;

import com.uol.organism.cell.Cell;

import lombok.Getter;

/**
 * Neuron or nerve cell, is an electrically excitable cell that communicates with other cells via specialized
 * connections called synapses. It is the main component of nervous tissue. All animals except sponges and placozoans
 * have neurons, but other multicellular organisms such as plants do not.
 *
 * @author RandomCatGit
 */
@Getter
public class Neuron extends Cell {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Neuron
	 */
	public Neuron() {
		super(null); // TODO add constituent
	}

}
