package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Person;

/**
 * Created by JoKeR on 18.01.2017.
 */
public interface PersonRepository extends JpaRepository<Person, Integer>{
}
