import java.util.ArrayList;

class Main {
  public static void main(final String[] args) {

    /*
     * ArrayList Doc: https://replit.com/@RevUp5/ArrayList-erickpacheco2#Main.java
     */
    ArrayList<Person> family = new ArrayList<Person>();

    /* Section 6 */
    GrandParent marry = new GrandParent("Mary");
    GrandParent john = new GrandParent("John");
    Parent amy = new Parent("Amy", "medium");
    Parent andy = new Parent("Andy", "low");
    Child annie = new Child("Annie", "high", "Johnson");

    /* Section 7 */
    family.add(marry);
    family.add(john);
    family.add(amy);
    family.add(andy);
    family.add(annie);

    /* Section 8 */
    for (Person person : family) {
      person.walk();
    }

  }
}