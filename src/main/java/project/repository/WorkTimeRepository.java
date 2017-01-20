package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.WorkTime;

import java.util.List;

/**
 * Created by JoKeR on 18.01.2017.
 */
public interface WorkTimeRepository extends JpaRepository<WorkTime, Integer>{
    List<WorkTime> findByDepartmentId(Integer id);
}
