package Task_2;

public class Main {

	public static void main(String[] args) {
		
		SportType teakwondo = new SportType("Women's Teakwondo", 4, 0);
		SportType waterpolo = new SportType("Women's Waterpolo", 9, 0);
		SportType artisticGymnastics = new SportType("Women's Artistic Gymnastics", 6, 0);
		SportType shooting = new SportType("Men's Shooting", 5, 0);
		SportType cycling = new SportType("Women's Cycling", 12, 0);
		SportType tennis = new SportType("Women's Tennis", 10, 0);
		SportType tableTennis = new SportType("Men's Table Tennis", 8, 0);
		SportType football1 = new SportType("Men's Football", 22, 0);
		SportType alpineSky = new SportType("Women's Alpine Sky", 14, 0);
		SportType football2 = new SportType("Men's Football", 44, 0);
		SportType swimming = new SportType("Men's Swimming", 4, 0);
		
		CompositeGender chinaWomen = new CompositeGender("China-Women", 0, 0);
		chinaWomen.addOlympicsTeams(teakwondo);
		chinaWomen.addOlympicsTeams(waterpolo);
		chinaWomen.addOlympicsTeams(artisticGymnastics);
		
		CompositeGender chinaMen = new CompositeGender("China-Men", 0, 0);
		chinaMen.addOlympicsTeams(shooting);
		
		CompositeGender germanyWomen = new CompositeGender("Germany-Women", 0, 0);
		germanyWomen.addOlympicsTeams(cycling);
		germanyWomen.addOlympicsTeams(tennis);
		
		CompositeGender germanyMen = new CompositeGender("Germany-Men", 0, 0);
		germanyMen.addOlympicsTeams(tableTennis);
		germanyMen.addOlympicsTeams(football1);
		
		CompositeGender italyWomen = new CompositeGender("Italy-Women", 0, 0);
		italyWomen.addOlympicsTeams(alpineSky);
		
		CompositeGender italyMen = new CompositeGender("Italy-Men", 0, 0);
		italyMen.addOlympicsTeams(football2);
		italyMen.addOlympicsTeams(swimming);
		
		CompositeCountry china = new CompositeCountry("China", 0, 33);
		china.addOlympicsTeams(chinaWomen);
		china.addOlympicsTeams(chinaMen);
		
		CompositeCountry afghanistan = new CompositeCountry("Afghanistan", 0, 12);
		
		CompositeCountry germany = new CompositeCountry("Germany", 0, 34);
		germany.addOlympicsTeams(germanyWomen);
		germany.addOlympicsTeams(germanyMen);
		
		CompositeCountry italy = new CompositeCountry("Italy", 0, 26);
		italy.addOlympicsTeams(italyWomen);
		italy.addOlympicsTeams(italyMen);
		
		CompositeContinent asia = new CompositeContinent("Asia", 0, 69);
		asia.addOlympicsTeams(china);
		asia.addOlympicsTeams(afghanistan);
		
		CompositeContinent africa = new CompositeContinent("Africa", 0, 360);
		
		CompositeContinent europe = new CompositeContinent("Europe", 0, 420);
		europe.addOlympicsTeams(germany);
		europe.addOlympicsTeams(italy);
		
		CompositeContinent latam = new CompositeContinent("South America", 0, 31);
		
		
		CompositeOlympics games2024 = new CompositeOlympics("Olympics 2024", 0, 0);
		games2024.addOlympicsTeams(asia);
		games2024.addOlympicsTeams(africa);
		games2024.addOlympicsTeams(europe);
		games2024.addOlympicsTeams(latam);
		
		System.out.println("------------------------ a ------------------------");
		germanyMen.printInfo();
		System.out.println("------------------------ b ------------------------");
		germany.printInfo();
		System.out.println("------------------------ c ------------------------");
		asia.printInfo();
		System.out.println("------------------------ d ------------------------");
		games2024.printInfo();
	}

}
