package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: EtaPrimeMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 * RandomCatGit					Modified compositeParticles init		11/03/2022
 */

/**
 * EtaPrimeMeson is an isosinglet meson made of a mixture of {@linkplain UpQuark}, {@linkplain DownQuark} and
 * {@linkplain StrangeQuark} quarks and their antiquarks, {@linkplain UpAntiquark}, {@linkplain DownAntiquark} and
 * {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public final class EtaPrimeMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO EtaPrimeMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO EtaPrimeMeson
	 */
	public EtaPrimeMeson() {
		setSpin(0);
		setMass(0.95784f);
		setElectricCharge(0);
		setCompositeParticles(Arrays.asList(new UpQuark(), new UpAntiquark(), new DownQuark(), new DownAntiquark(), new StrangeQuark(), new StrangeAntiquark()));
	}

}
