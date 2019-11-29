package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.StrangeQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: BottomXiBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * BottomXiBaryon is a {@linkplain XiBaryon} with a {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public class BottomXiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO BottomXiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO BottomXiBaryon
	 * 
	 * @param charge can take values 0 or -1
	 * @throws IllegalArgumentException
	 */
	public BottomXiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != -1) {
			throw new IllegalArgumentException("BottomXiBaryon can contain only 0 or -1 charge");
		}
		setSpin(1 / 2);
		switch (charge) {
		case 0:
			setMass(5.795f);
			break;
		case -1:
			setMass(5.7959f); // There are 3 more mass in Cascade B BottomXiBaryon. Don't know difference.
			break;
		default:
			throw new IllegalArgumentException("BottomXiBaryon can contain only 0 or -1 charge");
		}
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
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
					throw new IllegalArgumentException("BottomXiBaryon can contain only 0 or -1 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
