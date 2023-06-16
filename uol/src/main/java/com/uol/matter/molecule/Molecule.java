package com.uol.matter.molecule;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.uol.UniverseObjectLibrary;
import com.uol.matter.element.Element;
import com.uol.matter.element.metal.actinide.Actinium;
import com.uol.matter.element.metal.actinide.Americium;
import com.uol.matter.element.metal.actinide.Berkelium;
import com.uol.matter.element.metal.actinide.Californium;
import com.uol.matter.element.metal.actinide.Curium;
import com.uol.matter.element.metal.actinide.Einsteinium;
import com.uol.matter.element.metal.actinide.Fermium;
import com.uol.matter.element.metal.actinide.Lawrencium;
import com.uol.matter.element.metal.actinide.Mendelevium;
import com.uol.matter.element.metal.actinide.Neptunium;
import com.uol.matter.element.metal.actinide.Nobelium;
import com.uol.matter.element.metal.actinide.Plutonium;
import com.uol.matter.element.metal.actinide.Protactinium;
import com.uol.matter.element.metal.actinide.Thorium;
import com.uol.matter.element.metal.actinide.Uranium;
import com.uol.matter.element.metal.alkali_metal.Caesium;
import com.uol.matter.element.metal.alkali_metal.Francium;
import com.uol.matter.element.metal.alkali_metal.Lithium;
import com.uol.matter.element.metal.alkali_metal.Potassium;
import com.uol.matter.element.metal.alkali_metal.Rubidium;
import com.uol.matter.element.metal.alkali_metal.Sodium;
import com.uol.matter.element.metal.alkaline_earth_metal.Barium;
import com.uol.matter.element.metal.alkaline_earth_metal.Beryllium;
import com.uol.matter.element.metal.alkaline_earth_metal.Calcium;
import com.uol.matter.element.metal.alkaline_earth_metal.Magnesium;
import com.uol.matter.element.metal.alkaline_earth_metal.Radium;
import com.uol.matter.element.metal.alkaline_earth_metal.Strontium;
import com.uol.matter.element.metal.lanthanide.Cerium;
import com.uol.matter.element.metal.lanthanide.Dysprosium;
import com.uol.matter.element.metal.lanthanide.Erbium;
import com.uol.matter.element.metal.lanthanide.Europium;
import com.uol.matter.element.metal.lanthanide.Gadolinium;
import com.uol.matter.element.metal.lanthanide.Holmium;
import com.uol.matter.element.metal.lanthanide.Lanthanum;
import com.uol.matter.element.metal.lanthanide.Lutetium;
import com.uol.matter.element.metal.lanthanide.Neodymium;
import com.uol.matter.element.metal.lanthanide.Praseodymium;
import com.uol.matter.element.metal.lanthanide.Promethium;
import com.uol.matter.element.metal.lanthanide.Samarium;
import com.uol.matter.element.metal.lanthanide.Terbium;
import com.uol.matter.element.metal.lanthanide.Thulium;
import com.uol.matter.element.metal.lanthanide.Ytterbium;
import com.uol.matter.element.metal.post_transition_metal.Aluminium;
import com.uol.matter.element.metal.post_transition_metal.Bismuth;
import com.uol.matter.element.metal.post_transition_metal.Cadmium;
import com.uol.matter.element.metal.post_transition_metal.Copernicium;
import com.uol.matter.element.metal.post_transition_metal.Gallium;
import com.uol.matter.element.metal.post_transition_metal.Indium;
import com.uol.matter.element.metal.post_transition_metal.Lead;
import com.uol.matter.element.metal.post_transition_metal.Mercury;
import com.uol.matter.element.metal.post_transition_metal.Polonium;
import com.uol.matter.element.metal.post_transition_metal.Thallium;
import com.uol.matter.element.metal.post_transition_metal.Tin;
import com.uol.matter.element.metal.post_transition_metal.Zinc;
import com.uol.matter.element.metal.transition_metal.Bohrium;
import com.uol.matter.element.metal.transition_metal.Chromium;
import com.uol.matter.element.metal.transition_metal.Cobalt;
import com.uol.matter.element.metal.transition_metal.Copper;
import com.uol.matter.element.metal.transition_metal.Dubnium;
import com.uol.matter.element.metal.transition_metal.Gold;
import com.uol.matter.element.metal.transition_metal.Hafnium;
import com.uol.matter.element.metal.transition_metal.Hassium;
import com.uol.matter.element.metal.transition_metal.Iridium;
import com.uol.matter.element.metal.transition_metal.Iron;
import com.uol.matter.element.metal.transition_metal.Manganese;
import com.uol.matter.element.metal.transition_metal.Molybdenum;
import com.uol.matter.element.metal.transition_metal.Nickel;
import com.uol.matter.element.metal.transition_metal.Niobium;
import com.uol.matter.element.metal.transition_metal.Osmium;
import com.uol.matter.element.metal.transition_metal.Palladium;
import com.uol.matter.element.metal.transition_metal.Platinum;
import com.uol.matter.element.metal.transition_metal.Rhenium;
import com.uol.matter.element.metal.transition_metal.Rhodium;
import com.uol.matter.element.metal.transition_metal.Ruthenium;
import com.uol.matter.element.metal.transition_metal.Rutherfordium;
import com.uol.matter.element.metal.transition_metal.Scandium;
import com.uol.matter.element.metal.transition_metal.Seaborgium;
import com.uol.matter.element.metal.transition_metal.Silver;
import com.uol.matter.element.metal.transition_metal.Tantalum;
import com.uol.matter.element.metal.transition_metal.Technetium;
import com.uol.matter.element.metal.transition_metal.Titanium;
import com.uol.matter.element.metal.transition_metal.Tungsten;
import com.uol.matter.element.metal.transition_metal.Vanadium;
import com.uol.matter.element.metal.transition_metal.Yttrium;
import com.uol.matter.element.metal.transition_metal.Zirconium;
import com.uol.matter.element.metalloid.Antimony;
import com.uol.matter.element.metalloid.Arsenic;
import com.uol.matter.element.metalloid.Astatine;
import com.uol.matter.element.metalloid.Boron;
import com.uol.matter.element.metalloid.Germanium;
import com.uol.matter.element.metalloid.Silicon;
import com.uol.matter.element.metalloid.Tellurium;
import com.uol.matter.element.nonmetal.noble_gas.Argon;
import com.uol.matter.element.nonmetal.noble_gas.Helium;
import com.uol.matter.element.nonmetal.noble_gas.Krypton;
import com.uol.matter.element.nonmetal.noble_gas.Neon;
import com.uol.matter.element.nonmetal.noble_gas.Radon;
import com.uol.matter.element.nonmetal.noble_gas.Xenon;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Bromine;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Carbon;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Chlorine;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Fluorine;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Hydrogen;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Iodine;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Nitrogen;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Oxygen;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Phosphorus;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Selenium;
import com.uol.matter.element.nonmetal.reactive_nonmetal.Sulfur;
import com.uol.matter.element.nonmetal.reactive_nonmetal.isotope.Deuterium;
import com.uol.matter.element.nonmetal.reactive_nonmetal.isotope.Tritium;
import com.uol.matter.element.undetermined.Darmstadtium;
import com.uol.matter.element.undetermined.Flerovium;
import com.uol.matter.element.undetermined.Livermorium;
import com.uol.matter.element.undetermined.Meitnerium;
import com.uol.matter.element.undetermined.Moscovium;
import com.uol.matter.element.undetermined.Nihonium;
import com.uol.matter.element.undetermined.Oganesson;
import com.uol.matter.element.undetermined.Roentgenium;
import com.uol.matter.element.undetermined.Tennessine;

