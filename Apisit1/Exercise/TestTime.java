package Exercise;

public class TestTime {
    public static void main(String[] args){
        Time2 t1=new Time2(0, 30, 0);
        Time2 t2=new Time2(t1);
        System.out.printf("The time is %s\n", t2.ToUniversalString());
    }
}
