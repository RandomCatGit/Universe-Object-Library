package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;

/**
 * CharmedEtaMeson is a form of quarkonium and is made of {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedEtaMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedEtaMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO CharmedEtaMeson
	 */
	public CharmedEtaMeson() {
		setSpin(0);
		setMass(2.9843f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new CharmQuark(), new CharmQuark()));
	}

}