import edu.mines.jtk.util.AtomicFloat;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Molecule is the RWP class on common properties of all Molecules
 *
 * @author RandomCatGit
 */
@Getter
@Setter(AccessLevel.NONE)
@EqualsAndHashCode(callSuper = true)
public class Molecule extends UniverseObjectLibrary {

	/**
	 * serialVersionUID for RWP Molecule
	 */
	private static final long serialVersionUID = 0L;

	/**
	 * elements is the map Element present in the molecule to number of parts of it in the same.
	 */
	private Map<Element, Float> elements;

	/**
	 * molecularFormula is the molecular formula of the molecule. This molecularFormula should contain the symbols of
	 * each {@linkplain Element} followed by the number of parts of the element in the molecule. A sample
	 * molecularFormula is nXm^-c where n is the proportion of the molecule in the whole, m is the number of elements in
	 * the molecule, a number followed by ^ symbol denotes the ionic state of the molecule. Based on this formula, the
	 * {@linkplain Element} will get generated automatically.
	 */
	private String molecularFormula;

	/**
	 * casNumber is a unique numerical identifier assigned by the Chemical Abstracts Service (CAS) to every chemical
	 * substance described in the open scientific literature.
	 */
	private String casNumber;

	/**
	 * subMolecules is the compounded molecular list of the current molecule, made up of one or more existing molecular
	 * RWO structures.
	 */
	private List<Molecule> subMolecules;

