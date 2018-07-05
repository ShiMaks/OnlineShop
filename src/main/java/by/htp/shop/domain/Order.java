package by.htp.shop.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "shop_order")
public class Order extends BaseEntity {

	private static final long serialVersionUID = -2608067018240196401L;

	@ManyToOne
	private User client;

	@Enumerated(EnumType.STRING)
   	private Status status;

    @Temporal(TemporalType.TIMESTAMP)
	private Date dataOrder;

    private int price;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<OrderItem> orderItem; //Set
	
	public Order() {
		
	}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDataOrder() {
        return dataOrder;
    }

    public void setDataOrder(Date dataOrder) {
        this.dataOrder = dataOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(client, order.client) &&
                status == order.status &&
                Objects.equals(dataOrder, order.dataOrder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(client, status, dataOrder);
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", status=" + status +
                ", dataOrder=" + dataOrder +
                '}';
    }
}