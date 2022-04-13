package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: StrangeBMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * StrangeBMeson is meson composed of a {@linkplain BottomAntiquark} and a {@linkplain StrangeQuark}.
 *
 * @author RandomCatGit
 */
public final class StrangeBMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO StrangeBMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO StrangeBMeson
	 */
	public StrangeBMeson() {
		setSpin(0);
		setMass(5.36702f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new StrangeQuark(), new BottomAntiquark()));
	}

}
