
public class Gerente extends FuncionarioAutenticavel {
	
	//primeiro método
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}
	
	
}
