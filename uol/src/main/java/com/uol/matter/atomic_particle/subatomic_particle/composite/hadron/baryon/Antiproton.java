package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;

/**
 * Antiproton is the antiparticle of {@linkplain Proton}. Antiprotons are stable, but they are typically short-lived,
 * since any collision with a {@linkplain Proton} will cause both particles to be annihilated in a burst of energy.
 *
 * @author RandomCatGit
 */
public final class Antiproton extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Antiproton
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO Antiproton
	 */
	public Antiproton() {
		setSpin(1 / 2);
		setMass(0.9382720871f);
		setElectricCharge(-1);
		setCompositeParticles(Arrays.asList(new UpAntiquark(), new UpAntiquark(), new DownAntiquark()));
	}

}
