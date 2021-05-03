package aula_junit.entities;

public class Financial {

	public static double VALUE_ENTRANCE_PERCENT = 0.2;

	private Long id;
	private Double totalAmount;
	private Double income;
	private Integer mounths;
	private Double renda;

	public Financial() {
	}

	public Financial(Long id, Double totalAmount, Double income, Integer mounths, Double renda) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.income = income;
		this.mounths = mounths;
		this.renda = renda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
		valideQuotaRenda();
	}
	
	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
		valideQuotaRenda();
	}

	public Integer getMounths() {
		return mounths;
	}

	public void setMounths(Integer mounths) {
		this.mounths = mounths;
		valideQuotaRenda();
	}	

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public double entry() {
		double e = getTotalAmount() * VALUE_ENTRANCE_PERCENT;
		return e;
	}

	public Double quota() {
		double e = getTotalAmount() - entry();
		return e / getMounths();
	}
	
	public void valideQuotaRenda() {
		if(quota() > getRenda()/2) {
			throw new IllegalArgumentException();
		}
	}

}