import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str = "Hello";
       char[] chars = str.toCharArray();


        System.out.println(Arrays.toString(chars));

        System.out.println(findSecondThirdLetters("Hello"));

        System.out.println(doubleLength("Hello"));

        System.out.println(isAnagram("hello","klehl"));
        System.out.println(mySubstring("Hello",-2,45));
    }



    // 1. Написать метод, проверяющий являются ли два слова анаграммами.
    // метод возвращает true  если да и false  если нет
    // привет  рпивет   пивет

    public static boolean isAnagram( String str1, String str2){
        if(str1.length() != str2.length())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for( int i=0; i<chars1.length;i++){

            if(chars1[i] != chars2[i])
                return false;
        }
        return true;

    }

    // 2.написать метод, возвращающий  второй и третий символы строки
    //0 1 2 3
    //J a v a
    public static String findSecondThirdLetters ( String string){
        return string.substring(1,3);
    }

    // 3.Написать метод, возвращающий целое число , равное двойной длине строки
    public static int doubleLength ( String string ){
        return 2*string.length();
    }


    // 4.Написать  метод mySubstring, который работает также, как джавовский метод substring
         public static  String mySubstring ( String string, int begin,int end){
            if(begin<0 || begin>end)
                return "Invalid index";

            String res = "";
            for( int i = begin; i<string.length() && i<end; i++)
                res = res + string.charAt(i);
        // метод substring  не использовать !
        return res;
         }

    //  5^2 = 25     6^2 = 36   76^2 = 5776

    //  написать метод, проверяющий является ли число аутоморфным




}
