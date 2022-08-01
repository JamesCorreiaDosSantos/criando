package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salario;
	
	public Employee() {
		
	}
	
	

	public Employee(Integer id, String name, Double salario) {

		this.id = id;
		this.name = name;
		this.salario = salario;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}
	
	
	public void aumento(double percent) {
		salario = salario + salario * (percent / 100.0);
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salario=" + salario + "]";
	}
	
	
	
}



