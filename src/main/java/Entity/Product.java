package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productID;
	private String productname;
	private String productdescription;
	private double productprice;
	//@Column(name="productowner_productownerID")	
	//private int productownerID;
	private int productquantity;	
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdecription() {
		return productdescription;
	}
	public void setProductdecription(String productdecription) {
		this.productdescription = productdecription;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
/*	public int getProductownerID() {
		return productownerID;
	}
	public void setProductownerID(int productownerID) {
		this.productownerID = productownerID;
	}*/
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	
	
	
	

}
