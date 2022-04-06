import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {


	public static void main(String[] args) {
	
		
		
		ArrayList<Nauczyciel> listaNauczycieli= new ArrayList<Nauczyciel>();
		ArrayList<Student> listaStudentow = new ArrayList<Student>();
		
		
		
		listaNauczycieli.add(new Nauczyciel("Steve", "Wozniak", 35, "stevewozniak@gmail.com", "informatyka"));
		listaNauczycieli.add(new Nauczyciel("Mikolaj", "Kopernik", 55, "mikolajkopernik@gmail.com", "fizyka"));
		listaNauczycieli.add(new Nauczyciel("Stefan", "Banach", 40, "stefanbanach@gmail.com", "matematyka"));
		listaNauczycieli.add(new Nauczyciel("Maria", "Sklodowska-Curie", 45, "mariasklodowska_curie@gmail.com", "chemia"));
		listaNauczycieli.add(new Nauczyciel("Edmund", "Strzelecki", 50, "edmundstrzelecki@gmail.com", "geografia"));
		
		int w = 20;
		int ki =0;
		
		for(Imie i: Imie.values())
			for(Nazwisko n : Nazwisko.values()) {
				String mail = i.name().toLowerCase()+n.name().toLowerCase()+"@gmail.com";
				Kierunek k = Kierunek.values()[ki];
				String kier = k.name().toLowerCase();
				listaStudentow.add(new Student(i.name(),n.name(),w,mail,kier));
				ki++;
				w++;
				if(ki==10)
					ki=0;
				if(w==30)
					w=20;
			}
		
//		  for (int i = 0; i < listaStudentow.size(); i++) 
//			  System.out.println(listaStudentow.get(i).toString() + " ");
		 
		
		
		
		Scanner in = new Scanner(System.in);
		String reakcja ="";
		String komenda ="";
		
		
		while(true) {
			
			System.out.println("Wybierz opcje:");
			System.out.println("1. Dodaj nauczyciela.");
			System.out.println("2. Edytuj nauczyciela.");
			System.out.println("3. Usun nauczyciela.");
			System.out.println("4. Dodaj studenta.");
			System.out.println("5. Edytuj studenta.");
			System.out.println("6. Usun studenta.");
			
			komenda=in.nextLine();
			if(Integer.valueOf(komenda)==1){
				dodajNauczyciela(listaNauczycieli);
			}
			if(Integer.valueOf(komenda)==2){
				edytujNauczyciela();
			}
			if(Integer.valueOf(komenda)==3){
				usunNauczyciela();
			}
			if(Integer.valueOf(komenda)==4){
				dodajStudenta();
			}
			if(Integer.valueOf(komenda)==5){
				edytujStudenta();
			}
			if(Integer.valueOf(komenda)==6){
				usunStudenta();
			}
		}

		
	}

	
	
	public static ArrayList<Nauczyciel> dodajNauczyciela(ArrayList<Nauczyciel> listaNauczycieli){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Wpisz imie:");
		String imie = in.nextLine();
		System.out.println("Wpisz nazwisko:");
		String nazwisko = in.nextLine();
		System.out.println("Wpisz wiek:");
		int wiek = Integer.valueOf(in.nextLine());
		System.out.println("Wpisz email:");
		String email = in.nextLine();
		System.out.println("Wpisz przedmiot:");
		String przedmiot = in.nextLine();
		
		Nauczyciel nauczyciel = new Nauczyciel(imie, nazwisko, wiek, email, przedmiot);
//		listaNauczycieli.add(nauczyciel);
		
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//		Set<ConstraintViolation<Nauczyciel>> violations = validator.validate(nauczyciel);
//		for (ConstraintViolation<Nauczyciel> violation : violations) {
//		    System.out.println(validationError.getPropertyPath().toString() + " " + validationError.getMessage());
//		    System.out.println("1");
//		}
		int bugs =0;
		final Validator validator;
		ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
        validator = validationFactory.getValidator();
        Set<ConstraintViolation<Nauczyciel>> validationErrors = validator.validate(nauczyciel);
        for (ConstraintViolation<Nauczyciel> validationError : validationErrors) {
            System.out.println(validationError.getPropertyPath().toString() + " " + validationError.getMessage());
            bugs++;
        }
        if(bugs==0)
        	listaNauczycieli.add(nauczyciel);
//		Validator validator;
//		
//		Main v = new Main();
//        v.showSimpleValidation(nauczyciel);
//		
		for (int i = 0; i < listaNauczycieli.size(); i++) 
			  System.out.println(listaNauczycieli.get(i).toString() + " ");
		
		return listaNauczycieli;
	}
	
	public static void edytujNauczyciela(){
		
	}
	public static void usunNauczyciela(){
		
	}
	public static void dodajStudenta(){
		
	}
	public static void edytujStudenta(){
		
	}
	public static void usunStudenta(){
		
	}
	
}
