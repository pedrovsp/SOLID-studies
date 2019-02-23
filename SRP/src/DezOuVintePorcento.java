
public class DezOuVintePorcento implements RegraDeCalculo {
	
	@Override
	public double calcula(Funcionario f) {
		if (f.getSalarioBase() > 2000.0) {
			return f.getSalarioBase() * 0.8;
		} else {
			return f.getSalarioBase() * 0.9;
		}
	}

}
