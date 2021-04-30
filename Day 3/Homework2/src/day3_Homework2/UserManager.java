// github.com/hdayanir

package day3_Homework2;

public class UserManager {
	public void add(User user) { 
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi eklendi");
	}
	
	public void add(User[] users) {
		for(User user : users) {
			add(user);
		}	
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getId() + " id ye ait " + user.getFirstName()  + " isimli kisi guncellendi");
	}
}