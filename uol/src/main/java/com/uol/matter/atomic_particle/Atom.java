package com.uol.matter.atomic_particle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.uol.UniverseObjectLibrary;
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
 * RandomCatGit				Added isotope function						11/03/2022
 */

/**
 * Atom is the smallest part of matter that determines its properties.
 *
 * @author RandomCatGit
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Atom extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWO Atom
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * protons is the number of protons in the atom
	 */
	private int protons;

	/**
	 * neutrons is the number of neutrons in the atom
	 */
	private int neutrons;

	/**
	 * electrons is the number of electrons orbiting the atom
	 */
	private int electrons;

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
		this.protons = protons;
		this.neutrons = neutrons;
		this.electrons = electrons;
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

	/**
	 * getParticlesByCount method is used for getting a number of instance of a particular particle.
	 * 
	 * @param count        the number of particles
	 * @param particleName the (RWO) name of the particle
	 * @return list of particles with number as count
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public <T> List<T> getParticlesByCount(int count, Class<T> particleName) throws InstantiationException, IllegalAccessException {
		List<T> particles = new ArrayList<>(count);
		for (int i = 0; i < count; i++) {
			particles.add(particleName.newInstance());
		}
		return particles;
	}

	/**
	 * isIsotope method returns if the atom is an Isotope or not. An isotope is defined as an atom having different number
	 * of neutrons compared to its protons
	 * 
	 * @return true if the number of neutrons is different from the protons
	 */
	public boolean isIsotope() {
		return protons != neutrons;
	}

}
