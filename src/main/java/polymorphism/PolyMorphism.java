package polymorphism;

public class PolyMorphism {
    public static void main(String[] args) {
        PolyMorphism p=new PolyMorphism();
        p.add();
        p.add(12,24);
        p.add(2f,56f);



    }
    public void add(){

        System.out.println("sum ");
    }
    public void add(int a ,int b){
        int sum=a+b;
        System.out.println("sum ="+sum);
    }
    public void add(float a ,float b){
        float res=a+b;
        System.out.println("result = "+res);
    }
}
//compile time polymorphism program/method overloading
