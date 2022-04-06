
public class Student {
	
	String imie;
	String nazwisko;
	int wiek;
	String email;
	String kierunek;
	
	public Student(String imie,String nazwisko, int wiek, String email,String kierunek) {
		
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.email = email;
		this.kierunek = kierunek;
	}
	
	@Override
	public String toString() {
		return "Student [imie = "+ imie + ", nazwisko = " + nazwisko + ", wiek = " + wiek + ", email = "+ email + ", kierunek = "+ kierunek + "]";
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKierunek() {
		return kierunek;
	}

	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}


}
