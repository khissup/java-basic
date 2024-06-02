public class DoubleTest {
    public static void main(String[] args) {
        double dnum = 3.14;
        float fnum = 3.14f;
        // 실수리터럴은 기본적으로 double형으로 저장되므로, float에 저장시 뒤에 f붙여서 float형(4byte)로 저장해야함.
        System.out.println(dnum);
        System.out.println(fnum);//
    }
}
