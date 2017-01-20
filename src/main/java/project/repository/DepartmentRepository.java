package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Department;

/**
 * Created by JoKeR on 18.01.2017.
 */
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
