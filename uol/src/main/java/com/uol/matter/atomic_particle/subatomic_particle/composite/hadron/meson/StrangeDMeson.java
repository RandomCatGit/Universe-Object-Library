package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;

/**
 * StrangeDMeson is a {@linkplain DMeson} with an {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public final class StrangeDMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO StrangeDMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO StrangeDMeson
	 * 
	 * @param charge can take values -1 or 1
	 * @throws IllegalArgumentException
	 */
	public StrangeDMeson(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) != 1) {
			throw new IllegalArgumentException("StrangeDMesons can contain only -1 or 1 charge");
		}
		setSpin(0);
		setMass(1.9688f);
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(new CharmQuark(), new StrangeAntiquark()));
	}

}
