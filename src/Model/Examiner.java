package Model;
public class Examiner
{
    private String Name;
    private String phoneNumber;
    private String teacherId;
    private boolean[] availability;
    private String course;

    public Examiner(String firstName, String lastName, String phoneNumber, String teacherId, String course)
    {
        set(firstName, lastName, phoneNumber, teacherId, course);
    }

    public void set(String firstName, String lastName, String phoneNumber, String teacherId, String course)
    {
        this.Name = firstName;
        this.phoneNumber = phoneNumber;
        this.teacherId = teacherId;
        for (int i=0; i<31;i++) {
            this.availability[i] = true;
        }
        this.course = course;

    }

    public String getFirstName()
    {
        return Name;
    }

    public void setFirstName(String firstName)
    {
        this.Name = firstName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(String teacherId)
    {
        this.teacherId = teacherId;
    }

    public boolean isAvailable(int index)
    {
        return availability[index];
    }

    public void setAvailability(boolean availability,int index)
    {
        this.availability[index] = availability;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String toString()
    {
        String s = "";
        s += "Examiner name: " + Name + ", phone number: " + phoneNumber + ", id: " + teacherId +
                ", course: " + course + ", is available: " + availability;
        return s;
    }

    public boolean equals(Object obj)
    {
         if (!(obj instanceof Examiner))
         {
             return false;
         }
         Examiner other = (Examiner)obj;
         return Name.equals(other.Name) && phoneNumber.equals(other.phoneNumber)
                 && teacherId.equals(other.teacherId) && availability == other.availability && course.equals(other.course);
    }
}
