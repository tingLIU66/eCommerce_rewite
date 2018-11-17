package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
	private String orderdate;
	private float totalprice;
	private float tax;
	private float amount;
	private String shippingaddress;
	private String orderstatus;
	
	
	

}
