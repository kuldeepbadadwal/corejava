package interface_class;

public class TestRichman {
	public static void main(String[] args) {
	Richman r = new Businessman();
	((Businessman) r).name("kuldeep");
	((Businessman) r).address("indore");
	r.earnMoney();
	r.donation();
	
		Businessman1 b1= new Businessman1();
		b1.earnMoney();
		b1.donation();
		b1.party();
		b1.name("Rolex");
		b1.address("indore");
		b1.helpToOthers();
		
	}
		
}
