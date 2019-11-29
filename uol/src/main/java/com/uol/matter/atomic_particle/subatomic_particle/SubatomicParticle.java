package com.uol.matter.atomic_particle.subatomic_particle;

import java.util.ArrayList;
import java.util.List;

import com.uol.UniverseObjectLibrary;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
 * RWP: SubatomicParticle
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWP							23/12/2018
 */

/**
 * SubatomicParticle is the RWP class on common properties of all subatomic particles
 *
 * @author RandomCatGit
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SubatomicParticle extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP SubatomicParticle
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * spin is the intrinsic angular momentum of particles
	 */
	private int spin;

	/**
	 * mass in GeV/c^2 (maximum value calculated in experiments)
	 */
	private float mass;

	/**
	 * electricCharge is unit of proton charge or +e, 1 unit = 1.6x10^-19 C
	 */
	private int electricCharge;

	/**
	 * compositeParticles are the list of constituent particles of the composite particle.
	 */
	@Getter
	@Setter(AccessLevel.NONE) // setting value to compositeParticles prevented.
	protected List<SubatomicParticle> compositeParticles;

	/**
	 * getParticlesByCount method is used for getting a number of instance of a particular particle.
	 * 
	 * @param count        the number of particles
	 * @param particleName the (RWO) name of the particle
	 * @return list of particles with number as count
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public <T> List<T> getParticlesByCount(int count, Class<T> particleName)
			throws InstantiationException, IllegalAccessException {
		List<T> particles = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			particles.add(particleName.newInstance());
		}
		return particles;
	}

	/**
	 * CompositeProperties is class with properties common to composite subatomic particles.
	 *
	 * @author RandomCatGit
	 */
	public abstract class CompositeProperties {

		// TODO subatomic particle composition is given as equation like uū - dd̅. Not sure how this works.
		// For now added all the quarks to the subatomic particle list.
		/**
		 * getParticles method is used for getting subatomic particles of composite particles.
		 * 
		 * @return particles of the composite particle.
		 * @throws IllegalArgumentException for providing invalid parameters.
		 */
		public abstract List<SubatomicParticle> getParticles() throws IllegalArgumentException;
	}

}
