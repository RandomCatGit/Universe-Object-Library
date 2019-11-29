package com.uol.matter.atomic_particle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon.Neutron;
import com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon.Proton;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.lepton.Electron;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

/*
 * RWO: Atom
 * 
 * Author					Description									Date
 * --------------------------------------------------------------------------------
 * RandomCatGit				Created RWO									22/12/2018
 * RandomCatGit				Added subatomic dependencies				25/12/2018
 */

/**
 * Atom is the smallest part of matter that determines its properties.
 *
 * @author RandomCatGit
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Atom extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO Atom
	 */
	private static final long serialVersionUID = 1L;

	@Setter(AccessLevel.NONE)
	private List<SubatomicParticle> atomicParticles = new ArrayList<>();

	/**
	 * Default constructor of RWO Atom
	 * 
	 * @param protons   the number of {@linkplain Proton} in the atom's nucleus.
	 * @param neutrons  the number of {@linkplain Neutron} in the atom's nucleus.
	 * @param electrons the number of {@linkplain Electron} in the atom's orbit.
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Atom(int protons, int neutrons, int electrons) throws InstantiationException, IllegalAccessException {
		atomicParticles.addAll(getParticlesByCount(protons, Proton.class));
		atomicParticles.addAll(getParticlesByCount(electrons, Electron.class));
		atomicParticles.addAll(getParticlesByCount(neutrons, Neutron.class));
	}

	/**
	 * getNetCharge method is used for getting the net charge of the Atom.
	 * 
	 * @return net charge of the atom
	 */
	public int getNetCharge() {
		AtomicInteger netCharge = new AtomicInteger();
		atomicParticles.forEach(atomicParticles -> {
			netCharge.addAndGet(atomicParticles.getElectricCharge());
		});
		return netCharge.get();
	}

}
