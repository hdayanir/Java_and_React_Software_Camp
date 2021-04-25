// github.com/hdayanir

public class CoursesManager {
	public void addCourse(Courses course){
		System.out.println(course.id + " id ' li "  + course.courseName+" isimli Kurs eklendi. ");
	}
	public void deleteCourse(Courses course){
			System.out.println(course.id+ " id ' li " +   course.courseName +" isimli Kurs silindi. ");
	}
}
