package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.Arrays;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/**
 * XiResonanceBaryon is an excited baryon state with short half lives and higher masses.
 *
 * @author RandomCatGit
 */
public final class XiResonanceBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO XiResonanceBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO XiResonanceBaryon
	 * 
	 * @param charge can take values -1 or 0
	 * @throws IllegalArgumentException
	 */
	public XiResonanceBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 || charge != -1) {
			throw new IllegalArgumentException("XiResonanceBaryon can contain only 0 or -1 charge");
		}
		setSpin(3 / 2);
		switch (charge) {
		case 0:
			setMass(1.53212f);
			break;
		case -1:
			setMass(1.5356f);
			break;
		default:
			throw new IllegalArgumentException("XiResonanceBaryon can contain only 0 or -1 charge");
		}
		setElectricCharge(charge);
		setCompositeParticles(Arrays.asList(charge == 0 ? new UpQuark() : new DownQuark(), new StrangeQuark(), new StrangeQuark()));
	}

}
