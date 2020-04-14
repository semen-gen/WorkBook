package task23;

public class Atm {
    private int cash20, cash50, cash100;

    public Atm(int cash20, int cash50, int cash100) {
        this.cash20 = cash20;
        this.cash50 = cash50;
        this.cash100 = cash100;
    }

    public void addCash20(int val) {
        this.cash20 += val;
    }

    public void addCash50(int val) {
        this.cash50 += val;
    }

    public void addCash100(int val) {
        this.cash100 += val;
    }

    public boolean getCash(int sum) {
        boolean result = true;
        int issued = sum;
        int c100 = 0, c50 = 0, c20 = 0, temp;
        StringBuilder str = new StringBuilder("");

        if (sum >= 20 && sum != 30 && sum % 10 == 0) {
            switch (sum % 100) {
                case 10:
                    sum -= 50;
                    c50 = 1;
                case 60:
                    sum -= 60;
                    c20 = 3;
                    break;
                case 30:
                    sum -= 50;
                    c50 = 1;
                case 80:
                    sum -= 80;
                    c20 = 4;
                    break;
            }

            c100 = sum / 100;
            c50 += (sum % 100 / 50);
            c20 += (sum % 100 % 50 / 20);

            if (c20 > cash20) {
                result = false;
                str.append("Не достаточно купюр номиналом 20");
            }
            if (c50 > cash50 && result) {
                result = false;
                str.append("Не достаточно купюр номиналом 50");
            }
            if (c100 > cash100 && result) {
                temp = c100 - cash100;
                c100 = cash100;
                if (c50 + temp * 2 <= cash50) {
                    c50 += temp * 2;
                }
                else {
                    temp -= (cash50 - c50) % 2 == 0 ? (cash50 - c50) / 2 : (cash50 - c50 - 1) / 2;
                    c50 = (cash50 - c50) % 2 == 0 ? cash50 : cash50 - 1;

                    if (c20 + temp * 5 <= cash20) {
                        c20 += temp * 5;
                    }
                    else {
                        result = false;
                        str.append("Не достаточно купюр номиналом 20\n");
                        str.append("Не достаточно купюр номиналом 50\n");
                        str.append("Не достаточно купюр номиналом 100");
                    }
                }

            }
        }
        else {
            result = false;
            str.append("Данную сумму не возможно выдать имеющимися купюрами\n");
        }
        if (result) {
            cash20 -= c20;
            cash50 -= c50;
            cash100 -= c100;
            str.append("Операция удалась.\n");
            if (c100 > 0) str.append("100 = ").append(c100).append("\n");
            if (c50 > 0) str.append("50 = ").append(c50).append("\n");
            if (c20 > 0) str.append("20 = ").append(c20).append("\n");
            str.append("Выдано: ").append(issued);
        }
        else {
            str.insert(0, "Операция не удалась.\n");
        }

        System.out.println(str);
        System.out.println(this);
        return result;
    }

    public String toString() {
        return "Atm{" +
                "cash20=" + cash20 +
                ", cash50=" + cash50 +
                ", cash100=" + cash100 +
                '}' + '\n';
    }
}
