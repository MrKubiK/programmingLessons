import java.util.Scanner;

public class Main {
    public static String lengthUnitConverter(int length){
        // Implentiere bsp 1
        if(length < 0){
            return "Invalid value.";
        }
        // 2127 mm -> 1m = 1000mm, 1cm = 10mm, 1mm = 1mm
        // 2127 % 10 = 7 -> weil 2127 / 10 = 212 volle und 7 rest ist
        // 2127 % 1000 = 127 / 10 = 12 -> weil es 12.7 ist und es ein int ist deshalb wird .7 abgeschnitten
        // 2127 / 1000 = 2 -> da brauch ich nichts schreiben
        int mm = length % 10;
        int cm = length % 1000 / 10;
        int m = length / 1000;

        return "m: " + m + ", cm: " + cm + ", mm: " + mm;
    }

    public static void writeHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void printer(String parameter){
        System.out.println(parameter);
    }

    public static void squareNumbersMultiply(int n1, int n2){
        // n1 ^ 2 * n2 ^ 2
        if(n1 <= 0) {
            return;
            //falls n1 <= 0 -> hore auf und mach nicht weiter
        }
        int result1 = n1 * n1;
        int result2 = n2 * n2;
        int finalResult = result1 * result2;
    }

    public static int squareNumbersMultiply2(int n1, int n2){
        int result1 = n1 * n1;
        int result2 = n2 * n2;
        int ichMagFortnite = result1 * result2;

        return ichMagFortnite;
    }

    public static void stairs(char character, int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char)(character + i));
            }
            System.out.println();
        }
    }

    public static void bloodPressure(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("systolisch: ");
        int systolic = scanner.nextInt();
        System.out.print("diastolic: ");
        int diastolic = scanner.nextInt();

        if (systolic <= 50 || systolic >= 250 || diastolic <= 30 || diastolic >= 150 || diastolic > systolic){
            System.out.println("Fehler.");
        }

        int category = 0;
        if(systolic < 120 || diastolic < 80){
            category = 1;
        }
        if(systolic >= 120 || diastolic >= 80){
            category = 2;
        }
        if (systolic >= 130 || diastolic >= 85) {
            category = 3;
        }
        if (systolic >= 140 || diastolic >= 90) {
            category = 4;
        }
        if (systolic >= 160 || diastolic >= 100) {
            category = 5;
        }
        if (systolic >= 180 || diastolic >= 110) {
            category = 6;
        }

        switch (category){
            case 1:
                System.out.println("optimaler");
                break;
            case 2:
                System.out.println("normaler");
                break;
            case 3:
                System.out.println("hochnormaler");
                break;
            case 4:
                System.out.println("leiche Hypertonie");
                break;
            case 5:
                System.out.println("mittlere Hypertonie");
                break;
            case 6:
                System.out.println("schwere Hypertonie");
                break;
        }

    }

    public static void mwst(){
        Scanner scan = new Scanner(System.in);
        String item = "none";
        double price = 0;
        double mwst = 0;
        double totalPrice = 0;
        double totalMwst = 0;
        double totalPriceMwst = 0;

        do{
            System.out.print("Geben Sie den Preis des Artikels ein (oder 0, um zu beenden): ");
            price = scan.nextDouble();
            if(price != 0){
                System.out.print("Geben Sie die Kategorie des Artikels ein (Lebensmittel, Kleidung, Elektronik,Sonstiges): ");
                item = scan.next();

                switch(item) {
                    case "Lebensmittel":
                        mwst = 1.07;
                        break;
                    case "Kleidung":
                        mwst = 1.19;
                        break;
                    case "Elektronik":
                        mwst = 1.19;
                        break;
                    case "Sonstiges":
                        mwst = 1.19;
                        break;
                    default:
                        System.out.println("Ungültige Kategorie!");
                        continue;
                }

                totalPrice += price;
                totalMwst += ((price * mwst) - price);
                totalPriceMwst += price * mwst;
            }
        }while(price != 0);

        if(totalPrice != 0){
            System.out.println("Gesamtsumme ohne MwSt:: " + (Math.round(totalPrice * 100.0) / 100.0) + "€");
            System.out.println("Gesamte MwSt: " + (Math.round(totalMwst * 100.0) / 100.0) + "€");
            System.out.println("Endbetrag: " + (Math.round(totalPriceMwst * 100.0) / 100.0) + "€");
        } else{
            System.out.println("Es wurden keine Artikel eingegeben!");
        }
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //writeHelloWorld();

        //String writeThis = "lexi";
        //printer(writeThis);

        //System.out.println("lexi");

        //int result1 = n1 * n1;
        //int result2 = n2 * n2;
        //int finalResult = result1 * result2;
        //squareNumbersMultiply(12, 15);
        //int shishabar = squareNumbersMultiply2(3, 3);
        //System.out.println(shishabar);

        //stairs('a', 5);
        //stairs('c', 3);

        //String res1 = lengthUnitConverter(2127);
        //String res2 = lengthUnitConverter(-1);
        //String res3 = lengthUnitConverter(178);
        //String res4 = lengthUnitConverter(12834);

        //System.out.println("res1: " + res1);
        //System.out.println("res2: " + res2);
        //System.out.println("res3: " + res3);
        //System.out.println("res4: " + res4);

        //bloodPressure();
        //mwst();

        // int[] myNums = { 1, 2, 3 ,4 ,5, 6}; // die kurze schreibweise
        // myNums[2]; = 3

        // int[] myNums = new int[] {1, 2, 3, 4, 5, 6}; // die lange schreibweise

        int[] myNums = new int[6];
        myNums[0] = 1;
        myNums[1] = 2;
        myNums[2] = 3;
        myNums[3] = 4;
        myNums[4] = 5;
        myNums[5] = 6;                  // was tatsachlich in dem speicher passiert
        // ich will noch aber 7 reinspeicher
        // myNums[6] = 7; // das geht nicht -> das ist das problem mit arrays

        oneMonthCalendar(31, 3);
    }

    public static void oneMonthCalendar(int daysAmount,int firstDay){
        int weeks = daysAmount/7 + 1;
        int counter = 1;
        boolean startCounting = false;

        for (int i = 0; i < weeks; i++) {
            for (int j = 0; j < 7; j++) {
                if(firstDay == j){
                    startCounting = true;
                }

                if (counter < 10){
                    System.out.print(" ");
                }

                if(startCounting){
                    System.out.printf("%1d ", counter);
                    counter++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}