
public class TesteFuncionario {
	public static void main(String[] args) {
		
		//criando primeiro objeto
		Gerente joao = new Gerente();
		
		joao.setNome("joao da silva");
		joao.setSalario(2500.00);
		joao.setCpf("111.111.111-1");
		
		System.out.println(joao.getNome());
		System.out.println(joao.getBonificacao());
		
		//joao.salario = 300.0;
	}
}
