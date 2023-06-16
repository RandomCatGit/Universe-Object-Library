package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * Pion or pi meson is the lightest meson and, more generally, the lightest hadron. Each pion consists of a quark and an
 * antiquark.
 *
 * @author RandomCatGit
 */
public final class Pion extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Pion
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO Pion
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public Pion(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("Pions can contain only -1, 0 or 1 charge");
		}
		setSpin(0);
		setMass(charge == 0 ? 0.1349772f : 0.13957053f);
		setElectricCharge(charge);

		if (charge == 0) {
			setCompositeParticles(Arrays.asList(new UpQuark(), new UpAntiquark(), new DownQuark(), new DownAntiquark()));
		} else {
			setCompositeParticles(Arrays.asList(new UpQuark(), new DownAntiquark()));
		}
	}

}
