package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "categories")
public class CategoryBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	private String categoryTitle;
	private String categoryDescription;
	
	@OneToMany(mappedBy = "catagory")
	private List<ProductBean> products = new ArrayList<ProductBean>();
	
	
	
	
	
	
	
	public CategoryBean() {
		super();
	}



	public CategoryBean(int catagotyId, String catagoryTitle, String catagoryDescription, List<ProductBean> products) {
		super();
		this.categoryId = catagotyId;
		this.categoryTitle = catagoryTitle;
		this.categoryDescription = catagoryDescription;
		this.products = products;
	}
	

	
	public CategoryBean(String catagoryTitle, String catagoryDescription, List<ProductBean> products) {
		super();
		this.categoryTitle = catagoryTitle;
		this.categoryDescription = catagoryDescription;
		this.products = products;
	}
	


	public int getCatagotyId() {
		return categoryId;
	}

	public void setCatagotyId(int catagotyId) {
		this.categoryId = catagotyId;
	}

	public String getCatagoryTitle() {
		return categoryTitle;
	}

	public void setCatagoryTitle(String catagoryTitle) {
		this.categoryTitle = catagoryTitle;
	}

	public String getCatagoryDescription() {
		return categoryDescription;
	}

	public void setCatagoryDescription(String catagoryDescription) {
		this.categoryDescription = catagoryDescription;
	}
	
	


	public List<ProductBean> getProducts() {
		return products;
	}



	public void setProducts(List<ProductBean> products) {
		this.products = products;
	}



	@Override
	public String toString() {
		return "CatagoryBean [catagotyId=" + categoryId + ", catagoryTitle=" + categoryTitle + ", catagoryDescription="
				+ categoryDescription + "]";
	}
	
	
	

}
