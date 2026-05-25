package multilevelinheritance;

public class Son extends  Father {
    public static void main(String[] args) {
        Son S=new Son();
        S.multi(23,35);
        S.add(12,24);
        S.div(24,3);


    }
    public void div(float a,float b){
        float result=a/b;
        System.out.println("SON : "+result);
    }
}
