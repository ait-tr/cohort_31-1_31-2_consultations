public class Main {

    // 1. Написать метод, принимающий двумерный массив и возвращающий количество подмассивов,
    //  в которых нет отрицательных элементов.

    public static int numberOfPositiveSubarrays( int[][] arr){
        int counter = 0;

        for ( int i = 0; i < arr.length;i++){

            boolean flag = true;
            for ( int j = 0;j < arr[i].length;j++){
                if( arr[i][j]<0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                counter++;

        }
        return counter;
    }


    public static int sameWithMetka( int[][] arr){
        int counter = 0;

        outerFor:
        for( int i = 0; i < arr.length; i++ ){

            for( int j = 0;j<arr[i].length; j++){
                if(arr[i][j]<0)continue outerFor;
            }
            counter++;

        }

        return counter;
    }
    public static void main(String[] args) {
        int[][] table = {{1,2,3},{-45,4,6},{3,7,3}  };// -> 2

        int[][] ints =new int[3][];
        ints[0]= new int[3];
        ints[1]= new int[3];
        ints[2]= new int[2];

        System.out.println(numberOfPositiveSubarrays(table));
        System.out.println(sameWithMetka(table));







        // 2. Написать метод,  принимающий строку, состояшую из букв и цифр такого вида 4a2b3cd а
        // возвращающий ее в таком виде -> aaaabbcccd
       // Character.isDigit()
        // Integer.parseInt("45")

    }
}
