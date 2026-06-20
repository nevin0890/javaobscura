package aggregration;

public class aggrprgm1 {
    int c,d;
    aggrprgm ag;
    public  aggrprgm1(int c,int d,aggrprgm ag)
    {
        this.c=c;
      this.d=d;
      this.ag=ag;
    }
    public void  display(){
        System.out.println("C : "+c);
        System.out.println("D : "+d);
        System.out.println("A : "+ag.a);
        System.out.println("B : "+ag.b );
    }

    public static void main(String[] args) {

        aggrprgm ob=new aggrprgm(2,8);
        aggrprgm1 ob1=new aggrprgm1(50,30,ob);
        ob1.display();


    }
}

