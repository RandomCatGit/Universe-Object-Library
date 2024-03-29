package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * CharmedXiResonanceBaryon is a {@linkplain XiResonanceBaryon} with a {@linkplain CharmQuark}.
 *
 * @author RandomCatGit
 */
public final class CharmedXiResonanceBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedXiResonanceBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmedXiResonanceBaryon
	 * 
	 * @param charge can take values 0 or 1
	 * @throws IllegalArgumentException
	 */
	public CharmedXiResonanceBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != 1) {
			throw new IllegalArgumentException("CharmedXiResonanceBaryon can contain only 0 or 1 charge");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 0:
			setMass(2.5809f);
			break;
		case 1:
			setMass(2.5788f);
			break;
		default:
			throw new IllegalArgumentException("CharmedXiResonanceBaryon can contain only 0 or 1 charge");
		}
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new DownQuark() : new UpQuark(), new StrangeQuark(), new CharmQuark()));
	}

}
