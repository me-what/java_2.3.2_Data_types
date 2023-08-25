public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        long c = 2121;
        long num = 2147483649L;

        int num111 = 0x6F; // 16-теричная система, число 111
        int num8 = 010; // 8-ричная система, число 8
        int num13 = 0b1101; // 2-ичная система, число 13
        System.out.println(num13 + "\n");

        int x = 123_456;
        int y = 234_567__789;
        System.out.println(x);  // 123456
        System.out.println(y + "\n");  // 234567789

        float fl = 30.6f;
        double db = 30.6;

        char ch=102; // символ 'f'
        System.out.println(ch + "\n");

        String hello = "Hello...";
        System.out.println(hello+"\n");

        String text = "Hello \nworld";
        System.out.println(text + "\n");

        String text2 = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(text2 + "\n");

        String text3 = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text3);
    }
}