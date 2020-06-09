package info.tegridy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import info.tegridy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
