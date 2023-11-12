package week9;

public class Ex21 {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/week9/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }

}
