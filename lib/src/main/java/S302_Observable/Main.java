package S302_Observable;

public class Main {

	public static void main(String[] args) {
		
		AgentBorsa agent = new AgentBorsa();
		
		//Es creen 3 agències
		AgenciaBorsa agencia1 = new AgenciaBorsa("agència 1", agent);
		AgenciaBorsa agencia2 = new AgenciaBorsa("agència 2", agent);
		AgenciaBorsa agencia3 = new AgenciaBorsa("agència 3", agent);
		
		
		
		agent.setEstatBorsa(20);
		agent.setEstatBorsa(30);
		agent.setEstatBorsa(-30);

		

	}

}
