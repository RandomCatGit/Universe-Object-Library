package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: BottomOmegaBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * BottomOmegaBaryon is an {@linkplain OmegaBaryon} with a {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public final class BottomOmegaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomOmegaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO BottomOmegaBaryon
	 */
	public BottomOmegaBaryon() {
		setSpin(1 / 2);
		setMass(6.0612f);
		setElectricCharge(-1);
		setCompositeParticles(Arrays.asList(new StrangeQuark(), new StrangeQuark(), new BottomQuark()));
	}

}
