package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: OmegaMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * OmegaMeson is a vector meson formed of a {@linkplain UpQuark}, {@linkplain UpAntiquark}, {@linkplain DownQuark} and
 * {@linkplain DownAntiquark}.
 *
 * @author RandomCatGit
 */
public final class OmegaMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO OmegaMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO OmegaMeson
	 */
	public OmegaMeson() {
		setSpin(0);
		setMass(7.8277f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new UpQuark(), new UpAntiquark(), new DownQuark(), new DownAntiquark()));
	}

}
