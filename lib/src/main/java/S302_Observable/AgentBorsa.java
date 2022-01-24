package S302_Observable;

import java.util.ArrayList;
import java.util.List;

//Observable
public class AgentBorsa {

	
	private List <AgenciaBorsa> agencies = new ArrayList<AgenciaBorsa>();
	private int estatBorsa;
	
	
	public void setEstatBorsa(int estatBorsa) {
		this.estatBorsa = estatBorsa;
		notificarAgencies();
	}
	
	public int getEstatBorsa() {
		return estatBorsa;
	}

	public void afegirAgencia(AgenciaBorsa agencia) {
		agencies.add(agencia);
	}
	
	public void eliminarAgencia(AgenciaBorsa agencia) {
		agencies.remove(agencia);
	}
	
	public void notificarAgencies() {
		 agencies.forEach(x -> x.actualitzar());
	}
	
	
	
	
}
