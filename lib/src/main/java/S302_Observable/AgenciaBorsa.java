package S302_Observable;

//Classe Observer
public class AgenciaBorsa extends Observador{
	
	
	private String name;
	
	
	
	
	public AgenciaBorsa(String name,AgentBorsa agent) {
		this.name = name;
		this.agent = agent;
		this.agent.afegirAgencia(this);
	}


    @Override
	public void actualitzar() {
		System.out.println("\n"+this.name+": T'informo que l'estat de la borsa "
				+ "ha canviat a "+agent.getEstatBorsa() );
	}
	
}
