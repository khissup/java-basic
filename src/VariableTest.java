public class VariableTest {
    public static void main(String[] args) {
        byte bnum = 127;    // byte -> -128 ~ 127 표현가능.
                            // 2진수에서 맨앞자리 1비트는 부호비트로 쓰이므로 바이트 표현범위가 -2^8 ~ 2^8 - 1 이 아니라
                            // -2^7 ~ 2^7 - 1 이 되는거임.
        System.out.println(bnum);

        // int num = 12345678900;
        long lNum = 12345678900L;
        System.out.println(lNum);
    }
}
