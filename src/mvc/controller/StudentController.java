package mvc.controller;

import mvc.model.Student;
import mvc.view.StudentView;

public class StudentController {
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentName(String name) {
		this.model.setName(name);;
	}

	public int getRollNo() {
		return this.model.getRollNo();
	}

	public void setRollNo(int rollNo) {
		this.model.setRollNo(rollNo);;
	}

	public void updateView() {
		this.view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