	/**
	 * Default constructor of RWO Molecule
	 * 
	 * @param molecularFormula of the molecule
	 * @param casNumber        of the molecule
	 */
	public Molecule(String formula, String casNumber) {
		this.molecularFormula = formula;
		this.casNumber = casNumber;
		this.elements = getElementMapFromString(formula);
	}

	/**
	 * Molecular list constructor
	 * 
	 */
	public Molecule(List<Molecule> molecules) {
		this.subMolecules = molecules;
	}

	/**
	 * listElements method is used for returning a list of all the elements present in the molecule.
	 * 
	 * @return elementList the list containing each element of the molecule
	 */
	public List<Element> listElements() {
		List<Element> elementList = new LinkedList<Element>();
		getElements().forEach((element, count) -> {
			for (int i = 0; i < count; i++) {
				elementList.add(element);
			}
		});
		return elementList;
	}

	/**
	 * getMolecularMass method is used for calculating and getting the net molecular weight.
	 * 
	 * @return aggregate weight of all the elements in the molecule.
	 */
	public float getMolecularMass() {
		AtomicFloat aggregateMass = new AtomicFloat();
		getElements().forEach((element, count) -> {
			aggregateMass.addAndGet(element.getAtomicMass() * count);
		});
		return aggregateMass.get();
	}

	/**
	 * getElemListFromString method is used for getting the element map for a given molecularFormula.
	 * 
	 * @param molecularFormula that has all the elements in the molecule
	 * @return map of element to their count in the molecule.
	 */
	private LinkedHashMap<Element, Float> getElementMapFromString(String molecularFormula) {
		String elems = getElemSymbolRegex();
		String elemRegex = "(" + elems + "|(\\d+\\.*\\d*))|\\(|\\)|n";
		Pattern pat = Pattern.compile(elemRegex);
		Matcher mat = pat.matcher(molecularFormula);
		List<String> tokens = new LinkedList<>();
		while (mat.find()) {
			String currentToken = molecularFormula.substring(mat.start(), mat.end());
			tokens.add(currentToken);
		}
		LinkedHashMap<Element, Float> molecule = new LinkedHashMap<>();
		Element currentElem = null;
		AtomicFloat numberMultiplier = new AtomicFloat(1f);
		for (int i = 0; i < tokens.size(); i++) {
			if (tokens.get(i).equals("(")) {
				// group starts
				int closure = getClosure(tokens, i);
				AtomicFloat multiplier = new AtomicFloat(1f);
				LinkedHashMap<Element, Float> innerMols = getElementMapFromString(getClosureString(tokens, i, closure));
				if (!tokens.get(closure + 1).matches(elems)) { // if next one is not a number
					if (tokens.get(closure + 1).equals("n")) {
						tokens.set(closure + 1, "1"); // temp fix
					}
					multiplier.set(Float.parseFloat(tokens.get(closure + 1)));
					i = closure + 1;
				}
				innerMols.forEach((innerm, count) -> {
					if (!molecule.containsKey(innerm)) {
						molecule.put(innerm, count * multiplier.get() * numberMultiplier.get());
					} else {
						molecule.put(innerm,
								(molecule.get(innerm) + count * multiplier.get()) * numberMultiplier.get());
					}
				});
				currentElem = null;
			} else if (tokens.get(i).matches(elems)) {
				currentElem = getCheckElem(molecule, tokens.get(i)); // to remove duplicate object key problem
				if (!molecule.containsKey(currentElem)) {
					molecule.put(currentElem, 1f * numberMultiplier.get());
				} else {
					molecule.put(currentElem, molecule.get(currentElem) + numberMultiplier.get());
				}
			} else if (currentElem != null) { // differentiate pre and post number
				molecule.put(currentElem, (molecule.get(currentElem) * Float.parseFloat(tokens.get(i))));
				currentElem = null;
			} else { // currentElem is null; number before element
				numberMultiplier.set(Float.parseFloat(tokens.get(i)));
			}
		}
		return molecule;
	}

