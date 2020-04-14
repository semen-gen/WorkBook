package task23;

public class Main23 {

    public static void main(String[] args) {
        Atm atm1 = new Atm(1000, 1000, 1000);
//        atm1.getCash(40);
        for (int i = 55570; i <= 55590; i += 10){
            atm1.getCash(i);
        }
        atm1.getCash(3000);
        atm1.getCash(280);


//        for (int i = 40; i <= 1000; i += 10)
//            System.out.println("i = " + i + " ost = " +
//                    (i % 100 == 10 ? i % 110 % 50 % 20 :
//                            i % 100 == 30 ? i % 130 % 50 % 20 :
//                                    i % 100 == 60 ? i % 100 % 60 % 50 :
//                                            i % 100 == 80 ? i % 100 % 80 % 50 :
//                                                    i % 100 % 50 % 20));
    }
}
