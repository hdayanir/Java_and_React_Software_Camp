// github.com/hdayanir

package day3_Homework2;

public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi Instructor olarak eklendi");	
	}
}
