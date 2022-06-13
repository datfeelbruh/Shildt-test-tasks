public class Encode {
    String encodeMsg = "";
    String decodeMsg = "";
    final int key = generateKey();
    private int generateKey() {
        int[] randomNums = new int[8];
        int generatedKey = 0;
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 128);
        }
        char[] randomChars = new char[8];
        for (int i = 0; i < randomNums.length; i++) {
            randomChars[i] = (char) randomNums[i];
        }
        byte[] randomBytes = String.copyValueOf(randomChars).getBytes();
        for (byte b: randomBytes) {
           generatedKey += b;
        }
        return generatedKey;
    }

    public String getEncodeMsg(String msg) {
        encodeMsg = "";
        for (int i = 0; i < msg.length(); i++) {
            encodeMsg = encodeMsg + (char) (msg.charAt(i) ^ key);
        }
        return encodeMsg;
    }

    public String getDecodeMsg(String msg) {
        decodeMsg = "";
        for (int i = 0; i < msg.length(); i++) {
            decodeMsg = decodeMsg + (char) (encodeMsg.charAt(i) ^ key);
        }
        return decodeMsg;
    }
}
