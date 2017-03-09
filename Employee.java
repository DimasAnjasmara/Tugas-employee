/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author INDOPORCELAIN
 */
public class Employee {
    protected String Name;
    protected String Address;
    protected float Salary;

    public Employee(String Name, String Address, float Salary) {
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
    }

    public String getAddress() {
        return Address;
    }

    public String getName() {
        return Name;
    }

    public float getSalary() {
        return Salary;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    
    
    
}
