public class Main {
    public static void main(String[] args) {

        Formatter ask = text -> text + "?";
        Formatter shout = text -> text + "!";

        String formatted1 = ask.format("Chep");
        System.out.println(formatted1);

        Main m = new Main();
        String formatted = m.format("miau", shout);

        GFormatter<Integer> toLength = String::length;
        GFormatter<String> trimmed = String::trim;

    }

    public String format(String text, Formatter formatter){
        return formatter.format(text);
    }
}