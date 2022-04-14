package ch8;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 65

        char ch2 = 66;
        System.out.println(ch2); // B
        System.out.println((char)ch2); // B

        int ch3 = 67;
        System.out.println(ch3); // 67
        System.out.println((char)ch3); // C

        // char ch = -67; char은 음수 불가능
        // char ch = 12345678900; char는 2byte 크기가 넘어가는 수는 들어갈 수 없음.

        char han = '한'; // 한
        char ch = '\uD55C'; // 한
        System.out.println(han);
        System.out.println(ch);
    }
}
