package com.uol.organism.tissue.animal.connective;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.BrownFatCell;
import com.uol.organism.tissue.Tissue;

/**
 * BrownAdiposeTissue (BAT) or brown fat makes up the adipose organ together with white adipose tissue (or white fat).
 * Brown adipose tissue is found in almost all mammals.
 *
 * @author RandomCatGit
 */
public class BrownAdiposeTissue extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO BrownAdiposeTissue
	 */
	public BrownAdiposeTissue() {
		super(Arrays.asList(new BrownFatCell()));
	}

}
