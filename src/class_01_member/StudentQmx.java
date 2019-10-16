package class_01_member;

public class StudentQmx extends PeopleQmx {
	public StudentQmx(String name, int age){
		super(name, age);
	}
	
	public StudentQmx(String name) {
		this(name, 19);
	}

	public String getWork(){
		return "good good study, day day up";
	}
}
