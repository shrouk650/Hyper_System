import javax.swing.JOptionPane;

public class Hyper_System {

	public static void main(String[] args) {
		//create objecy from 3 classes.
		Vegetables vege = new Vegetables();
		Electronic electronic = new Electronic();
		Clothes clothes = new Clothes();

		Vegetables[] vegetables = new Vegetables[3];
		Electronic[] electronics = new Electronic[1];
		Clothes[] clothes_array = new Clothes[1];

		while (JOptionPane.OPTIONS_PROPERTY != null) {
			String selection = JOptionPane.showInputDialog(null, "Welcome Please Select: \n  (+) to add product "
					+ "\n  (-) to remove product \n  (#) show all product");

			if (selection.equals("+")) {
				String productType = JOptionPane.showInputDialog(null, "1-Vegetables_products     2-Electronic_Product    3-Cloth_Product");

				if (productType.equals("1")) {
					for (int i = 0; i < 2; i++) {
						String productName = JOptionPane.showInputDialog(null, "Please Enter Vegetable Name");

						String price = JOptionPane.showInputDialog(null, "Please Enter Vegetable Price");
						double vegetablePrice = Double.parseDouble(price);
						String vegetableAmount = JOptionPane.showInputDialog(null, "Please Enter Vegetable amount");
						int productamount = Integer.parseInt(vegetableAmount);

						String expiry = JOptionPane.showInputDialog(null, "Please Enter Vegetable Expiry Date");
						int expiry_date = Integer.parseInt(vegetableAmount);

						Vegetables vegeta = new Vegetables(expiry_date, productamount);

						vegetables[i] = vege;

					}
				} else if (productType.equals("2")) {

					for (int j = 0; j< 2; j++) {
						String productName = JOptionPane.showInputDialog(null, "Please Enter Electronic Name");

						String price = JOptionPane.showInputDialog(null, "Please Enter Electronic Price");

						double electronicPrice = Double.parseDouble(price);

						String electronicType = JOptionPane.showInputDialog(null, "Please Enter Electronic Type");

						String electronicBrand = JOptionPane.showInputDialog(null, "Please Enter Electronic Brand");

						Electronic electric = new Electronic(electronicType, electronicBrand);

						electronics[j] = electric;

					}

				} else if (productType.equals("3")) {

					for (int j = 0; j < 2; j++) {
						String productName = JOptionPane.showInputDialog(null, "Please Enter Clothes Name");

						String price = JOptionPane.showInputDialog(null, "Please Enter Clothes Price");
						double clothPrice = Double.parseDouble(price);
						String size = JOptionPane.showInputDialog(null, "Please Enter Clothes size");
						String color = JOptionPane.showInputDialog(null, "Please Enter Clothes color");

						Clothes cloth = new Clothes(price, color);
						clothes_array[j] = cloth;
					}
				} 
			}
			else if(selection.contentEquals("#")) {
				//print all products
	
	        	JOptionPane.showMessageDialog(null, vege.print_Specification(vegetables));
	        	
	        	
	        	JOptionPane.showMessageDialog(null, electronic.print_Specification(electronics));
	        	
	        	
	        	JOptionPane.showMessageDialog(null, clothes.print_Specification(clothes_array));
	        	
	        }	
		}

	}

}
