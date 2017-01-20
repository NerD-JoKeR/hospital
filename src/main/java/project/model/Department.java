package project.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by JoKeR on 18.01.2017.
 */
@Entity
@Table(name = "departments")
public class Department {

    private Integer id;
    private String name;
    private List<WorkTime> workTimes;
    private List<Person> persons;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    public List<WorkTime> getWorkTimes() {
        return workTimes;
    }

    public void setWorkTimes(List<WorkTime> workTimes) {
        this.workTimes = workTimes;
    }

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    protected Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Отделение : [ID = %d, Имя = '%s']%n",
                id, name);
        if (workTimes != null) {
            for (WorkTime workTime : workTimes) {
                result += workTime + "\n";
            }
        }
        if (persons != null) {
            for (Person person : persons) {
                result += person + "\n";
            }
        }

        return result;
    }
}
