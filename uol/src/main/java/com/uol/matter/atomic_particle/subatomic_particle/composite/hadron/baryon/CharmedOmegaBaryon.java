package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;

/**
 * CharmedOmegaBaryon is an {@linkplain OmegaBaryon} with a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedOmegaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedOmegaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedOmegaBaryon
	 */
	public CharmedOmegaBaryon() {
		setSpin(1 / 2);
		setMass(2.7001f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new StrangeQuark(), new StrangeQuark(), new CharmQuark()));
	}

}
