package by.htp.shop.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Product extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String name;

	@ManyToOne
	private Category category;
	private String description;
	private boolean inStock;
	private int quantity;
	private int price;
	private String picture;

	@OneToMany(mappedBy = "product")
	private List<OrderItem> orderItems;

	public Product() {
		
	}

	public Product(String name){
		this.name = name;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Product(int id) {
		super(id);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isInStock() {
		return inStock;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (inStock != product.inStock) return false;
		if (quantity != product.quantity) return false;
		if (price != product.price) return false;
		if (name != null ? !name.equals(product.name) : product.name != null) return false;
		if (category != null ? !category.equals(product.category) : product.category != null) return false;
		return description != null ? description.equals(product.description) : product.description == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (category != null ? category.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (inStock ? 1 : 0);
		result = 31 * result + quantity;
		result = 31 * result + price;
		return result;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", category=" + category +
				", description='" + description + '\'' +
				", inStock=" + inStock +
				", quantity=" + quantity +
				", price=" + price +
				'}';
	}
}
