
public class Electronic extends Products {

	private String Electronic_type;
	private String Electronic_Brand;

	public Electronic() {

	}

	public Electronic(String electronic_type, String electronic_Brand) {
		super();
		this.Electronic_type = electronic_type;
		this.Electronic_Brand = electronic_Brand;
		setProduct_name(product_name);
		setProduct_price(product_price);
	}

	// Creates setter and getter methods.

	public String getElectronic_type() {
		return Electronic_type;
	}

	public void setElectronic_type(String electronic_type) {
		Electronic_type = electronic_type;
	}

	public String getElectronic_Brand() {
		return Electronic_Brand;
	}

	public void setElectronic_Brand(String electronic_Brand) {
		Electronic_Brand = electronic_Brand;
	}

	@Override
	public double Calculate_price() {

		return product_price;
	}
String result = "";
	@Override
	public String print_Specification() {

		return null;
	}

	public String print_Specification(Electronic [] electronics) {
	
		for (int i=0;i<2;i++) {
		
		result+=" Product: "+electronics[i].product_name+" ";
		result+=" Price: "+electronics[i].product_price+" ";  	
		result+=" Type: "+electronics[i].Electronic_type+" ";
		result+=" Brand: "+electronics[i].Electronic_Brand+" ";
		}
		return result;
	}

}