	/**
	 * getElemSymbolRegex method is used for getting the regex for finding an element.
	 * 
	 * @return element regex
	 */
	private String getElemSymbolRegex() {
		return "Zr|Zn|Yb|Y|Xe|W|V|U|Ts|Tm|Tl|Ti|Th|Te|Tc|Tb|Ta|T|Sr|Sn|Sm|Si|Sg|Se|Sc|Sb|S|Ru|Rn|Rh|Rg|Rf|Re|Rb|Ra|Pu|Pt|Pr|Po|Pm|Pd|Pb|Pa|P|Os|Og|O|Np|No|Ni|Nh|Ne|Nd|Nb|Na|N|Mt|Mo|Mn|Mg|Md|Mc|Lv|Lu|Lr|Li|La|Kr|K|Ir|In|I|Hs|Ho|Hg|Hf|He|H|Ge|Gd|Ga|Fr|Fm|Fl|Fe|F|Eu|Es|Er|Dy|Ds|Db|D|Cu|Cs|Cr|Co|Cn|Cm|Cl|Cf|Ce|Cd|Ca|C|Br|Bk|Bi|Bh|Be|Ba|B|Au|At|As|Ar|Am|Al|Ag|Ac";
	}

	/**
	 * getCheckElem method is used for maintaining a single instance of an element in the molecule.
	 * 
	 * @param molecule as map of element to the count
	 * @param symbol   of the element to find
	 * @return
	 */
	private Element getCheckElem(LinkedHashMap<Element, Float> molecule, String symbol) {
		List<Element> filterList = molecule.keySet().stream().filter(k -> k.getSymbol().equals(symbol))
				.collect(Collectors.toList());
		if (filterList.isEmpty()) {
			return getElemFromSymbol(symbol);
		} else {
			return filterList.get(0);
		}
	}

