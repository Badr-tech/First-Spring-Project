package ma.jit.First_Spring_Project.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
	
	@Autowired
	@Qualifier(value = "duplex")
	private IChambre chambre;

	@Override
	public String toString() {
		return "Hotel [nombre personne=" + chambre.getNbPersonne() + "]";
	}

	/**
	 * @return the chambre
	 */
	public IChambre getChambre() {
		return chambre;
	}

	/**
	 * @param chambre the chambre to set
	 */
	public void setChambre(IChambre chambre) {
		this.chambre = chambre;
	}
	
	
	
}
