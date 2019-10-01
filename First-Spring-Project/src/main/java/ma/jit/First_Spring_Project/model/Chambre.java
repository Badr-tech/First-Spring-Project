package ma.jit.First_Spring_Project.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
public class Chambre implements IChambre {
	
	public int getNbPersonne() {
		// TODO Auto-generated method stub
		return 1;
	}

}
