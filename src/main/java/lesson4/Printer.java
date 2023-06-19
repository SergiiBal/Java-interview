package lesson4;

public interface Printer {

    Paper print(String printedContent);

}

class Paper {
    String content;
}

class LaserPrinter implements Printer {

    @Override
    public Paper print(String printedContent) {
        System.out.println("Using lasers to print...");
        Paper resultedPaper = new Paper();
        resultedPaper.content = printedContent;
        return resultedPaper;
    }
}


class BrokenPrinter implements Printer {

    @Override
    public Paper print(String printedContent) {
        System.out.println("No ink, sorry can't print...");
        Paper resultedPaper = new Paper();
        resultedPaper.content = "...";
        return resultedPaper;
    }
}

class Office {
    Printer workingPrinter;

    Office() {
        workingPrinter = new LaserPrinter();
//        workingPrinter = new BrokenPrinter();
    }

    Office(Printer printer) {
        this.workingPrinter = printer;
    }

    Paper usePrinter(String text) {
        return workingPrinter.print(text);
    }

    public static void main(String[] args) {
        Office office = new Office();
        Paper printedPaper = office.usePrinter("Hello World");
        System.out.println(printedPaper.content);
        Office officeWithBroken = new Office(new BrokenPrinter());
        Paper printedPaper1 = office.usePrinter("Hello World");
        System.out.println(printedPaper1.content);
    }
}
