/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab6s2;

public class MainEmployee {

    public static void main(String[] args) {
        Manager boss = new Manager("Steven", 80000, 1987, 12,
                15);
        boss.setBonus(5000);
        Employee staff = new Employee("Donni", 50000, 1989, 10,
                1);
        System.out.println("nama boss : " + boss.getName() + ", salary = " + boss.getSalary());
        System.out.println("nama staff : " + staff.getName() + ", salary = " + staff.getSalary());
    }
}
