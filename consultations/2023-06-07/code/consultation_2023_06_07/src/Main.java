public class Main {

    /*
     Воспитательница в детском саду знает, что если Питер и Джон оба смеются или оба
     выглядят очень серьезно, то они что-то затевают и надо быть внимательной.
     Нужно помочь воспитательнице и написать метод, возвращающий true  когда оба они смеются
     или оба ходят мрачные . peterSmile, johnSmile.
     Задачу можно решить тремя способами.
     Пользоваться можно только  логическими операторами && , ||, ^, !
     */
    public static void main(String[] args) {

       int res = sumReturn("Hell");
        System.out.println(res);

        sum(1,2);
        sum(5,6);


      /*  printSmth();
        printSmth();
        printSmth();
        printSmth();
        printSmth();
        printSmth();

       */




    }
        static void printSmth(){
        System.out.println(1+2);
        System.out.println(3+4);
        System.out.println(7+41);

    }

       static void sum(int x, int y){
         int z = x + y;
           System.out.println(z);
           return;
       }

       static int sumReturn(String str){

            int length = str.length();
            if(length == 4)
                return -1;

            return length;

       }

       //  Питер рано встает на работу и поэтому рано ложится спать. Сосед Питера любит
    // слушать громкую музыку.  У Питера проблемы  если сосед слушает музыку и еще нет
    // семи утра или уже 20 часов. Напишите метод, возвращающий true  если у Питера
    // проблемы.  int hour - меняется в диапазоне от 0 до 23





}
