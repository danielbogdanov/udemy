public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel < 0 || tonerLevel > 100 ? -1 : tonerLevel ;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100 ){
            if(tonerAmount + tonerLevel > 100){
                return -1;
            }else{
                tonerLevel+=tonerAmount;
                return tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = pagesToPrint%2 == 0 ? pagesToPrint/2 : pagesToPrint/2 + 1  ;
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
