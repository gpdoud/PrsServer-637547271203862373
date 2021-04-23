package Prs;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Prs.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
