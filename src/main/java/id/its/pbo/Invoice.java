package id.its.pbo;

public class Invoice {
		
		String number,description;
		int quantity_item;
		double price_per_item;
		
		public Invoice(String number, String description, int quantity_item, double price_per_item){
			this.number = number;
			this.description = description;
			this.quantity_item = quantity_item;
			this.price_per_item = price_per_item;
		}
		
		public void setPartNumber(String A) {
			this.number = A;
		}
		
		public String getPartNumber() {
			return number;
		}
		
		public void setPartDescription(String A) {
			this.description = A;
		}
		
		public String getPartDescription() {
			return description;
		}
		
		public void setQtyItem(int A) {
			this.quantity_item = A;
		}
		
		public int getQtyItem() {
			return quantity_item;
		}
		
		public void setPricePItem(double A) {
			this.price_per_item = A;
		}
		
		public double getPricePItem() {
			return price_per_item;
		}
		
		public double getInvoiceAmount() {
			if(quantity_item < 0) return 0.0;
			else if(price_per_item < 0) return 0.0;
			else return (double) quantity_item * price_per_item;
		}
	}

