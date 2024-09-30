package School;

public class partTime extends Teacher {
    
    protected int workHour;

    public int getWorkHour() {
        return this.workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public partTime() {
        super();
        workHour = 5;
    }

    public partTime(String name, int age, String subject, int workHour) {
        super(name, age, subject);
        this.workHour = workHour;
    }

    public int setSalary() {
        int salary = workHour * 10;
        return salary;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Hours Worked: " +workHour);
        System.out.println("Salary: " +setSalary());
        System.out.println();
    }
}
