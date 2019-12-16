package Model;

import java.util.ArrayList;

public class CourseList
{
    private ArrayList<Course> courses;

    public CourseList()
    {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course)
    {
        courses.add(course);
    }

    public void removeCourse(Course course)
    {
        courses.remove(course);
    }

    public Course getCourse(int index)
    {
        return courses.get(index);
    }

    public String toString()
    {
        String s = "";
        for (int i = 0; i < courses.size(); i++)
        {
            s += courses.get(i).toString() + "/n";
        }
        return s;
    }
}
