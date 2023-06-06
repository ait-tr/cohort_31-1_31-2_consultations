public class Main {

    public static void main(String[] args) {

        System.out.println(isSleeping(false,false));
        System.out.println(isSleeping(true,false));
        System.out.println(isSleeping(false,true));
        System.out.println("2000 is leap year "+isLeapYear(2000));

        boolean a = true;
        boolean b = true;

        boolean result = a && b;
        System.out.println(result);

        boolean p = true;
        boolean q = true;

        boolean and = p&&q;
        System.out.println(and);//true

        boolean xor = p^q;
        System.out.println(xor);//false


    }
    boolean foo ( boolean a, boolean b){
        return a || b;
    }
    // 1.John спит днем  если он не работает или у него отпуск. Переменная weekday ( рабочий
    // день) =  true  если это рабочий день. Переменная vacation = true  если у Джона отпуск.
    // Написать метод, возвращающий true  если Джон спит.
   // isSleeping ( boolean weekday, boolean vacation)
    // isSleeping (false,false) -> true
    // isSleeping (true,false) -> false
    // isSleeping (false,true) -> true
    // при написании метода использовать только  && || ! ^

    public static boolean isSleeping (boolean weekday, boolean vacation){
        return !weekday || vacation;
    }


    // false false  false
    // true  false  true
    // false true   true
    // true true    false

    // 2. Написать метод, определяющий является ли год високосным. Год будет високосным,
    // если он без остатка делится на 4 и при этом не делится на 100 либо если он делится на 100 то также без остатка
    // должен делиться на 400.
    // public static boolean isLeapYear ( int year)
    // при написании метода использовать только  && || ! ^
    public static boolean isLeapYear ( int year){
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100==0)&& (year % 400 == 0));
        return a && (b || c);
    }


    /*
    p         q             p&&q        p||q      p^q     !p
    false     false         false       false     false   true
    true      false         false       true      true    false
    false     true          false       true      true    true
    true      true          true        true      false   false
     */

    //3. Даны два целые числа  a  и  b.  Написать метод, возвращающий true  если одно из чисел равно 10  или
    // их сумма равна 10
    // isTen (9,10) -> true
    // isTen (9,9) -> false
    // isTen (1,9) -> true

    // при написании метода использовать только  && || ! ^


}
