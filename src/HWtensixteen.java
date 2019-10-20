
//пока не получлось
public class HWtensixteen {
    public static void newBinMethodtwo(int k) { // создаю новый метод с параметром X

        int r;
        String two = "";
        while (k != 15) {
            r = k % 16; //
            two = r + two;
            k = k / 16;
        }
        System.out.println("Конечный результат = " + two);

    }



    public static void main(String[] args) {
        newBinMethodtwo(7467);
    }
}



