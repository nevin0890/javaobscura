package multipleInheritance;

public  class child implements parent2,Parent1{
    @Override
    public void name(String Name) {
        System.out.println("Name: "+Name);
    }

    @Override
    public void age( int age) {
        System.out.println("age : "+age);

    }

    public static void main(String[] args) {
        child c= new child();
        c.name("nevin");
        c.age(24);
    }
}
