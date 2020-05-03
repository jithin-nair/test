package in.edu.ktu.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.edu.ktu.test.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}