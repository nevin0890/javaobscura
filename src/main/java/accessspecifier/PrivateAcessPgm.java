package accessspecifier;

public class PrivateAcessPgm {
    public static void main(String[] args) {
        PrivateAcessPgm obj=new PrivateAcessPgm();
            obj.Name("nevin");


    }
    private void Name(String name){
        System.out.println("private access   : " +name);
    }
}
