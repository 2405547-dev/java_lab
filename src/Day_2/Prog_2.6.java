class Diff{
    void Sub(int a,int b){
        int s=a-b;
        System.out.println("Diff:" +s);
    }
    void Sub(int a,int b,int c){
        int s=a-b-c;
        System.out.println("Diff:"+s);
    }
}
public class Prog_2.6{
    public static void main(String[] args){
        Diff d=new Diff();
        d.Sub(8,3);
        d.Sub(9,4,2);
    }

}
