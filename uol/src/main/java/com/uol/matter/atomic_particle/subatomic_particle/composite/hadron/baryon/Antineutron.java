package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;

/*
 * RWO: Antineutron
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * Antineutron is the antiparticle of the {@linkplain Neutron}.
 * 
 * @author RandomCatGit
 */
public class Antineutron extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Antineutron
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor for RWO Antineutron
	 */
	public Antineutron() {
		setSpin(1 / 2);
		setMass(0.939565641f);
		setElectricCharge(0);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				particles.add(new UpAntiquark());
				particles.add(new DownAntiquark());
				particles.add(new DownAntiquark());
				return particles;
			}
		}.getParticles();
	}

}
