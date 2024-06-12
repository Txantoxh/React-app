public class stringb {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// 16
        sb.append("abcdefghijklmnopqrst");
        System.out.println(sb);
        sb.delete(1, 4);// starts from o and and removes one set less character.
        System.out.println(sb);
        // sb.insert(1, "shiva");
        // System.out.println(sb);

    }

}
