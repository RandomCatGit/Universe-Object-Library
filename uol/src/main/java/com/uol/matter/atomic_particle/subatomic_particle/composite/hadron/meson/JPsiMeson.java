package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;

/**
 * JPsiMeson is a subatomic particle, a flavor-neutral meson consisting of a {@linkplain CharmQuark} and a
 * {@linkplain CharmAntiquark}.
 *
 * @author RandomCatGit
 */
public final class JPsiMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO JPsiMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO JPsiMeson
	 */
	public JPsiMeson() {
		setSpin(1);
		setMass(3.096916f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new CharmQuark(), new CharmAntiquark()));
	}

}
