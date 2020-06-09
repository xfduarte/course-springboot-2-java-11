package info.tegridy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import info.tegridy.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
