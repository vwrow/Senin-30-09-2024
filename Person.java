package School;

public class Person { //superclass
        
        protected String name;
        protected int age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public Person() {
        name = "Alvaro";
        age = 15;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Print() {
        System.out.println();
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println();
    }
}

