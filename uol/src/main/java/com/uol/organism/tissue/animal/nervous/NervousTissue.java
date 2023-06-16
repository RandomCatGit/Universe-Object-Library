package com.uol.organism.tissue.animal.nervous;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.Neuron;
import com.uol.organism.tissue.Tissue;

/**
 * NervousTissue is the main tissue component of the nervous system. The nervous system regulates and controls bodily
 * functions and activity and consists of two parts: the central nervous system (CNS) comprising the brain and spinal
 * cord, and the peripheral nervous system (PNS) comprising the branching peripheral nerves.
 *
 * @author RandomCatGit
 */
public class NervousTissue extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO NervousTissue
	 */
	public NervousTissue() {
		super(Arrays.asList(new Neuron()));
	}

}
