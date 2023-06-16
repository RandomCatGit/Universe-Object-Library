package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownAntiquark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpAntiquark;

/**
 * Antineutron is the antiparticle of the {@linkplain Neutron}.
 * 
 * @author RandomCatGit
 */
public final class Antineutron extends SubatomicParticle {

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
		setCompositeParticles(Arrays.asList(new UpAntiquark(), new DownAntiquark(), new DownAntiquark()));
	}

}
