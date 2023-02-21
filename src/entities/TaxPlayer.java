package entities;

public class TaxPlayer {

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPlayer() {

	}

	public TaxPlayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double salary = salaryIncome / 12.0; 
		double tax = 0.0;
		if (salary < 3000.00) {
			tax = 0.0;
		}else if (salary <= 5000.00) {
			tax = 10.0;
		}else {
			tax = 20.0;
		}
		
		return salaryIncome * tax / 100.0;
	}

	public double servicesTax() {
		return servicesIncome * 15.0 / 100.0;
	}

	public double capitalTax() {
		return capitalIncome * 20.0 / 100.0;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double maximun = grossTax() / 100.0 * 30.0;
		double expense = healthSpending + educationSpending;
		
		if (maximun < expense) {
			return maximun;
		}else {
			return expense;
		}
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return "Imposto bruto total: " 
				+ String.format("%.2f%n", grossTax())
				+ "Abatimento: "
				+ String.format("%.2f%n", taxRebate())
				+ "Imposto devido: "
				+ String.format("%.2f%n", netTax());
	}
	
	
}
