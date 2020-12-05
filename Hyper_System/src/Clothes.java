
public class Clothes extends Products {

	private String Clothes_size;
	private String Clothes_color;
	private Clothes[] clothes;

	public Clothes() {

	}

	public Clothes(String clothes_size, String clothes_color) {
		super();
		this.Clothes_size = clothes_size;
		this.Clothes_color = clothes_color;
		setProduct_name(product_name);
		setProduct_price(product_price);
	}

	public String getClothes_size() {
		return Clothes_size;
	}

	public void setClothes_size(String clothes_size) {
		Clothes_size = clothes_size;
	}

	public String getClothes_color() {
		return Clothes_color;
	}

	public void setClothes_color(String clothes_color) {
		Clothes_color = clothes_color;
	}
String result = "";
	@Override
	public double Calculate_price(){
		return 0 ;
	}
	
	public double Calculate_price(String Clothes_size) {

		if (Clothes_size.toLowerCase() == "xxl" || Clothes_size.toLowerCase() == "xxxl") {
			product_price = product_price * 1.4;
		}
		return product_price;
	}

	@Override
	public String print_Specification() {

		return null;
	}
	
	public String print_Specification(Clothes [] clothes) {
		for(int i=0;i<2;i++) {
			
			result+="Clothes\n"+"Product: "+clothes[i].product_name+" ";
			result+="Price: "+clothes[i].Calculate_price(clothes[i].Clothes_size)+" "; 
			result+="Size: "+clothes[i].Clothes_size+" ";
			result+="Color: "+clothes[i].Clothes_color+" ";
			}
			return result;
		}

	 public double clothesPrice(String size) {
	    	
	    	if(size.toLowerCase()=="xxl"|| size.toLowerCase()=="xxxl") 
	    	{
				product_price=  product_price*1.4;
			}
			return product_price;
	    }

}
