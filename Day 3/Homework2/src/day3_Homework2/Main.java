// github.com/hdayanir

package day3_Homework2;

public class Main {

	public static void main(String[] args) {

		Student students = new Student();
		students.setId(1); // bu ve setLessona kadar olan lisim extend edilen User classindan alinan degerler
		students.setNationalIdentity("10000000000");
		students.setFirstName("Huseyin");
		students.setLastName("DAYANIR");
		students.setEmail("hsyndayanir@gmail.com");
		students.setAddress("KARATAY / KONYA");
		students.setContact("533686XXXX");
		students.setBirthDate("02.09.1996");
		students.setLesson("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		students.setStudentNumber("2017131XXXXX"); // burasi ve bir alti Student class'ina ait veri
		students.setEducationDegree("LİSANS"); // burasida Student class'ina ait veri
		
		Instructor instructors = new Instructor();
		instructors.setId(2); // bu ve setLessona kadar olan kisim extend edilen User classindan alinan degerler
		instructors.setNationalIdentity("20000000000");
		instructors.setFirstName("Engin");
		instructors.setLastName("Demirog");
		instructors.setEmail("engindemirog@gmail.com");
		instructors.setAddress("Engin Hocanin Adresi");
		instructors.setContact("Engin Hoca Contact");
		instructors.setBirthDate("Engin Hocanin Dogum Tarihi");
		instructors.setLesson("Engin Hocanin Verdigi Ders");
		instructors.setInstructorNumber("Engin Hocanin egitmen numarasi");// burasi ve bir alti Student class'ina ait veri
		instructors.setInstructorAbout("Engin Hoca Hakkinda Bilgi");// burasida Student class'ina ait veri
		
		User[] users = {students, instructors};
		
		System.out.println("Burasi User Ekleme");
		UserManager usermanager = new UserManager();
		usermanager.addMultiple(users);
		
		System.out.println("-------------------------");
		
		System.out.println("Burasi Student Ekleme, Silme, Guncelleme");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(students);// burasi StudentManager icerisinde ki method
		studentManager.delete(students);// burasi Usermanager class'i içinde ki method, StudentManager
										// UserManager'i extend ettigi icin bu methodu kullanabildik
		studentManager.update(students);// ayni sekilde burasida oyle
		
		
		System.out.println("-------------------------");
		
		System.out.println("Burasi Instructor Ekleme, Silme, Guncelleme");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructors); // burasi InstructorManager icerisinde ki method
		studentManager.delete(instructors); // burasi Usermanager class'ý içinde ki method, InstructorManager
											// UserManager'i extend ettigi icin bu methodu kullanabildik
		studentManager.update(instructors); // ayni sekilde burasida oyle
	}
}