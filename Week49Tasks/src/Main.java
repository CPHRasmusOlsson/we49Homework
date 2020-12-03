import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {

        //task1
        String string1 = "abc";
        String string2 = "bac";
        String string3 = "cab";
        ArrayList<String> arrayList = new ArrayList<>();

        Task1(arrayList, string3);
        Task1(arrayList, string1);
        Task1(arrayList, string1);
        Task1(arrayList, string2);

        System.out.println(arrayList.toString());


        //task2
        Biblotek biblotek = new Biblotek();
        Bog bog1 = new Bog(1, "bog1", 2019);
        Bog bog2 = new Bog(2, "bog2", 2013);
        Bog bog3 = new Bog(1, "bog1", 2019);
        biblotek.tilføjBog(bog1);
        biblotek.tilføjBog(bog2);

        biblotek.findesBog(bog3);

        //task3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Grass Length in cm:");
        double grassLength = scanner.nextDouble();
        System.out.println("Desired length to cut in cm:");
        double lengthToCut = scanner.nextDouble();
        Task3(grassLength, lengthToCut);

        //task4
        Task4(8);

        //task5
        System.out.println("input: " + Task5());

        //task7
        Task7(20, 10);
        Task7(50, 56);

        //task8
        Task8();

        //task9
        Task9();

        //task10
        System.out.println(Task10("hej ", "jeg hedder Keld", 'e', 'a'));

        //task11
        String[] strings = new String[]{"Knud", "Hemming", "Frank"};
        System.out.println(Task11(strings, "asdaf"));


    }


    public static boolean Task1(ArrayList arrayList, String string) {
        try {
            if (arrayList.contains(string)) {
                System.out.println("String already exists in arraylist");
                return false;
            } else {
                arrayList.add(string);
                Collections.sort(arrayList);
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }


        return false;
    }


    public static void Task3(double grassLength, double lengthToCut) {
        double daysToCut = (lengthToCut - grassLength) / 0.8;

        System.out.println("grass needs to be cut in " + daysToCut + " days!");
    }

    public static void Task4(int size) {
        for (int x = 0; x < size; x++) {

            for (int y = 0; y < size; y++) {
                System.out.print(" * ");

            }
            System.out.println();
        }


    }

    public static int Task5() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println(
                "1.  Beregn\n" +
                        "2.  Udskriv\n" +
                        "3.  Hjælp"
        );

        try {
            choice = scanner.nextInt();
            if (choice <= 0 || choice >= 4) {
                System.out.println("please keep the number from 1-3. try again:");
                choice = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Wrong input, please put in 1-3 only");
        }


        return choice;
    }

    public static void Task7(int int1, int int2) {
        int addition;
        int subtraction;
        double division;
        int multiplication;
        if (int1 >= 1 && int1 <= 50 && int2 >= 1 && int2 <= 50) {
            addition = int1 + int2;
            subtraction = int1 - int2;
            division = int1 / int2;
            multiplication = int1 * int2;
        } else throw new IllegalArgumentException("method input should be 1-50");

        System.out.println(int1 + "+" + int2 + "=" + addition);
        System.out.println(int1 + "-" + int2 + "=" + subtraction);
        System.out.println(int1 + "/" + int2 + "=" + division);
        System.out.println(int1 + "*" + int2 + "=" + multiplication);

    }

    public static void Task8() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("enter the strings 1 by 1");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            arrayList.add(input);
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList.toString());
    }

    public static void Task9() {
        Scanner scanner = new Scanner(System.in);
        int numberOfUppercase = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            String nextLine = scanner.nextLine();
            if (nextLine.equals("")) {
                break;
            }
            arrayList.add(nextLine);
        }

        for (String string : arrayList) {
            if (Character.isUpperCase(string.charAt(0))) {
                numberOfUppercase++;
            }
        }

        System.out.println(numberOfUppercase + " lines started with an uppercase");
    }

    public static String Task10(String string1, String string2, char ch1, char ch2) {
        String combinedString = string1 + string2;
        String garbledString = combinedString.replace(ch1, ch2);

        return garbledString;
    }


    public static int Task11(String[] strings, String string) throws Exception {
        for (int i = 0; i < strings.length; i++) {
            if (string == strings[i]) {
                return i;
            } else throw new Exception("String not in array");

        }


        return -1;
    }

}


