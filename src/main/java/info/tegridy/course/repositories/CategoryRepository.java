package info.tegridy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import info.tegridy.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
