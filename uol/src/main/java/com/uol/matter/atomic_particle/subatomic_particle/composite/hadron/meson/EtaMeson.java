package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.meson;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: EtaMeson
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * EtaMeson is an isosinglet meson made of a mixture of {@linkplain UpQuark}, {@linkplain DownQuark} and
 * {@linkplain StrangeQuark} and their antiquarks, {@linkplain UpAntiquark}, {@linkplain DownAntiquark} and
 * {@linkplain StrangeAntiquark}.
 *
 * @author RandomCatGit
 */
public class EtaMeson extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO EtaMeson
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO EtaMeson
	 */
	public EtaMeson() {
		setSpin(0);
		setMass(0.54788f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpQuark());
				particles.add(new UpAntiquark());
				particles.add(new DownQuark());
				particles.add(new DownAntiquark());
				particles.add(new StrangeQuark());
				particles.add(new StrangeAntiquark());
				particles.add(new StrangeQuark());
				particles.add(new StrangeAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
