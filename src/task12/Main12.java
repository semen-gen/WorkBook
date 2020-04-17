package task12;

public class Main12 {

    public static void main(String[] args) {
        printNumber(900);
        printNumber(555444333222111000L);
        printNumber(2_800_020);
    }

    public static void printNumber(long number) {
        long delimiter = 1000;
        long step = 10;
        StringBuilder str = new StringBuilder();

        while (number / delimiter > 0) {
            long resultOfDivision = number % delimiter;
            StringBuilder zerosBefore = new StringBuilder();
            long tempDelimiter = delimiter;

            while (true) {
                tempDelimiter /= step;
                if (tempDelimiter > 1 && resultOfDivision < tempDelimiter) zerosBefore.append(0);
                else break;
            }

            str.insert(0, " " + zerosBefore + resultOfDivision);
            System.out.println(str);
            number /= delimiter;
        }
        str.insert(0, number);

        System.out.println(str);
    }

}
