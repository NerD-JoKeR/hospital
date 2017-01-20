package project.model;

import javax.persistence.*;

/**
 * Created by JoKeR on 18.01.2017.
 */
@Entity
@Table(name = "persons")
public class Person {

    private Integer id;
    private int cabinet;
    private String nameInic;
    private String position;
    private String district;
    private Department department;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public String getNameInic() {
        return nameInic;
    }

    public void setNameInic(String nameInic) {
        this.nameInic = nameInic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @ManyToOne
    @JoinColumn(name = "department_id")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    protected Person() {
    }

    public Person(int cabinet, String nameInic, String position, String district, Department department) {
        this.cabinet = cabinet;
        this.nameInic = nameInic;
        this.position = position;
        this.district = district;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", cabinet=" + cabinet +
                ", nameInic='" + nameInic + '\'' +
                ", position='" + position + '\'' +
                ", district='" + district + '\'' +
                ", department=" + department +
                '}';
    }
}
