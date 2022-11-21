# Instructions  
### Description:
In this activity you will combine what you've learned about object casting, inheritance, and working with collections. You will create a family with grandparents, parents who inherit from grandparents, and children who inherit from the parents.

Please follow the steps below:

### Steps:
1. Add in the following code into Person.java:
```Java
public class Person {
  public void walk() {
    System.out.println("The person walks");
  }
}
```
The purpose of this class is to be the root of the inheritance chain we will create. It defines the *walk()* method. This means any subclass is guaranteed to have this method through inheritance.

2. Add in the following code into Grandparent.java:
```Java
class GrandParent extends Person {

  String name;

  public GrandParent(String name){
    this.name = name;
  }

  @Override
  public void walk(){
    System.out.println(this.name + " staggers along");
  }

}
```
Notice that this class defines a *name* instance variable, a parameterized constructor, and a *walk()* method. The parameterized constructor takes in a String value and assigns it to the *name* variable. The inherited *walk()* method is overridden and prints the object's name concatenated to a String to the console.

3. Create a Parent class in Parent.java. The class extends the GrandParent class and should have the following:
  - an instance variable of the type `String` named *energy*.
  - a parameterized constructor that takes in two parameters: `String name` and `String energy`. The constructor should first call `super(name)` to initialize its name and then in another statement, it should initalize its energy instance variable using the `this` keyword.
  - an overridden *walk()* method that prints the following to the console:`this.name + " walks normally with " + this.energy + " energy"`
    
4. Create a Child class in Child.java. The class extends the Parent class and should have the following:
  - an instance variable of the type `String` named *diaperBrand*.
  - a parameterized constructor that takes in three parameters: `String name`, `String energy`, `String diaperBrand`. The constructor should first call `super(name, energy)` to initialize its name and energy and then in another statement, it should initalize its *diaperBrand* instance variable using the `this` keyword.
  - an overridden *walk()* method that prints the following to the console:`this.name + " crawls forward with " + this.energy + " energy while wearing " + this.diaperBrand + " diapers"`

5. In the Main.java file's *main()* method, create an Arraylist called *family* that can store Person objects. Subtype objects can be added to this list because of the IS-A relationship that we created with inheritance: A child *is a* Person, a Parent *is a* Person, and so on.
   
6. Below what you have so far in the *main()* method, create The following objects:
  - a GrandParent object with the name `Mary`
  - a GrandParent object with the name `John`
  - a Parent object with the name `Amy` who has `medium` energy
  - a Parent object with the name `Andy` who has `low` energy
  - a Child object with the name `Annie` who has `high` energy and uses `Johnson` branded diapers.

7. Below what you have so far in the *main()* method, add all these new family members to the family list.
    
8. To test what we've done so far, let's iterate over the list of family members and have every member walk. Add in the following code below what you have so far in the *main()* method:
```Java
for (Person person : family){
      person.walk();
    }
```
Run the program and note the output. We successfully added subtype objects into a parent type collection. We also iterated over the collection and for every object, we called the *walk()* method, which every object is guaranteed to have.

### Test:
Use the test provided. 

#### Sample output:
```
Mary staggers along
John staggers along
Amy walks normally with medium energy
Andy walks normally with low energy
Annie crawls forward with high energy while wearing Johnson diapers
```