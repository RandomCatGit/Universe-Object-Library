package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: XiResonanceBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * XiResonanceBaryon is an excited baryon state with short half lives and higher masses.
 *
 * @author RandomCatGit
 */
public class XiResonanceBaryon extends SubatomicParticle {

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
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() throws IllegalArgumentException {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 0:
					particles.add(new UpQuark());
					particles.add(new StrangeQuark());
					particles.add(new StrangeQuark());
					break;
				case -1:
					particles.add(new DownQuark());
					particles.add(new StrangeQuark());
					particles.add(new StrangeQuark());
					break;
				default:
					throw new IllegalArgumentException("XiResonanceBaryon can contain only 0 or -1 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
