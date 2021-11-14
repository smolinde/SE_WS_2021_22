import java.util.ArrayList;

public class Project {
	public String name;
	public ArrayList <Student> members;
	public Course course;
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void addNewMember (Student student) {
		members.add(student);
	}
	public ArrayList <Student> getMembers () {
		return members;
	}
}
