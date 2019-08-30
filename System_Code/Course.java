/**
 * Description
 * 
 * @Rajat Shrestha
 * @ID : 17030954
 * @Version 11/1/2018
 */
public class Course
{
    // defining variables
    public String courseName;
    public String instructorName;
    public String studentName;
    public int totalHours;
    
    // constructor method for Course
    public Course(String courseName, String instructorName, int totalHours)
    {
        this.instructorName = instructorName;
        this.courseName = courseName;
        this.totalHours = totalHours;
        this.studentName = " ";
    }

    //acessor methods for each variable
    public String getCourseName()
    {
        return courseName;
    }   
    public String getInstructorName()
    {
        return instructorName;
    }    
    public String getStudentName()
    {
        return studentName;
    }
    public int getTotalHours()
    {
        return totalHours;
    }
       
    // method to set student's name
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    
    // display method to display details
    public void display()
    {
        System.out.println("Course name is: "+ courseName);
        System.out.println("Instructor name is: "+ instructorName);    
        System.out.println("Total hours: "+ totalHours);
        
        if (!studentName.equals(" ")) {
            System.out.println("Student name: "+ studentName);
        }
    }
}