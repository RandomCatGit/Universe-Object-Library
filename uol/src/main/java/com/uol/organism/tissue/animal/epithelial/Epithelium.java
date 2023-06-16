package com.uol.organism.tissue.animal.epithelial;

import java.util.Arrays;

import com.uol.organism.cell.multi_cell.eukaryote.animal.EpithelialCell;
import com.uol.organism.tissue.Tissue;

import lombok.Getter;

/**
 * Epithelium is one of the four basic types of animal tissue. Epithelial tissues line the outer surfaces of organs and
 * blood vessels throughout the body, as well as the inner surfaces of cavities in many internal organs.
 *
 * @author RandomCatGit
 */
@Getter
public class Epithelium extends Tissue {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Shape is the shape of epithelial cells in the tissue.
	 */
	public enum Shape {
		SQUAMOUS, COLUMNAR, CUBOIDAL
	};

	/**
	 * Arrangement is the layer arrangement of epithelial cells in the tissue.
	 */
	public enum Arrangement {
		SIMPLE, STRATIFIED, PSEUDOSTRATIFIED, TRANSITIONAL
	};

	/**
	 * shape is the shape of individual epithelial cells.
	 */
	private Shape shape;

	/**
	 * arrangement is the layer arrangement of epithelial cells.
	 */
	private Arrangement arrangement;

	/**
	 * Default constructor of RWO Epithelium
	 */
	public Epithelium(Shape shape, Arrangement arrangement) {
		super(Arrays.asList(new EpithelialCell()));
		this.shape = shape;
		this.arrangement = arrangement;
	}

}
