package com.uol.organism.tissue.animal.connective;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.BrownFatCell;
import com.uol.organism.tissue.Tissue;

/*
 * RWO: WhiteAdiposeTissue
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								22/10/2019
 */

/**
 * WhiteAdiposeTissue (WAT) is used for energy storage. Upon release of insulin from the pancreas, white adipose cells'
 * insulin receptors cause a dephosphorylation cascade that lead to the inactivation of hormone-sensitive lipase.
 *
 * @author RandomCatGit
 */
public class WhiteAdiposeTissue extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO WhiteAdiposeTissue
	 */
	public WhiteAdiposeTissue() {
		super(Arrays.asList(new BrownFatCell()));
	}

}
