/**
 * Description
 * 
 * @Creator: Rajat Shrestha
 * @ID : 17030954
 * @Version 18/4/2018
 */

import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;

   
public class TrainingInstitute implements ActionListener
{   
	// defining class variables
	private ArrayList<Course> courseList = new ArrayList<Course>();    
	private JFrame frame;
	private JSeparator sepVl;
   
	private JLabel lblDescription, lblInstructor, lblCourseDuration, lblFee, lblDailyHour, lblDownPayment,
			lblStudentName, lblEnrollDate, lblRoomNo, lblDescription2, lblInstructor2, lblCourseDuration2, 
			lblFee2, lblStudentName2, lblStartDate, lblExamDate, lblCourseNo, lblCourseNo2, lblExamCenter,
			lblAwardedBy,lblValidDuration, lblCertificationCourse, lblProfessionalCourse, lblBorder, lblBorder2;
			
	private JTextField txtDescription, txtInstructor, txtCourseDuration, txtFee, txtDailyHour, txtDownPayment,
			txtStudentName, txtEnrollDate, txtRoomNo, txtStartDate, txtExamDate, txtDescription2,
			txtInstructor2, txtCourseDuration2, txtFee2, txtStudentName2, txtExamCenter,
			 txtAwardedBy, txtValidDuration, txtCourseNo, txtCourseNo2;
			
	private JButton btnAdd, btnAdd2, btnComplete, btnEnrollStudent, btnEnrollStudent2, btnDisplayAll, btnClear;

	// Empty Constructor
	TrainingInstitute()
	{
	}
	
