package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;

/*
 * RWO: UpsilonMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * UpsilonMeson is a quarkonium state (i.e. flavourless meson) formed from a {@linkplain BottomQuark} and its
 * antiparticle.
 *
 * @author RandomCatGit
 */
public final class UpsilonMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO UpsilonMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO UpsilonMeson
	 */
	public UpsilonMeson() {
		setSpin(1);
		setMass(9.46056f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new BottomQuark(), new BottomAntiquark()));
	}

}
