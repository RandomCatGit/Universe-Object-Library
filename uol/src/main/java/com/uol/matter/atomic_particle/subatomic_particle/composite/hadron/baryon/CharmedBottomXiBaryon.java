package com.uol.matter.atomic_particle.subatomic_particle.composite.hadron.baryon;

import java.util.ArrayList;
import java.util.List;

import com.uol.matter.atomic_particle.subatomic_particle.SubatomicParticle;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.BottomQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.CharmQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.DownQuark;
import com.uol.matter.atomic_particle.subatomic_particle.elementary.fermion.quark.UpQuark;

/*
 * RWO: CharmedBottomXiBaryon
 * 
 * Author 						Description 							Date
 * --------------------------------------------------------------------------------
 * RandomCatGit					Created RWO								25/12/2018
 */

/**
 * CharmedBottomXiBaryon is a {@linkplain XiBaryon} with charm and {@linkplain BottomQuark}.
 *
 * @author RandomCatGit
 */
public class CharmedBottomXiBaryon extends SubatomicParticle {

	/**
	 * serialVersionUID for RWO CharmedBottomXiBaryon
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * Default constructor of RWO CharmedBottomXiBaryon
	 * 
	 * @param charge can take values 0 or 1
	 * @throws IllegalArgumentException
	 */
	public CharmedBottomXiBaryon(int charge) throws IllegalArgumentException {
		if (charge != 0 && charge != 1) {
			throw new IllegalArgumentException("CharmedBottomXiBaryon can contain only 0 or 1 charge");
		}
		setSpin(1 / 2);
		// setMass(); // Mass unknown
		setElectricCharge(charge);
		compositeParticles = new CompositeProperties() {

			@Override
			public List<SubatomicParticle> getParticles() {
				List<SubatomicParticle> particles = new ArrayList<>();
				switch (charge) {
				case 0:
					particles.add(new DownQuark());
					particles.add(new CharmQuark());
					particles.add(new BottomQuark());
					break;
				case 1:
					particles.add(new UpQuark());
					particles.add(new CharmQuark());
					particles.add(new BottomQuark());
					break;
				default:
					throw new IllegalArgumentException("CharmedBottomXiBaryon can contain only 0 or 1 charge");
				}
				return particles;
			}
		}.getParticles();
	}

}
