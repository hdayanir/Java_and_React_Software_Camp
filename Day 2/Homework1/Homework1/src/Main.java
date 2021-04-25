// github.com/hdayanir

public class Main {

	public static void main(String[] args) {
		Courses courses1=new Courses(1,32,0.0,
				"Yazilim Gelistirici Yetistirme kampi (Java + React)",
				"Engin Demirog",
				"Java + React",
				"2 Ay sürecek yazilim delistirici yetistirme kampimizin duyurulari burada olacaktir.",
				"Java Kurs Image 1");
		
		Courses courses2=new Courses(2,0,0.0,
				"Yazilim Gelistirici Yetistirme kampi (C# + Angular)",
				"Engin Demirog",
				"C# + Angular",
				"2 Ay sürecek yazilim delistirici yetistirme kampimizin duyurulari burada olacaktir.",
				"Java Kurs Image 2");
		
		Courses courses3=new Courses(3,0,0.0,
				"Programlamaya Giris Icin Temel Kurs",
				"Engin Demirog",
				"PYTHON , JAVA ,C#",
				"PYTHON , JAVA ,C# gibi tüm diller icin temel programlama mantýgýný anlasýlýr...",
				"Java Kurs Image 3");
		
		Banner banner1=new Banner(0,"Kodlama.io","https://www.kodlama.io/");
		Banner banner2=new Banner(1,"Kurslarim","https://www.kodlama.io/courses/enrolled");
		Banner banner3=new Banner(2,"tum Kurslar","https://www.kodlama.io/courses");
		Banner banner4=new Banner(3,"Kampa Hazirlik","https://www.kodlama.io/p/kampa-hazirlik");
		Banner banner5=new Banner(4,"SSS","https://www.kodlama.io/p/sorular");
		Banner banner6=new Banner(5,"Profil","https://www.kodlama.io/profil");
		
		Courses[] courses = {courses1,courses2,courses3};
		for (Courses course : courses) {
			System.out.println(course.id);
			System.out.println(course.courseProgressPercentage);
			System.out.println(course.price);
			System.out.println(course.courseName);
			System.out.println(course.courseTeacher);
			System.out.println(course.useTechnologies);
			System.out.println(course.courseDetail);
			System.out.println(course.courseImage);
			System.out.println("-----------------------");
		}
		System.out.println("-----------------------");

		Banner[] banners = {banner1,banner2,banner3,banner4,banner5,banner6};
		for (Banner banner : banners) {
			System.out.println(banner.id);
			System.out.println(banner.bannerName);
			System.out.println(banner.bannerUrl);
			System.out.println("-----------------------");
		}
		System.out.println("-----------------------");

		CoursesManager coursesManager = new CoursesManager();
		coursesManager.addCourse(courses1);
		coursesManager.addCourse(courses2);
		coursesManager.addCourse(courses3);
		coursesManager.deleteCourse(courses1);
		coursesManager.deleteCourse(courses2);
		coursesManager.deleteCourse(courses3);


	}

}
