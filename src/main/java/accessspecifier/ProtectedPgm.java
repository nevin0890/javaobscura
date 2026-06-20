package accessspecifier;

public class ProtectedPgm {
    protected  void  getname(String name){

        System.out.println("protected : "+name);
    }

    public static void main(String[] args) {
        ProtectedPgm p=new ProtectedPgm();
        p.getname("nevin");
    }

}
