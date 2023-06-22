public class Main {

    public static void main(String[] args) {

         String str = "hello";
         String substr = "km";
      //  System.out.println(str.endsWith(substr));

      //  System.out.println(isAutomorphic(76));
      //  System.out.println(isAutomorphic(77));

        int[] numbers ={2,5,18,53};
        System.out.println(containsProduct(numbers,36));
        System.out.println(containsProduct(numbers,37));

    }

    public static boolean isAutomorphic( int num){

        int numSquare = num*num;

        String strNum = Integer.toString(num);
        String square = Integer.toString(numSquare);

        return square.endsWith(strNum);

        //1.Написать метод, который принимает  упорядоченный массив целых чисел и целое  число n и  проверяет есть ли в этом массивt
        // 2 числа, чье произведение равно n
        // {2,5,18,53}, 36  -> true
        // {2,5,18,53}, 40  -> false
        //


        /* 2. Школа 20 века. Девочки на уроках труда готовят суп, а мальчики делают табурет.
        // Создать массив из 2 мальчиков и 2 девочек и вывести на экран их имя, возраст, мальчик или девочка
         и занятие на уроке труда


         */


    }
// {1,2,5,18,53},36
    public static boolean containsProduct( int[] numbers, int product){
        int i = 0;
        int j = numbers.length-1;

        while ( j - i > 0){
            int mul = numbers[i] * numbers[j];

            if ( mul < product){
                i++;
            }else if (mul > product){
                j--;
            }else
                return true;

        }
        return false;
    }


}
