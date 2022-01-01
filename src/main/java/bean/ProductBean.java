package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity(name = "products")
public class ProductBean {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int productId;
	private String productName;
	
	@Column(length=3000)
	private String productDescription;
	private String producPhoto;
	private int productPrice;
	private int productQuantity;
	
	@ManyToOne
	private CatagoryBean catagory;
	
	
	

	
	
	public ProductBean() {
		super();
	}


	public ProductBean(int productId, String productName, String productDescription, String producPhoto,
			int productPrice, int productQuantity, CatagoryBean catagory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.producPhoto = producPhoto;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.catagory = catagory;
	}

	
	public ProductBean(String productName, String productDescription, String producPhoto, int productPrice,
			int productQuantity, CatagoryBean catagory) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.producPhoto = producPhoto;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.catagory = catagory;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProducPhoto() {
		return producPhoto;
	}
	public void setProducPhoto(String producPhoto) {
		this.producPhoto = producPhoto;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", producPhoto=" + producPhoto + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + "]";
	}
	
	

}
