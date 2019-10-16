package class_01_member;
public class PeopleQmx implements IPeopleQmx{
	private String name;
	private int age;

	public PeopleQmx(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getWork(){
		return null;
	}

	public String getCard() {
		StringBuffer res = new StringBuffer();
		res.append("Name: "+getName());
		res.append("\r\n");
		res.append("Age: "+getAge());
		res.append("\r\n");
		res.append("Work: "+getWork());
		res.append("\r\n");
		return res.toString();
	}
}
