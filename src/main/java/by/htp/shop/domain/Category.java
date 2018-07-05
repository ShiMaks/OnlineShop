package by.htp.shop.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Category extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String name;

	@OneToMany(mappedBy = "category")
	private List<Product> products;

	public Category() {
		
	}
	
	public Category(int id) {
		super(id);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * getId());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (getId() != other.getId()) {
			return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
