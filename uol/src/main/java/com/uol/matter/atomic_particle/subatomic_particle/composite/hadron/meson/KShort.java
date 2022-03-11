package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/*
 * RWO: KShort
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * KShort is short-lived neutral {@linkplain Kaon} that decays primarily into two pions.
 *
 * @author RandomCatGit
 */
public final class KShort extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO KShort
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO KShort
	 */
	public KShort() {
		setSpin(0);
		setMass(0.497624f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new DownQuark(), new StrangeAntiquark(), new StrangeQuark(), new DownAntiquark()));
	}

}
