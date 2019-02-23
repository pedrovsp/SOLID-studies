
public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()),
	DBA(new DezOuVintePorcento()),
	TESTER(new DezOuVintePorcento());
	
	private RegraDeCalculo regra;
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
	
	private Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
}
