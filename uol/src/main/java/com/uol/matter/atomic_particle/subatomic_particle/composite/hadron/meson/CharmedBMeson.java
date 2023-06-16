package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;

/**
 * CharmedBMeson is meson composed of a {@linkplain BottomAntiquark} and a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedBMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedBMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedBMeson
	 */
	public CharmedBMeson() {
		setSpin(0);
		setMass(6.2761f);
		setElectricCharge(1);
		setCompositeParticles(Arrays.asList(new CharmQuark(), new BottomAntiquark()));
	}

}
