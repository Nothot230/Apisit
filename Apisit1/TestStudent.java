package Apisit1;

public class TestStudent {
    public static void main(String[] args){
        Student st=new Student("นาย อภิสิทธิ์","66122250029",60,60,60);
        st.calculateGrade();
        st.calculateAverage();
        st.display();
    }
}
