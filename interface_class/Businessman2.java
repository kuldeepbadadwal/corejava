package interface_class;

public class Businessman2 implements SocialWorker{
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
	public void helpToOthers() {
		System.out.println("Help others");
	}
}