	// method for designing GUI
	public void guiComponents()
	{
		// Setting Frame for GUI elements
		JFrame frame= new JFrame("GUI Form for Courses");
		frame.setVisible(true);
		frame.setSize(1020,580);
		frame.setLayout(null);

		// GUI for Professional
		lblProfessionalCourse = new JLabel("Professional Course");
		frame.add(lblProfessionalCourse);
		lblProfessionalCourse.setFont(new Font("arial", Font.BOLD, 20));
		lblProfessionalCourse.setBounds(10, 5, 200 ,20);

		lblBorder = new JLabel("_____________________________________________________________");
		frame.add(lblBorder);
		lblBorder.setBounds(0, 29, 500 ,14);

		lblDescription = new JLabel("Course Name:");
		frame.add(lblDescription);
		lblDescription.setBounds(10, 80, 100 ,14);       

		lblInstructor = new JLabel("Instructor:");
		frame.add(lblInstructor);
		lblInstructor.setBounds(10, 105, 100 ,14);

		lblCourseDuration = new JLabel("Course Duration:");
		frame.add(lblCourseDuration);
		lblCourseDuration.setBounds(10, 130, 100 ,14);
		
		lblFee = new JLabel("Fee:");
		frame.add(lblFee);
		lblFee.setBounds(10, 155, 100 ,14);

		lblDailyHour = new JLabel("Daily Hour:");
		frame.add(lblDailyHour);
		lblDailyHour.setBounds(10, 180, 100 ,14);

		btnAdd = new JButton("Add");
		frame.add(btnAdd);
		btnAdd.setBounds(150, 220, 210 ,25);
		btnAdd.addActionListener(this);
			
		lblCourseNo = new JLabel("Course No#:");
		frame.add(lblCourseNo);
		lblCourseNo.setBounds(10, 305, 100 ,14);

		lblStudentName = new JLabel("Student Name:");
		frame.add(lblStudentName);
		lblStudentName.setBounds(10, 330, 100 ,14);
		
		lblEnrollDate = new JLabel("Enroll Date:");
		frame.add(lblEnrollDate);
		lblEnrollDate.setBounds(10, 355, 100 ,14);

		lblRoomNo = new JLabel("Room No.#:");
		frame.add(lblRoomNo); 
		lblRoomNo.setBounds(10, 380, 100 ,14);

		lblDownPayment = new JLabel("Down Payment:");
		frame.add(lblDownPayment);
		lblDownPayment.setBounds(10, 405, 100 ,14);  
	 
		txtDescription = new JTextField();
		frame.add(txtDescription);
		txtDescription.setBounds(110, 80, 330 ,22);

		txtInstructor = new JTextField();
		frame.add(txtInstructor);
		txtInstructor.setBounds(110, 105, 330 ,22);
		
		txtCourseDuration = new JTextField();
		frame.add(txtCourseDuration);
		txtCourseDuration.setBounds(110, 130, 130 ,22);        
		
		txtFee = new JTextField();
		frame.add(txtFee);
		txtFee.setBounds(110, 155, 130 ,22);        
		
		txtDailyHour = new JTextField();
		frame.add(txtDailyHour);
		txtDailyHour.setBounds(110, 180, 130 ,22);   

		txtCourseNo = new JTextField();
		frame.add(txtCourseNo);
		txtCourseNo.setBounds(110, 305, 100 ,22);     
 
		txtStudentName = new JTextField();
		frame.add(txtStudentName);
		txtStudentName.setBounds(110, 330, 330 ,22);        
		
		txtEnrollDate = new JTextField();
		frame.add(txtEnrollDate);
		txtEnrollDate.setBounds(110, 355, 330 ,22);                    
		
		txtRoomNo = new JTextField();
		frame.add(txtRoomNo);
		txtRoomNo.setBounds(110, 380, 130 ,22);   

		txtDownPayment = new JTextField();
		frame.add(txtDownPayment);
		txtDownPayment.setBounds(110, 405, 130 ,22);        
		
		btnComplete = new JButton("Complete");
		frame.add(btnComplete);
		btnComplete.setBounds(250, 300, 200 ,25);
		btnComplete.addActionListener(this);
		
		btnEnrollStudent = new JButton("Enroll Student:");
		frame.add(btnEnrollStudent);
		btnEnrollStudent.setBounds(250, 435, 200 ,27);
		btnEnrollStudent.addActionListener(this);      

		sepVl = new JSeparator(JSeparator.VERTICAL);
		frame.add(sepVl);
		sepVl.setBounds(495, 0, 10 ,700);

		// GUI of Certification
		lblCertificationCourse = new JLabel("Certification Course");
		frame.add(lblCertificationCourse);
		lblCertificationCourse.setFont(new Font("arial", Font.BOLD, 20));
		lblCertificationCourse.setBounds(550, 5, 200 ,20);
		
		lblBorder2 = new JLabel("_____________________________________________________________");
		frame.add(lblBorder2);
		lblBorder2.setBounds(550, 29, 498 ,14);
			 
		lblDescription2 = new JLabel("Course Name:");
		frame.add(lblDescription2);
		lblDescription2.setBounds(550, 80, 100 ,14);
		
		lblInstructor2 = new JLabel("Instructor:");
		frame.add(lblInstructor2);
		lblInstructor2.setBounds(550, 105, 100 ,14);
		
		lblCourseDuration2 = new JLabel("Course Duration:");
		frame.add(lblCourseDuration2);
		lblCourseDuration2.setBounds(550, 130, 100 ,14);
		
		lblFee2 = new JLabel("Fee:");
		frame.add(lblFee2);
		lblFee2.setBounds(550, 155, 100 ,14);

		lblAwardedBy = new JLabel("Awarded By:");
		frame.add(lblAwardedBy); 
		lblAwardedBy.setBounds(550, 180, 100 ,14);       

		lblValidDuration = new JLabel("Valid Duration:");
		frame.add(lblValidDuration);
		lblValidDuration.setBounds(550, 205, 100 ,14);   
	 
		lblCourseNo2 = new JLabel("Course No#:");
		frame.add(lblCourseNo2);
		lblCourseNo2.setBounds(550, 305, 100 ,14);
				
		lblStudentName2 = new JLabel("Student Name:");
		frame.add(lblStudentName2);
		lblStudentName2.setBounds(550, 330, 100 ,14);
			  
		lblStartDate = new JLabel("Start Date:");
		frame.add(lblStartDate);
		lblStartDate.setBounds(550, 355, 100 ,14);
			 
		lblExamDate = new JLabel("Exam Date:");
		frame.add(lblExamDate);
		lblExamDate.setBounds(550, 380, 100 ,14);
				
		lblExamCenter = new JLabel("Exam Center:");
		frame.add(lblExamCenter);
		lblExamCenter.setBounds(550, 405, 600 ,18);   
	 
		txtDescription2 = new JTextField();
		frame.add(txtDescription2);
		txtDescription2.setBounds(650, 80, 330 ,22);
		
		txtInstructor2 = new JTextField();
		frame.add(txtInstructor2);
		txtInstructor2.setBounds(650, 105, 330 ,22);
			   
		txtCourseDuration2 = new JTextField();
		frame.add(txtCourseDuration2);
		txtCourseDuration2.setBounds(650, 130, 130 ,22);
		
		txtFee2 = new JTextField();
		frame.add(txtFee2);        
		txtFee2.setBounds(650, 155, 130 ,22);

		txtAwardedBy = new JTextField();
		frame.add(txtAwardedBy);
		txtAwardedBy.setBounds(650, 180, 330 ,22);
		
		txtValidDuration = new JTextField();
		frame.add(txtValidDuration); 
		txtValidDuration.setBounds(650, 205, 330 ,22);      

		txtCourseNo2 = new JTextField();
		frame.add(txtCourseNo2); 
		txtCourseNo2.setBounds(650, 305, 100 ,22);

		txtStudentName2 = new JTextField();
		frame.add(txtStudentName2);  
		txtStudentName2.setBounds(650, 330, 330 ,22);
		
		txtStartDate = new JTextField();
		frame.add(txtStartDate);
		txtStartDate.setBounds(650, 355, 230 ,22);
		
		txtExamDate = new JTextField();
		frame.add(txtExamDate);
		txtExamDate.setBounds(650, 380, 230 ,22);
		
		txtExamCenter = new JTextField();
		frame.add(txtExamCenter);
		txtExamCenter.setBounds(650, 405, 230 ,22);
		
		btnAdd2 = new JButton("Add");
		frame.add(btnAdd2);
		btnAdd2.setBounds(690, 230, 210 ,25);
		btnAdd2.addActionListener(this);
		
	   
		btnEnrollStudent2 = new JButton("Enroll Student");
		frame.add(btnEnrollStudent2);
		btnEnrollStudent2.setBounds(790, 435, 200 ,27);
		btnEnrollStudent2.addActionListener(this);
		
		btnDisplayAll = new JButton("Display All");
		frame.add(btnDisplayAll);
		btnDisplayAll.setBounds(520, 500, 200 ,27);
		btnDisplayAll.addActionListener(this);
					
		btnClear = new JButton("Clear All");
		frame.add(btnClear);
		btnClear.setBounds(290, 500, 180 ,27); 
		btnClear.addActionListener(this);
	}
	
