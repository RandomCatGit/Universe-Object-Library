package com.uol.organism.tissue;

import java.util.List;

import com.uol.organism.Alive;
import com.uol.organism.cell.Cell;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Tissue is the RWP class of common properties of all Tissues present in organisms.
 *
 * @author RandomCatGit
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Tissue extends Alive {

	/**
	 * serialVersionUID for RWP Tissue
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * cells is the list of cells present in the Tissue.
	 */
	private List<Cell> cells;
}
