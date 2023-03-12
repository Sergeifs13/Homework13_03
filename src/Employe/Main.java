package Employe;

public class Main {
    public static void main(String[] args) {
        Emploee emploee1 = new Emploee("Denis", 500, 8);
        emploee1.addSalary();
        emploee1.addForWork();
        System.out.println("Name - "+emploee1.getName());
        System.out.println("Salary- "+emploee1.getSalary());
        System.out.println("Hours a day- "+emploee1.getWorkTime());
        System.out.println("-----------------------");

        Emploee emploee2 = new Emploee("Stefan", 600, 10);
        emploee2.addSalary();
        emploee2.addForWork();
        System.out.println("Name - "+emploee2.getName());
        System.out.println("Salary- "+emploee2.getSalary());
        System.out.println("Hours a day- "+emploee2.getWorkTime());
        System.out.println("-----------------------");
        Emploee emploee3 = new Emploee("Alfred",700,5);
        emploee3.addSalary();
        emploee3.addForWork();
        System.out.println("Name - "+emploee3.getName());
        System.out.println("Salary- "+emploee3.getSalary());
        System.out.println("Hours a day- "+emploee3.getWorkTime());

    }
}
