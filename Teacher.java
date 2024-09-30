package School;

public class Teacher extends Person {
    
    protected String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        super();
        subject = "Coding";
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Subject: " +subject);
    }
}
