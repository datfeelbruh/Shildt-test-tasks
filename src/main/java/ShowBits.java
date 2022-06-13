public class ShowBits {
    int numBits;

    ShowBits(int number) {
        numBits = number;
    }

    void show(long value) {
        long mask = 1;

        mask <<= numBits - 1;

        int spacer = 0;

        for (; mask != 0; mask >>>= 1) {
            if ((value & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
