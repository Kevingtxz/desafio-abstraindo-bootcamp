import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.kevin.domain.Bootcamp;
import com.kevin.domain.Content;
import com.kevin.domain.Course;
import com.kevin.domain.Dev;
import com.kevin.domain.Mentory;

public class Main {

	public static void main(String[] args) {
		Set<Content> contents = new LinkedHashSet<>() {
			private static final long serialVersionUID = 1L;
			{
				add(new Mentory("Mentoria Java", "Descrição Mentoria Java", LocalDate.now()));
				add(new Mentory("Mentoria JS", "Descrição Mentoria JavaScript", LocalDate.now()));
//			add(new Mentory("Mentoria Python", "Mentoria ETLs e IA", LocalDate.now()));
//			add(new Mentory("Mentoria Kotlin", "Mentoria Para devs mobile", LocalDate.now()));
//			add(new Mentory("Mentoria Microserviços", "Mentoria para aprender nova arquitetura", LocalDate.now()));

				add(new Course("Curso Java", "Descrição curso Java", 8));
				add(new Course("Curso JS", "Descrição curso JavaScript", 4));
//			add(new Course("Curso Python", "ETLs e IA", 3));
//			add(new Course("Curso Kotlin", "Para devs mobile", 5));
//			add(new Course("Curso Microserviços", "Aprende uma nova arquitetura", 8));	
			}
		};

//		courses.forEach(System.out::println);

		Bootcamp bootcamp = new Bootcamp("GFT Quality Assurance #1",
				"Conheça já o Bootcamp GFT Quality Assurance #1: um programa feito para você que planeja desenvolver suas habilidades em QA. Com cursos, desafios de códigos, mentorias e desafios de projeto, suas chances de ganhar destaque no mercado só aumentam! Não perca essa chance e inscreva-se já.",
				120);

		bootcamp.getContents().addAll(contents);

		List<Dev> devs = new ArrayList<>() {
			private static final long serialVersionUID = 1L;
			{
				add(new Dev("Kevin Gonçalves"));
				add(new Dev("André Figueredo"));
				add(new Dev("Júlia Neto"));
			}
		};

		devs.get(0).subscribeBootcamp(bootcamp);
		devs.get(2).subscribeBootcamp(bootcamp);

		devs.get(0).makeProgress();
		devs.get(0).makeProgress();
		devs.get(0).makeProgress();
		devs.get(1).makeProgress();
		devs.get(2).makeProgress();

		devs.forEach(System.out::println);

	}
}
