package top.murphypen.aop;


import java.util.Date;
import java.util.Objects;

public class Order {
	private Long id;
	private String orderNo;
	private int orderStatus;
	private Date createAt;

	public Order() {
	}

	public Order(Long id, String orderNo, int orderStatus, Date createAt) {
		this.id = id;
		this.orderNo = orderNo;
		this.orderStatus = orderStatus;
		this.createAt = createAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order order = (Order) o;
		return orderStatus == order.orderStatus && Objects.equals(id, order.id) && Objects.equals(orderNo, order.orderNo) && Objects.equals(createAt, order.createAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, orderNo, orderStatus, createAt);
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderNo='" + orderNo + '\'' +
				", orderStatus=" + orderStatus +
				", createAt=" + createAt +
				'}';
	}
}
