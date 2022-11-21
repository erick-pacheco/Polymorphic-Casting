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