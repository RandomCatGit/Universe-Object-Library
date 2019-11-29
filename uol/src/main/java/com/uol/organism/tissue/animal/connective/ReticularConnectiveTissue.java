package com.uol.organism.tissue.animal.connective;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.ReticularCell;
import com.uol.organism.tissue.Tissue;

/*
 * RWO: ReticularConnectiveTissue
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								22/10/2019
 */

/**
 * ReticularConnectiveTissue is a type of connective tissue with a network of reticular fibers, made of type III
 * collagen. Reticular fibers are not unique to reticular connective tissue, but only in this type are they dominant.
 *
 * @author RandomCatGit
 */
public class ReticularConnectiveTissue extends Tissue {

	/**
	 * serialVersionUID
	 */	
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO ReticularConnectiveTissue
	 */
	public ReticularConnectiveTissue() {
		super(Arrays.asList(new ReticularCell()));
	}

}