	// method to create professional object from txtfields and append it to the list
	public void addProfessional() 
	{ 
		try{
			String courseName=txtDescription.getText();
			String instructorName = txtInstructor.getText();
			int totalHour = Integer.parseInt(txtCourseDuration.getText().trim());
			int dailyHour = Integer.parseInt(txtDailyHour.getText().trim());
			int courseFee = Integer.parseInt(txtFee.getText().trim());
					
			if (!courseName.isEmpty() && !instructorName.isEmpty()){
				if (totalHour > 0 && courseFee > 0){
					if (dailyHour < 24 && dailyHour > 0){
						Professional professionalCourse = new Professional(totalHour, courseName,  instructorName,
							 courseFee, dailyHour);
						courseList.add(professionalCourse); 
				
						JOptionPane.showMessageDialog(null," Your record is has been saved for:\n Course: "
							+ courseName + "\n By the instructor: " + instructorName );
						txtDescription.setText("");
						txtCourseDuration.setText("");
						txtDailyHour.setText("");
						txtFee.setText("");
						txtInstructor.setText(""); 
					}
					else {
						JOptionPane.showMessageDialog(frame, " Some input might be invalid, \n" +
						 "Please try again. \n Check daily Hour should be > 0 and <24",
						 "Missing input", JOptionPane.WARNING_MESSAGE);
					} 
				}  
				else {
					JOptionPane.showMessageDialog(frame, " Some input might be invalid, \n" +
					 "Please try again. \n Check total Hour and course fee should be > 0",
					 "Missing input", JOptionPane.WARNING_MESSAGE);
				}  
			} 
			else {
				JOptionPane.showMessageDialog(frame, " Some input might be missing, \n" +
				 "Please try again. \n Check Course Name and Instructor Name",
				 "Missing input", JOptionPane.WARNING_MESSAGE);
			}         
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(frame, e.getMessage(),
			"Please input data correctly", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	// method to create certification object from txtfields and append it to the list
	public void addCertification() 
	{
		try {
			String courseName = txtDescription2.getText();
			String instructorName = txtInstructor2.getText();
			String validTill = txtValidDuration.getText();
			String certificateAwardedBy = txtAwardedBy.getText();
			int courseFee = Integer.parseInt(txtFee2.getText().trim());
			int totalHours = Integer.parseInt(txtCourseDuration2.getText().trim());

			if (!courseName.isEmpty() && !instructorName.isEmpty()
				 && !validTill.isEmpty() && !certificateAwardedBy.isEmpty()){
				if (courseFee > 0 && totalHours > 0){

					Certification certificationCourse = new Certification(courseName, totalHours,
						instructorName, validTill, courseFee, certificateAwardedBy);
					courseList.add(certificationCourse);
				
					JOptionPane.showMessageDialog(null," Your record is has been saved for:\n course: "
						+ courseName + "\n By the instructor: " + instructorName );
					txtAwardedBy.setText("");
					txtValidDuration.setText("");
					txtDescription2.setText("");
					txtInstructor2.setText("");
					txtCourseDuration2.setText("");
					txtFee2.setText("");
				} 
				else {
					JOptionPane.showMessageDialog(frame, " Some input might be invalid, \n" +
					 "Please try again. \n Check total Hour and course fee should be > 0",
					 "Missing input", JOptionPane.WARNING_MESSAGE);
				} 
			}
			else {
				JOptionPane.showMessageDialog(frame, " Some input might be missing, \n" +
				 "Please try again.", "Missing input", JOptionPane.WARNING_MESSAGE);
			}         
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(frame, e.getMessage(),
			"Please input data correctly", JOptionPane.ERROR_MESSAGE);
		}
	}

	// method to set the course as completed
	public void checkCompletion() 
	{
		try{
			int courseNo = Integer.parseInt(txtCourseNo.getText().trim());            
			if (courseNo >= 0 && courseNo <= courseList.size()) {
				if (courseList.get(courseNo) instanceof Professional) {
					Professional professional = (Professional) courseList.get(courseNo);
					professional.setCompleted();
					JOptionPane.showMessageDialog(null,"Sucess! The course: " 
							+ courseList.get(courseNo).getCourseName() +"\n Has been set completed.");
				}
				else {
					JOptionPane.showMessageDialog(null, "Course number selected is not Professional"
						+ "Please try again from following range : \n 0 to " + (courseList.size() - 1) +
						"  instead of  " + (courseNo) , "ERROR", JOptionPane.WARNING_MESSAGE);
				}
			}
			else{
					JOptionPane.showMessageDialog(null, "Course No entered is invalid, \n" +
					 "Please try again from following range : \n 0 to " + (courseList.size() - 1) ,
					  "Invalid course No", JOptionPane.WARNING_MESSAGE);
				}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(frame, e.getMessage(),
			"Error: Invalid Input ", JOptionPane.ERROR_MESSAGE);
		} 
	}
	
	// method to clear all the
	public void clearAll() 
	{
		txtDescription.setText("");
		txtInstructor.setText("");
		txtCourseDuration.setText("");
		txtFee.setText("");
		txtDailyHour.setText("");
		txtDownPayment.setText("");
		txtStudentName.setText("");
		txtEnrollDate.setText("");
		txtRoomNo.setText("");
		txtStartDate.setText("");
		txtExamDate.setText("");
		txtDescription2.setText("");
		txtInstructor2.setText("");
		txtCourseDuration2.setText("");
		txtFee2.setText("");
		txtStudentName2.setText("");
		txtExamCenter.setText("");
		txtAwardedBy.setText("");
		txtValidDuration.setText("");
		txtCourseNo.setText("");
		txtCourseNo2.setText("");
		JOptionPane.showMessageDialog(null, "All fields are cleared");
	}
		
	// method to displayy all the entered details
	public void dispalyMethod() 
	{
		if (courseList.size() > 0 ){
			JOptionPane.showMessageDialog(null, "Displaying all the information \n" + 
													"Swith to The window");
			for (Course c: courseList){
				if(c instanceof Professional) {
					System.out.println("\n\n Professional Course:\n");
					((Professional)c).display();
					System.out.println("+++++++++++++++++++++++++++++");
				}
				if(c instanceof Certification) {
					System.out.println("\n\nCertification Course:\n");
					((Certification)c).display();        
					System.out.println("+++++++++++++++++++++++++++++");
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "No value have yet been added" ,
					  "Empty course list", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	// method to enroll a student to professional class
	public void enrollProfessional() 
	{
		try{    
			int downPayment = Integer.parseInt(txtDownPayment.getText().trim());
			int courseNo = Integer.parseInt(txtCourseNo.getText().trim());
			String studentName = txtStudentName.getText();
			String enrolDate = txtEnrollDate.getText();
			String roomNo = txtRoomNo.getText();

			if (!studentName.isEmpty() && !enrolDate.isEmpty() && !roomNo.isEmpty() 
				 && downPayment >= 0){
  
				if(courseNo >= 0 && courseNo < courseList.size()){
					Course c = courseList.get(courseNo);
					if(c instanceof Professional){
						Professional pObj = (Professional)c;
						pObj.setEnroll(roomNo, downPayment, enrolDate, studentName);
						JOptionPane.showMessageDialog(null,"Sucess! The student: " 
								+ studentName +" is enroled.");
						txtCourseNo.setText("");
						txtStudentName.setText("");
						txtEnrollDate.setText("");
						txtRoomNo.setText("");
						txtDownPayment.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "Course number selected is not Professional"
							+ "Please try again from following range : \n 0 to " + (courseList.size() - 1) +
							" instead of " + (courseNo) , "ERROR", JOptionPane.WARNING_MESSAGE);
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "Course No entered is invalid, \n" +
					 "Please try again from following range : \n 0 to " + (courseList.size() - 1) ,
					  "Invalid course No", JOptionPane.WARNING_MESSAGE);
				}
			} 
			else {
				JOptionPane.showMessageDialog(frame, " Some input might be missing, \n" +
				 "Please try again.", "Missing input", JOptionPane.WARNING_MESSAGE);
			}         
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(frame, e.getMessage(),
			"Please input data correctly", JOptionPane.ERROR_MESSAGE);
		}
	}  
	
	// method to enroll a student to certification class
	public void enrollCertification() 
	{
		try{    
			int courseNo = Integer.parseInt(txtCourseNo2.getText().trim());
			String studentName = txtStudentName2.getText();
			String startDate = txtStartDate.getText();
			String examDate = txtExamDate.getText();
			String examCenter = txtExamCenter.getText();

			if (!studentName.isEmpty() && !startDate.isEmpty() && !examDate.isEmpty() && !examCenter.isEmpty() ){    
				if(courseNo >= 0 && courseNo < courseList.size()){
					Course c = courseList.get(courseNo);
					if(c instanceof Certification){
						Certification cer= (Certification)c;
						cer.setEnroll(studentName, startDate, examDate, examCenter); 
						JOptionPane.showMessageDialog(null,"Sucess! The student: " 
							+ studentName +" is enroled.");  
							
						txtCourseNo2.setText("");
						txtStudentName2.setText("");
						txtStartDate.setText("");
						txtExamDate.setText("");
						txtExamCenter.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "Course number selected is not Certification"
							+ "Please try again from following range : \n 0 to " + (courseList.size() - 1) +
							" instead of " + (courseNo) , "ERROR", JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Course No entered is invalid, \n" +
					 "Please try again from following range : \n 0 to " + (courseList.size() - 1) ,
					  "Invalid course No", JOptionPane.WARNING_MESSAGE);
				}
			} 
			else {
				JOptionPane.showMessageDialog(frame, " Some input might be missing, \n" +
				 "Please try again.", "Missing input", JOptionPane.WARNING_MESSAGE);
			}         
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(),
			"Please input data correctly", JOptionPane.ERROR_MESSAGE);
		}
	}  
	
	// method to override the method in ActionListener class
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnAdd){
			addProfessional();
		}
		else if(e.getSource()==btnAdd2){
			addCertification();
		}
		else if(e.getSource()==btnClear){
			clearAll();
		}
		else if(e.getSource()==btnComplete){
			checkCompletion();
		}
		else if(e.getSource()==btnEnrollStudent){
			enrollProfessional();
		}
		else if(e.getSource()==btnEnrollStudent2){
			enrollCertification();
		}
		else if(e.getSource()==btnDisplayAll){
			dispalyMethod();
		}        
	}  
		
	// main method
	public static void main(String []args)
	{
		TrainingInstitute obj = new TrainingInstitute();
		obj.guiComponents();
	}
}
