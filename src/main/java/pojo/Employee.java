package pojo;

import java.util.List;
import java.util.Objects;

public class Employee {
    private Long id;

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) && fname.equals(employee.fname) && lname.equals(employee.lname) && salary.equals(employee.salary) && Objects.equals(addressList, employee.addressList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fname, lname, salary, addressList);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", salary=" + salary +
                ", addressList=" + addressList +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Employee(Long id, String fname, String lname, Double salary, List<Address> addressList) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.addressList = addressList;
    }
    public Employee(Long id, String fname, String lname, Double salary, List<Address> addressList, String department) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.addressList = addressList;
        this.department = department;
    }

    private String fname;
    private String lname;
    private Double salary;
    private List<Address> addressList;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;
}
