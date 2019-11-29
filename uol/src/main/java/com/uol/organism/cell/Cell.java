package com.uol.organism.cell;

import java.util.List;

import com.uol.organism.Alive;
import com.uol.organism.cell.organelle.Organelle;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
 * RWP: Cell
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWP								18/05/2019
 */

/**
 * Cell is the RWP class of common properties of all Cells(Organisms).
 *
 * @author RandomCatGit
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Cell extends Alive {

	/**
	 * serialVersionUID for RWP Cell
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * organelles is the list of organelles present in the cell.
	 */
	private List<Organelle> organelles;
}
