package School;

public class Student extends Person {
    
    protected int studentNumber, score;
    protected String major;

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
		this.major = major;
	}

    public Student() {
        super();
        studentNumber = 13;
        score = 100;
        major = "Coding";
    }

    public Student(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    @Override
    public void Print() {
        super.Print();
        System.out.println("Student Number: " +studentNumber);
        System.out.println("Score: " +score);
        System.out.println("Major: " +major +" Class");
        System.out.println();
    }
}
