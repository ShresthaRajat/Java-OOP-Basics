/**
 * Description
 * 
 * @Rajat Shrestha
 * @ID : 17030954
 * @Version 11/1/2018
 */
public class Professional extends Course 
{
    // defining variables
    int courseFee;
    String enrollDate;
    String roomNo;
    int dailyHour;
    int downPayment;
    boolean started;
    boolean completed;    
    
    // Constructor for Professional class
    public Professional(int totalHours, String courseName, String instructorName, int courseFee, int dailyHour)
    {
        super(courseName, instructorName, totalHours);
        this.courseFee = courseFee;
        this.dailyHour = dailyHour;
        enrollDate = " ";
        roomNo = " ";
        downPayment = 0;
        started = false;
        completed  = false;   
    }           
    
    // Accessor method for each variable
    public int getCourseFee()
    {
        return courseFee;
    }    
    public int getDailyHour()
    {
        return dailyHour;
    }    
    public int getDownPayment()
    {
        return downPayment;
    }    
    public String getEnrollDate()
    {
        return enrollDate;
    }  
    public String getRoomNo()
    {
        return roomNo;
    }      
    public boolean getStarted()
    {
        return started;
    }      
    public boolean getCompleted()
    {
        return completed;
    } 
    
    // Setting course fee
    public void setCourseFee(int courseFee)
    {
        this.courseFee = courseFee;
    }
    
    // Setting daily hour
    public void setDailyHour(int dailyHour)
    {
        this.dailyHour = dailyHour;   
    }
    
    // Method for enrolling student
    public void setEnroll(String roomNo, int downPayment, String enrollDate, String studentName)
    {
        if (started) {
            System.out.println("Sorry, the course has already started");
            System.out.println("By the instructor: " + instructorName);
            System.out.println("In the room: " + roomNo);
        }
        else {
            setStudentName(studentName);
            this.enrollDate = enrollDate;
            this.downPayment = downPayment;
            this.roomNo = roomNo;
            started = true;
            completed  = false;
        }
    }
    
    // Method to set course completion
    public void setCompleted()
    {
        if (completed){
            System.out.println("The course has already completed");
        }
        else {
            setStudentName("");
            this.enrollDate = " ";
            this.roomNo = " ";
            this.downPayment = 0;
            started = false;
            completed  = true;
        }
    }
 
    // method to display course details
    public void getCourse()
    {
        System.out.println("Course name: " + getCourseName());
        System.out.println("Instructor name: " +  getInstructorName());
        System.out.println("Course fee: " + getCourseFee());
    }
    
    //  display method to display details
    public void display()
    {
        super.display();
        if (started) {
            System.out.println("Down payment: " + downPayment);
            System.out.println("Enrolled in: "+ enrollDate);
            System.out.println("course completion: "+ completed);    
        }
    }   
    
}