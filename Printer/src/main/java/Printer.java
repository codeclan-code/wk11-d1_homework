public class Printer {

//    private int paper = 100;
    private int paper;
    private int pages;
    private int copies;
    private int toner = 100;

    public Printer(int paper, int pages, int copies){
        this.paper = paper;
        this.pages = pages;
        this.copies = copies;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public boolean printCopies() {
        if (this.paper >= pages * copies) {
            return true;
        } else {
            return false;
        }
    }

    public int getToner(){
        return this.toner -= (pages * copies);
    }

}
