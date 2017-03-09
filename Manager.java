/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author INDOPORCELAIN
 */
class Manager extends Employee {
    private float bonus;
    
    public Manager(String Name, String Address, float Salary){
        super(Name, Address, Salary);
    }

    public float getBonus() {
        return bonus;
    }
    
       @Override
          public float getSalary(){
           return this.Salary+ this.getBonus();
       }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    
               
    
}