	/**
	 * getElementFromSymbol method is used for getting {@linkplain @Element} instance for corresponding symbol.
	 * 
	 * @param symbol
	 * @return
	 */
	private Element getElementFromSymbol(String symbol) {
		try {
			switch (symbol) {
			case "Zr":
				return new Zirconium();
			case "Zn":
				return new Zinc();
			case "Yb":
				return new Ytterbium();
			case "Y":
				return new Yttrium();
			case "Xe":
				return new Xenon();
			case "W":
				return new Tungsten();
			case "V":
				return new Vanadium();
			case "U":
				return new Uranium();
			case "Ts":
				return new Tennessine();
			case "Tm":
				return new Thulium();
			case "Tl":
				return new Thallium();
			case "Ti":
				return new Titanium();
			case "Th":
				return new Thorium();
			case "Te":
				return new Tellurium();
			case "Tc":
				return new Technetium();
			case "Tb":
				return new Terbium();
			case "Ta":
				return new Tantalum();
			case "T":
				return new Tritium();
			case "Sr":
				return new Strontium();
			case "Sn":
				return new Tin();
			case "Sm":
				return new Samarium();
			case "Si":
				return new Silicon();
			case "Sg":
				return new Seaborgium();
			case "Se":
				return new Selenium();
			case "Sc":
				return new Scandium();
			case "Sb":
				return new Antimony();
			case "S":
				return new Sulfur();
			case "Ru":
				return new Ruthenium();
			case "Rn":
				return new Radon();
			case "Rh":
				return new Rhodium();
			case "Rg":
				return new Roentgenium();
			case "Rf":
				return new Rutherfordium();
			case "Re":
				return new Rhenium();
			case "Rb":
				return new Rubidium();
			case "Ra":
				return new Radium();
			case "Pu":
				return new Plutonium();
			case "Pt":
				return new Platinum();
			case "Pr":
				return new Praseodymium();
			case "Po":
				return new Polonium();
			case "Pm":
				return new Promethium();
			case "Pd":
				return new Palladium();
			case "Pb":
				return new Lead();
			case "Pa":
				return new Protactinium();
			case "P":
				return new Phosphorus();
			case "Os":
				return new Osmium();
			case "Og":
				return new Oganesson();
			case "O":
				return new Oxygen();
			case "Np":
				return new Neptunium();
			case "No":
				return new Nobelium();
			case "Ni":
				return new Nickel();
			case "Nh":
				return new Nihonium();
			case "Ne":
				return new Neon();
			case "Nd":
				return new Neodymium();
			case "Nb":
				return new Niobium();
			case "Na":
				return new Sodium();
			case "N":
				return new Nitrogen();
			case "Mt":
				return new Meitnerium();
			case "Mo":
				return new Molybdenum();
			case "Mn":
				return new Manganese();
			case "Mg":
				return new Magnesium();
			case "Md":
				return new Mendelevium();
			case "Mc":
				return new Moscovium();
			case "Lv":
				return new Livermorium();
			case "Lu":
				return new Lutetium();
			case "Lr":
				return new Lawrencium();
			case "Li":
				return new Lithium();
			case "La":
				return new Lanthanum();
			case "Kr":
				return new Krypton();
			case "K":
				return new Potassium();
			case "Ir":
				return new Iridium();
			case "In":
				return new Indium();
			case "I":
				return new Iodine();
			case "Hs":
				return new Hassium();
			case "Ho":
				return new Holmium();
			case "Hg":
				return new Mercury();
			case "Hf":
				return new Hafnium();
			case "He":
				return new Helium();
			case "H":
				return new Hydrogen();
			case "Ge":
				return new Germanium();
			case "Gd":
				return new Gadolinium();
			case "Ga":
				return new Gallium();
			case "Fr":
				return new Francium();
			case "Fm":
				return new Fermium();
			case "Fl":
				return new Flerovium();
			case "Fe":
				return new Iron();
			case "F":
				return new Fluorine();
			case "Eu":
				return new Europium();
			case "Es":
				return new Einsteinium();
			case "Er":
				return new Erbium();
			case "Dy":
				return new Dysprosium();
			case "Ds":
				return new Darmstadtium();
			case "Db":
				return new Dubnium();
			case "D":
				return new Deuterium();
			case "Cu":
				return new Copper();
			case "Cs":
				return new Caesium();
			case "Cr":
				return new Chromium();
			case "Co":
				return new Cobalt();
			case "Cn":
				return new Copernicium();
			case "Cm":
				return new Curium();
			case "Cl":
				return new Chlorine();
			case "Cf":
				return new Californium();
			case "Ce":
				return new Cerium();
			case "Cd":
				return new Cadmium();
			case "Ca":
				return new Calcium();
			case "C":
				return new Carbon();
			case "Br":
				return new Bromine();
			case "Bk":
				return new Berkelium();
			case "Bi":
				return new Bismuth();
			case "Bh":
				return new Bohrium();
			case "Be":
				return new Beryllium();
			case "Ba":
				return new Barium();
			case "B":
				return new Boron();
			case "Au":
				return new Gold();
			case "At":
				return new Astatine();
			case "As":
				return new Arsenic();
			case "Ar":
				return new Argon();
			case "Am":
				return new Americium();
			case "Al":
				return new Aluminium();
			case "Ag":
				return new Silver();
			case "Ac":
				return new Actinium();
			default:
				throw new ClassNotFoundException("Element not found");
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * getElemFromSymbol method is used for getting {@linkplain Element} object from symbol of element.
	 * 
	 * @param currentElem
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	private Element getElemFromSymbol(String currentElem) {
		Element classInstance = getElementFromSymbol(currentElem);
		if (classInstance == null) {
			System.out.println("missing class " + currentElem);
			return null;
		} else {
			return classInstance;
		}
	}

	/**
	 * getClosureString method is used for getting the inner molecule String from the tokens.
	 * 
	 * @param tokens
	 * @param i
	 * @param closure
	 * @return
	 */
	private String getClosureString(List<String> tokens, int i, int closure) {
		StringBuilder sb = new StringBuilder();
		for (int p = i + 1; p < closure; p++) {
			sb.append(tokens.get(p));
		}
		return sb.toString();
	}

	/**
	 * getClosure method is used for getting the ending index for an open brace.
	 * 
	 * @param tokens
	 * @param i
	 */
	private int getClosure(List<String> tokens, int i) {
		int temp = 1;
		for (int j = i + 1; j < tokens.size(); j++) {
			if (tokens.get(j).equals("(")) {
				temp++;
			} else if (tokens.get(j).equals(")")) {
				temp--;
			}
			if (temp == 0) {
				return j;
			}
		}
		return 0;
	}

}
