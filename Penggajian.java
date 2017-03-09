/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author INDOPORCELAIN
 */
public class Penggajian {
    public static void main (String[] args){
        
        Manager boss = new Manager("Adjat", "Purwakarta", 6500000);
        boss.setBonus(1500000);
        Employee [] employee = new Employee [3];
        employee [0] = boss;
        employee [1] = new Staff("Dimas", "PasirKoja", 4000000);
        employee [2] = new Staff("Sudarman", "Tasikmalaya", 3500000);
        
        for (int i=0; i<employee.length;i++){
            System.out.println(employee[i].getName()+ " " + employee[i].getAddress()+ " " + "Mendapatkan Gaji " + employee[i].getSalary());
            
        }
                
    }
    
}
