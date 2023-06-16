package com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;

/**
 * BottomQuark is known as b quark or the beauty quark, is a third-generation quark.
 *
 * @author RandomCatGit
 */
public class BottomQuark extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomQuark
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO BottomQuark
	 */
	public BottomQuark() {
		setSpin(1 / 2);
		setMass(4.3f);
		setElectricCharge(-1 / 3);
	}
}
