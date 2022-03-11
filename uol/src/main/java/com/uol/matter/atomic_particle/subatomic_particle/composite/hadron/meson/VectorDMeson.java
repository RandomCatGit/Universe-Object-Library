package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;

/*
 * RWO: VectorDMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * VectorDMeson is a meson with total unit spin and odd parity.
 *
 * @author RandomCatGit
 */
public final class VectorDMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO VectorDMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO VectorDMeson
	 * 
	 * @param charge can take values -1, 0 or 1
	 * @throws IllegalArgumentException
	 */
	public VectorDMeson(int charge) throws IllegalArgumentException {
		if (Math.abs(charge) > 1) {
			throw new IllegalArgumentException("VectorDMesons can contain only -1, 0 or 1 charge");
		}
		setSpin(1);
		setMass(charge == 0 ? 2.00717f : 2.01044f);
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new UpAntiquark() : new DownAntiquark(), new CharmQuark()));
	}

}
