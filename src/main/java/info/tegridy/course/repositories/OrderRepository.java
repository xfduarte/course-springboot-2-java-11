package info.tegridy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import info.tegridy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
