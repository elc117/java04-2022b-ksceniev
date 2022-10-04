import java.util.ArrayList;

public class Laboratory {
	private String name;
	private ArrayList<Student> students;
	private ArrayList<Professor> professors;

	public Laboratory() {
	}

	public Laboratory(String name) {
		this.name = name;
		this.students = new ArrayList<Student>();
		this.professors = new ArrayList<Professor>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMember(Student s) {
		this.students.add(s);
	}

	public void addMember(Professor p) {
		this.professors.add(p);
	}

	public ArrayList<String> getContactInfos() {
		ArrayList<String> contacts = new ArrayList<String>();
		for(Student stu : this.students) {
			contacts.add(stu.getContactInfo());
		}

		for(Professor prf:this.professors) {
			contacts.add(prf.getContactInfo());
		}

		return contacts;
	}

	public boolean userExists(String userId) {
		for(Student stu:this.students) {
			if(userId == stu.getUserId()) {
				return true;
			}
		}
		for(Professor prf:this.professors) {
			if(userId == prf.getUserId()) {
				return true;
			}
		}
		return false;
	}

	public int countMembers() {
		return (this.students.size() + this.professors.size());
	}

}