import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.kevin.domain.Course;
import com.kevin.domain.Mentory;

public class Main {
	
	
	public static void main(String[] args) {
		List<Course> courses = new ArrayList<>() {
			private static final long serialVersionUID = 1L;
		{
			add(new Course("Curso Java", "Descrição curso Java", 8));
			add(new Course("Curso JS", "Descrição curso JavaScript", 4));
			add(new Course("Curso Python", "ETLs e IA", 3));
			add(new Course("Curso Kotlin", "Para devs mobile", 5));
			add(new Course("Curso Microserviços", "Aprende uma nova arquitetura", 8));
		}};
		List<Mentory> mentories = new ArrayList<>() {
			private static final long serialVersionUID = 1L;
		{
			add(new Mentory("Mentoria Java", "Descrição Mentoria Java", LocalDate.now()));
			add(new Mentory("Mentoria JS", "Descrição Mentoria JavaScript", LocalDate.now()));
			add(new Mentory("Mentoria Python", "Mentoria ETLs e IA", LocalDate.now()));
			add(new Mentory("Mentoria Kotlin", "Mentoria Para devs mobile", LocalDate.now()));
			add(new Mentory("Mentoria Microserviços", "Mentoria para aprender nova arquitetura", LocalDate.now()));
		}};
		
		courses.forEach(System.out::println);
	}
}
