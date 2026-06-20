package encapsulation;

public class EncapsulationPgm {
  public char name;
  private  int age;

  public   void  setterMethod(char name,int age){
      this.name=name;
      this.age=age;
  }
  public void getter(){
      System.out.println("Name = "+name);
      System.out.println("age = "+age);
  }
}

