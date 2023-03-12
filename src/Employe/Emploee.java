package Employe;

public class Emploee {
    private String Name;
    private int Salary;

    public int WorkTime;
    public  String getName(){
        return Name;
    }

    public int getSalary() {
        return Salary;
    }

    public int getWorkTime() {
        return WorkTime;
    }

    public Emploee(String name, int salary, int workTime){
        this.Name=name;
        this.Salary=salary;
        this.WorkTime=workTime;
    }
    public int addSalary(){
        if (Salary<=500){
            Salary+=10;
            System.out.println("Salary Bonus - 10");
        }return Salary;
    }
    public int addForWork(){
        if (WorkTime>6){
            Salary+=5;
            System.out.println("Bonus work time - 5");
        }return Salary;
    }
}
