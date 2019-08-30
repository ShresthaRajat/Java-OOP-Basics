/**
 * Description
 * 
 * @Rajat Shrestha
 * @ID : 17030954
 * @Version 11/1/2018
 */
public class Certification extends Course 
{
    // defineing variables
    boolean started;
    int courseFee;
    String examDate;
    String startDate;
    String examCenter;
    String certificateAwardedBy;
    String validTill;
    
    // constructor method for Certification
    public Certification( String courseName, int totalHours, String instructorName, 
                        String validTill, int courseFee, String certificateAwardedBy)
    {
        super(courseName, instructorName, totalHours);
        this.certificateAwardedBy = certificateAwardedBy;
        this.validTill = validTill;
        this.courseFee = courseFee;
        
        examCenter = " ";
        started = false;
        examDate = " ";
        startDate = " ";       
    }
    
    //accessor methods for each variables
    public boolean getStarted()
    {
        return started;
    } 
    public int getCourseFee()
    {
        return courseFee;
    } 
    public String getExamDate()
    {
        return examDate;
    }    
    public String getStartDate()
    {
        return startDate;
    }    
    public String getExamCenter()
    {
        return examCenter;
    }
    public String getCertificateAwardedBy()
    {
        return certificateAwardedBy;
    }
    public String getValidTill()
    {
        return validTill;
    }
    
    // method to set course fee
    public void setCourseFee(int courseFee)
    {
        if (started) {
            System.out.println("Sorry, the course has already been started ");
        }
        else {
            this.courseFee = courseFee ;
        }
    }

    // Method for enrolling student
    public void setEnroll(String studentName, String startDate, String examDate, String examCenter)
    {
        if (started) {
            System.out.println("Sorry, the course has already started");
            System.out.println("From: " + startDate);
        }
        else {
            setStudentName(studentName);
            this.startDate = startDate;
            this.examDate = examDate;
            this.examCenter = examCenter;
            started = true;
        }
    }

    // display method to display details
     public void display()
    {
        super.display();
        if (started) {
            System.out.println("Start date: " + startDate);
            System.out.println("Exam date: "+ examDate);
            System.out.println("Exam center: "+ examCenter);    
            System.out.println("Certificate awarding body: "+ certificateAwardedBy);
            System.out.println("Valid till: "+ validTill);  
        }
    }
}