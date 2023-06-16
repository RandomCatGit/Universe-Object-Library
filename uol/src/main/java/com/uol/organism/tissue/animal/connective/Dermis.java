package com.uol.organism.tissue.animal.connective;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.Fibroblast;
import com.uol.organism.cell.multi_cell.eukaryote.animal.Macrophage;
import com.uol.organism.cell.multi_cell.eukaryote.animal.MastCell;
import com.uol.organism.tissue.Tissue;

/**
 * Dermis or corium is a layer of skin between the epidermis (with which it makes up the cutis) and subcutaneous
 * tissues, that primarily consists of dense irregular connective tissue and cushions the body from stress and strain.
 *
 * @author RandomCatGit
 */
public class Dermis extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Dermis
	 */
	public Dermis() {
		super(Arrays.asList(new Fibroblast(), new Macrophage(), new MastCell()));
	}

}
