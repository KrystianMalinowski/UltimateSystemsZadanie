
public enum Kierunek {
	
	informatyka_stosowana(0),
	programowanie(1),
	fizyka_budowlana(2),
	fizyka_stosowana(3),
	matematyka_stosowana(4),
	matematyka_inzynierska(5),
	chemia_budowlana(6),
	chemia_organiczna(7),
	geografia_fizyczna(8),
	gografia_stosowana(9);
	
	int numer;
	
	private Kierunek(int nr) {
		
		this.numer= nr;
	}

}
