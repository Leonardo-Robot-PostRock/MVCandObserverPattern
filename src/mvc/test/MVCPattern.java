package mvc.test;

import mvc.controller.StudentController;
import mvc.model.Student;
import mvc.view.StudentView;

public class MVCPattern {
	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		controller.setStudentName("Luciana");
		controller.updateView();
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Leonardo");
		student.setRollNo(1);
		
		return student;
	}
}
