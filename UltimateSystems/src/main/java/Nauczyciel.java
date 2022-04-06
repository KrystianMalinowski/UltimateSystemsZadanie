import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Nauczyciel {
	@Size(min=2)
	String imie;
	@Size(min=2)
	String nazwisko;
	@Min(18)
	int wiek;
	@Email
	String email;
	String przedmiot;
	
	public Nauczyciel(String imie,String nazwisko,int wiek, String email, String przedmiot) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.email = email;
		this.przedmiot = przedmiot;
	}
	

	@Override
	public String toString() {
		return "Nauczyciel [imie = "+ imie + ", nazwisko = " + nazwisko + ", wiek = " + wiek + ", email = "+ email + ", przedmiot = "+ przedmiot + "]";
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
		return przedmiot;
	}

	public void setKierunek(String przedmiot) {
		this.przedmiot = przedmiot;
	}

}
