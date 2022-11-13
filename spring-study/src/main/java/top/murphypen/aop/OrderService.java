package top.murphypen.aop;

public interface OrderService {
	void create(Order order);

	Order update(Order order);

	Order query(long id);

	void delete(long id);

}
