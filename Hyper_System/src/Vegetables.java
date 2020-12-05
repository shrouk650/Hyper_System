
//Class vegetables extend from class product
public class Vegetables extends Products {

	private int Expiry_date;
	private double Amout_of_Vegetables;
	private Vegetables[] Vegetables_Specification;

	// create constructor
	public Vegetables() {
	}

	public Vegetables(int expiry_date, double amout_of_Vegetables) {
		this.Expiry_date = expiry_date;
		this.Amout_of_Vegetables = amout_of_Vegetables;
		setProduct_name(product_name);
		setProduct_price(product_price);
	}

	public int getExpiry_date() {
		return Expiry_date;
	}

	public void setExpiry_date(int expiry_date) {
		Expiry_date = expiry_date;
	}

	public double getAmout_of_Vegetables() {
		return Amout_of_Vegetables;
	}

	public void setAmout_of_Vegetables(double amout_of_Vegetables) {
		Amout_of_Vegetables = amout_of_Vegetables;
	}

	// should implement method exsists in product class.

	@Override
	public double Calculate_price() {
		product_price = Amout_of_Vegetables * product_price;
		return product_price;
	}

	String result = "";

	@Override
	public String print_Specification() {

		return null;
	}

	public String print_Specification(Vegetables[] Vegetables_Specification) {

		for (int i = 0; i < Vegetables_Specification.length ; i++) {

			result += " Product : " + Vegetables_Specification[i].getProduct_name() + " ";
			result += " Price : " + Vegetables_Specification[i].getProduct_price() + " ";
			result += " Amount : " + Vegetables_Specification[i].getAmout_of_Vegetables() + " ";
			result += " Expiry Date : " + Vegetables_Specification[i].getExpiry_date() + " \n";
		}

		return result;

	}

	public Vegetables[] RemoveVegetable(Vegetables[] vegetables) {

		for (int i = 0; i < vegetables.length - 1; i++) {
			this.Vegetables_Specification[i] = vegetables[i];
		}
		return this.Vegetables_Specification;

	}
}
