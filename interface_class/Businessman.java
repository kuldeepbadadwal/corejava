package interface_class;

public class Businessman implements Richman{

	public String name(String name) {
		String nm = name;
		System.out.println("Name = "+nm);
		return name;
	}
	public String address(String address) {
		String add = address;
		System.out.println("Address = "+ add);
		return address;
	}
	public void earnMoney() {
		System.out.println("Makes Money");
	}
	public void donation() {
		System.out.println("Donate Money");
	}
	public void party() {
		System.out.println("Enjoy Parties");
	}
	

}
