package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "catagories")
public class CatagoryBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catagotyId;
	private String catagoryTitle;
	private String catagoryDescription;
	
	@OneToMany(mappedBy = "catagory")
	private List<ProductBean> products = new ArrayList<ProductBean>();
	
	
	
	
	
	
	
	public CatagoryBean() {
		super();
	}



	public CatagoryBean(int catagotyId, String catagoryTitle, String catagoryDescription, List<ProductBean> products) {
		super();
		this.catagotyId = catagotyId;
		this.catagoryTitle = catagoryTitle;
		this.catagoryDescription = catagoryDescription;
		this.products = products;
	}
	

	
	public CatagoryBean(String catagoryTitle, String catagoryDescription, List<ProductBean> products) {
		super();
		this.catagoryTitle = catagoryTitle;
		this.catagoryDescription = catagoryDescription;
		this.products = products;
	}
	


	public int getCatagotyId() {
		return catagotyId;
	}

	public void setCatagotyId(int catagotyId) {
		this.catagotyId = catagotyId;
	}

	public String getCatagoryTitle() {
		return catagoryTitle;
	}

	public void setCatagoryTitle(String catagoryTitle) {
		this.catagoryTitle = catagoryTitle;
	}

	public String getCatagoryDescription() {
		return catagoryDescription;
	}

	public void setCatagoryDescription(String catagoryDescription) {
		this.catagoryDescription = catagoryDescription;
	}
	
	


	public List<ProductBean> getProducts() {
		return products;
	}



	public void setProducts(List<ProductBean> products) {
		this.products = products;
	}



	@Override
	public String toString() {
		return "CatagoryBean [catagotyId=" + catagotyId + ", catagoryTitle=" + catagoryTitle + ", catagoryDescription="
				+ catagoryDescription + "]";
	}
	
	
	

}
