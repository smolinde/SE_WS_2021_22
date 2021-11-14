import java.util.ArrayList;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public TA ta;
	public boolean isFull;
	public Professor prof;
	public ArrayList <Student> students;
	public Exam [] exams;

	public Course (int id, String name, int maxCapacity, Professor prof, TA ta) {
		this.id = id;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.prof = prof;
		this.ta = ta;
	}
	public void enroll (Student student) {
		students.add(student);
	}
	public void apply(TA ta) {
		//TODO
	}
	public void setMaxCap (int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public Professor getProf () {
		return prof;
	}
	public TA getTa () {
		return ta;
	}
	public void setNewTA (TA ta) {
		this.ta = ta;
	}
	public void setName (String name) {
		this.name = name;
	}
}
