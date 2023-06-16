package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/**
 * PhiMeson is a vector meson formed of a {@linkplain StrangeQuark} and a {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public final class PhiMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO PhiMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO PhiMeson
	 */
	public PhiMeson() {
		setSpin(0);
		setMass(1.019465f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new StrangeQuark(), new StrangeAntiquark()));
	}

}
