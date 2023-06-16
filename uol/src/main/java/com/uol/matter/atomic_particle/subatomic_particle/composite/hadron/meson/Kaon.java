package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * Kaon is any of a group of four mesons distinguished by a quantum number called strangeness.
 *
 * @author RandomCatGit
 */
public final class Kaon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Kaon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Kaon
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public Kaon(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("Kaons can contain only -1, 0 or 1 charge");
		}
		setSpin(0);
		setMass(charge == 0 ? 0.49767f : 0.49369f);
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new DownQuark() : new UpQuark(), new StrangeAntiquark()));
	}

}
