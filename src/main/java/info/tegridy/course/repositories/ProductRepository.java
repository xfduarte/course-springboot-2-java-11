package info.tegridy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import info.tegridy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
