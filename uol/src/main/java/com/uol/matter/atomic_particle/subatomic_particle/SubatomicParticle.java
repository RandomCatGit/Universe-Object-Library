package com.uol.matter.atomic_particle.subatomic_particle;

import java.util.List;

import com.uol.UniverseObjectLibrary;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * SubatomicParticle is the RWP class on common properties of all subatomic particles
 *
 * @author RandomCatGit
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class SubatomicParticle extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP SubatomicParticle
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * spin is the intrinsic angular momentum of particles
	 */
	private int spin;

	/**
	 * mass in GeV/c^2 (maximum value calculated in experiments)
	 */
	private float mass;

	/**
	 * electricCharge is unit of proton charge or +e, 1 unit = 1.6x10^-19 C
	 */
	private int electricCharge;

	/**
	 * compositeParticles are the list of constituent particles of the composite particle.
	 */
	// TODO subatomic particle composition is given as equation like uū - dd̅. Not sure how this works.
	// For now added all the quarks to the subatomic particle list.
	private List<SubatomicParticle> compositeParticles;

}
