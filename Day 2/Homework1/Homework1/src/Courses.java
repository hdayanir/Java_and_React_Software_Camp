// github.com/hdayanir

public class Courses {
	
	public Courses(int id,int courseProgressPercentage,
			double price,String courseName,String courseTeacher,
			String useTechnologies,String courseDetail,String courseImage) {
			this.id=id;
			this.courseProgressPercentage=courseProgressPercentage;
			this.price=price;
			this.courseName=courseName;
			this.courseTeacher=courseTeacher;
			this.useTechnologies=useTechnologies;
			this.courseDetail=courseDetail;
			this.courseImage=courseImage;
	}
	
	int id;
	int courseProgressPercentage; // kurs ilerleme yüzdesi
	double price;
	String courseName;
	String courseTeacher;
	String useTechnologies; //kursta kullanilan teknoloji
	String courseDetail;
	String courseImage;
	
	
	
}
