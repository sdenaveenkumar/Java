package interfaces.Problem_3;

//Problem 3 : Interface Extending Another Interface (Hierarchy)

interface Printer{
    void printDocument(String content);
}

interface Scanner{
    void scanDocument();
}
//interface extends multiple interface
interface AllInOnePrinter extends Printer, Scanner{
    void faxDocument(String number);
}

class OfficeMachine implements AllInOnePrinter{
    @Override
    public void printDocument(String content) {
        System.out.println("Printing... " + content);
    }
    @Override
    public void scanDocument() {
        System.out.println("Scanning Document to pdf...");
    }
    @Override
    public void faxDocument(String number) {
        System.out.println("sending to : " + number);
    }
}

public class Main {
    static void main() {
        OfficeMachine myMachine = new OfficeMachine();
        myMachine.printDocument("I am a software Engineer!");
        myMachine.scanDocument();
        myMachine.faxDocument("2893742");

        //works only as Printer
        Printer printOnlyRef = myMachine;
        printOnlyRef.printDocument("woooow! this is wonderful.");

        //works only as Scanner
        Scanner scanOnlyRef = myMachine;
        scanOnlyRef.scanDocument();

        //works only as Fax




    }
}
