public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(20, false);
        System.out.println(printer.printPages(3));
        System.out.println(printer.printPages(5));
        System.out.println(printer.getPagesPrinted());
    }
}
