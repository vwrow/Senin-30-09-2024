package School;

public class fullTime extends Teacher {
    
    protected int anualSalary;
    protected String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public fullTime() {
        super();
        anualSalary = 20;
        unit = "Head Divison";
    }

    public fullTime(String name, int age,String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Anual Salary: " +anualSalary);
        System.out.println("Unit: " +unit);
        System.out.println();
    }
}
