package entities;

public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}


