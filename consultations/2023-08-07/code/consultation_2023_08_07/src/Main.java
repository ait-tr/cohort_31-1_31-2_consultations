import java.util.function.*;

public class Main {

    /*BBB aaaa dDd cCccc eEE
    Написать метод, который принимает строку, содержащую слова, раздеоленные пробелом
    и два функциональных интерфейса - function и predicate. Метод должен давать
    возможность осуществления таких действий :
    1. При длине слова 3 все буквы этого меняются на строчные( маленькие) и дальше метод
    возвращает измененную строку.
    2. При длине слова 4 все буквы меняются на заглавные  и измененнуюстроку метод возвращает
    /*BBB AAAA dDd cCccc eEE
    3. При длине слова 5  изменить все буквы слова на звездочки и вернуть измененную
        строку

    1.
     */

    public String transform ( String str, Predicate<String> predicate, Function<String,String> function)
    {

        return null;
    }
    public static void main(String[] args) {
        /*
        написать лямбды, используя эти интерфейсы

        1. соединить числа   num1  и num2
          пример: 1+2 = 12
        */
        Concatable concatable = (num1,num2)-> Integer.toString(num1) + num2;
        System.out.println(concatable.concat(1,2));
        BiFunction<Integer,Integer,String>biFunction = (num1,num2)-> Integer.toString(num1) + num2;
        biFunction.apply(1,2);
        BinaryOperator<String> binaryOperator = String::concat;
        binaryOperator.apply("a","b");

        /*
        2. если длина строки = 4  вернуть true
        */
        Checkable checkable = s -> s.length()==4;
        System.out.println(checkable.check("xyz"));
        System.out.println(checkable.check("xyzy"));
        Predicate<String> predicate = s -> s.length()==4;
        System.out.println(predicate.test("xyz"));
        System.out.println(predicate.test("xyzy"));

     //   3. если длина строки пять символов вернуть 5 звездочек.
        // Иначе вернуть без изменений   строку
        Transformable transformable1 = s->s.length() == 5 ? "*****": s;
        System.out.println(transformable1.modify("qwert"));
        System.out.println(transformable1.modify("wert"));
        UnaryOperator<String> unaryOperator1 = s->s.length() == 5 ? "*****": s;
        unaryOperator1.apply("qwerty");

     //   4. вывести строку на печать в виде !строка!
            Printable printable = s -> System.out.println("!"+s+"!");
            printable.print("Hello");
            Consumer<String> consumer = s -> System.out.println("!"+s+"!");
            consumer.accept("hello");

    //    5.ничего не принимает, возвращает " Hello Java "
        Producable producable = ()-> "Hello Java";
        System.out.println(producable.produce());
        Supplier<String> supplier = ()-> "Hello Java";
        System.out.println(supplier.get());


    //    6. вернуть строку в нижнем регистре
        Transformable transformable = String::toLowerCase;
        System.out.println(transformable.modify("Hello Java"));
        Function<String,String> function = String::toLowerCase;
        function.apply("Hello Java");
        UnaryOperator<String>unaryOperator = String::toLowerCase;
        unaryOperator.apply("Hello Java");




    }
}
