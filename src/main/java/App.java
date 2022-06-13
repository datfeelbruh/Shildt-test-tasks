import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Encode enigma = new Encode();
        System.out.println(enigma.getEncodeMsg("Hello World"));
        System.out.println(enigma.getDecodeMsg("Hello World"));
        String[] array = {"abcd", "a", "af", "", "dafadsf"};
        System.out.println(Arrays.toString(MyBubbleSort.sort(array)));
        ShowBits bit1 = new ShowBits(8);
        ShowBits bit2 = new ShowBits(32);
        bit1.show(123);
        bit2.show(123);



    }
}

