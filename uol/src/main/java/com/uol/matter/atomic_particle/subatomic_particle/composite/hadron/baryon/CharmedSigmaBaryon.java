package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * CharmedSigmaBaryon is a {@linkplain SigmaBaryon} with a {@linkplain CharmQuark} instead of a
 * {@linkplain StrangeQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedSigmaBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedSigmaBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmedSigmaBaryon
	 * 
	 * @param charge can take values 0, 1 or 2
	 * @param spin   can take values 1/2 or 3/2
	 * @throws IllegalArgumentException
	 */
	public CharmedSigmaBaryon(int charge, int spin) throws IllegalArgumentException {
		if (charge != 0 && charge != 1 && charge != 2) {
			throw new IllegalArgumentException("CharmedSigmaBaryon can contain only 0, 1, or 2 charge");
		}
		if (spin != 1 / 2 && spin != 3 / 2) {
			throw new IllegalArgumentException("SigmaBaryon can contain only 1/2 or 3/2 spin");
		}
		setSpin(spin);
		switch (charge) {
		case 0:
			setMass(spin == 1 / 2 ? 2.4542f : 2.5185f);
			break;
		case 1:
			setMass(spin == 1 / 2 ? 1.192666f : 2.5198f);
			break;
		case 2:
			setMass(spin == 1 / 2 ? 2.4542f : 2.519f);
			break;
		default:
			throw new IllegalArgumentException("CharmedSigmaBaryon can contain only 0, 1, or 2 charge");
		}
		setElectricCharge(charge);
		switch (charge) {
		case 0:
			setCompositeParticles(Arrays.asList(new UpQuark(), new UpQuark(), new CharmQuark()));
			break;
		case 1:
			setCompositeParticles(Arrays.asList(new UpQuark(), new DownQuark(), new CharmQuark()));
			break;
		case 2:
			setCompositeParticles(Arrays.asList(new DownQuark(), new DownQuark(), new CharmQuark()));
			break;
		default:
			throw new IllegalArgumentException("CharmedSigmaBaryon can contain only 0, 1, or 2 charge");
		}
	}

}
