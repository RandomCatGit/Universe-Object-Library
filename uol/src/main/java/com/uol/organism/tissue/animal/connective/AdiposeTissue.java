package com.uol.organism.tissue.animal.connective;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.Adipocyte;
import com.uol.organism.tissue.Tissue;

/*
 * RWO: AdiposeTissue
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								22/10/2019
 */

/**
 * AdiposeTissue is a loose connective tissue composed mostly of adipocytes. In addition to adipocytes, adipose tissue
 * contains the stromal vascular fraction (SVF) of cells including preadipocytes, fibroblasts, vascular endothelial
 * cells and a variety of immune cells such as adipose tissue macrophages.
 *
 * @author RandomCatGit
 */
public class AdiposeTissue extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO AdiposeTissue
	 */
	public AdiposeTissue() {
		super(Arrays.asList(new Adipocyte()));
	}

}
