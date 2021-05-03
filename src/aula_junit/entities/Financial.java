package aula_junit.entities;

public class Financial {

	public static double VALUE_ENTRANCE_PERCENT = 0.2;
	
	private Double id;
	private Double totalAmount;
	private Double income;
	private Integer mounths;

	public Financial() {
	}

	public Financial(Double id, Double totalAmount, Double income, Integer mounths) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.income = income;
		this.mounths = mounths;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Integer getMounths() {
		return mounths;
	}

	public void setMounths(Integer mounths) {
		this.mounths = mounths;
	}
		
}