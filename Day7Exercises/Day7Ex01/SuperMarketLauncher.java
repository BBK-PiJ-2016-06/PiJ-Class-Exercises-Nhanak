public class SuperMarketLauncher {

  public static void main(String[] args) {

  Supermarket sainsburys = new Supermarket();

  sainsburys.servePerson();

  Person kingOfTheNorth = new Person("Robb", "Icecream");
  sainsburys.addPerson(kingOfTheNorth);
  System.out.println("*");
  sainsburys.servePerson();

  System.out.println("**");
  sainsburys.servePerson();
  System.out.println("***");

  Person kingSlayer = new Person("Jaime", "Handmade bread");
  sainsburys.addPerson(kingSlayer);
  Person theHound = new Person("Sandor", "King's Chicken");
  sainsburys.addPerson(theHound);
  Person kahleesi = new Person("Daenerys", "Flame grilled burgers");
  sainsburys.addPerson(kahleesi);
  sainsburys.servePerson();
  sainsburys.servePerson();
  }
}
