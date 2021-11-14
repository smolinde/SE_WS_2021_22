import java.util.ArrayList;

public class Exam {
	public int max_value;
	public Course course;
	public ArrayList <Question> questions;
	public ArrayList <Student> students;
	
	public boolean register (Student student) {
		this.students.add(student);
		return true;
	}
	public void addQuestion (int q_id, String task, int maxValue) {
		this.questions.add(new Question (q_id, task, maxValue));
	}
	public ArrayList <Student> getRegisteredStudents () {
		return students;
	}
	public void setMaxValue (int max_value) {
		this.max_value = max_value;
	}
}
