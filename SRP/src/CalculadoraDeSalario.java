
public class CalculadoraDeSalario {	
	public double calcula(Funcionario funcionario) {
		funcionario.getCargo().getRegra().calcula(funcionario);
		throw new RuntimeException("funcionario invalido");
	}
}
