package geekbrains.homeWork_Java1;

/*
Java. Level 1. Home work 1.

@author Sergey Bondarenko
@version dated Jan 15, 2019
 */

public class HomeWork_1 {

    // Задание 1. Метод main()
    public static void main ( String[] args )
    {
        // Задание 2. Объявление переменных
        printHeader("Задание 2. ОБЪЯВЛЕНИЕ ПЕРЕМЕННЫХ") ;
        variables();

        // Задание 3. Расчет выражения
        printHeader("Задание 3. РАСЧЕТ ВЫРАЖЕНИЯ") ;
        String message = "\n\tФормула: a * (b + (c / d))" + "\n";
        message += "\n\tРасчет:  5 * (3 + (4 / 2)) = " + expression( 5, 3, 4, 2 ) + "\n";

        System.out.print(message);

        // Задание 4. Проверка суммы чисел
        printHeader("Задание 4. ПРОВЕРКА СУММЫ ЧИСЕЛ") ;
        System.out.println("\n\tСумма чисел 2 и  3 лежит в пределах от 10 до 20(включительно): " + sumInRange( 2,3 ) );
        System.out.println("\n\tСумма чисел 9 и  8 лежит в пределах от 10 до 20(включительно): " + sumInRange( 9,8 ) ) ;
        System.out.println("\n\tСумма чисел 9 и 12 лежит в пределах от 10 до 20(включительно): " + sumInRange( 9,12 ) );

        // Задание 5. Проверка числа. Возврат строки
        printHeader("Задание 5. ПРОВЕРКА ЧИСЛА. ВОЗВРАТ СТРОКИ") ;
        System.out.println("\n\tЧисло -13: " + checkString(-13) ) ;
        System.out.println("\n\tЧисло   0: " + checkString(0) ) ;
        System.out.println("\n\tЧисло  15: " + checkString(15) ) ;

        // Задание 6. Проверка числа. Возврат boolean
        printHeader("Задание 6. ПРОВЕРКА ЧИСЛА. ВОЗВРАТ boolean") ;
        System.out.println("\n\tЧисло -10 - отрицательное: " + checkBoolean(-10) ) ;
        System.out.println("\n\tЧисло   0 - отрицательное: " + checkBoolean(0) ) ;
        System.out.println("\n\tЧисло 125 - отрицательное: " + checkBoolean(125) ) ;

        // Задание 7. Приветствие по имени
        printHeader("Задание 7. ПРИВЕТСТВИЕ ПО ИМЕНИ") ;
        sayHello( "Иван" ) ;

        // Задание 8. Определение високосного года
        printHeader("Задание 8. ОПРЕДЕЛЕНИЕ ВИСОКОСНОГО ГОДА") ;
        leapYear( 2000 ) ; // високосный
        leapYear( 2012 ) ; // високосный
        leapYear( 2013 ) ; // невисокосный
        leapYear( 2100 ) ; // невисокосный

    }

    // Задание 2. Объявление переменных
    public static void variables ( )
    {
        byte a = 1;
        short b = 12;
        int c = 123;
        long d = 1234;
        float e = 12345.123f;
        double f = 12345.12345;
        boolean g = true;
        char h = '%';
        String i = "Java";

        String message = "\n\tТип переменной\tИмя\tЗначение\n";
        message += "\n\t--------------\t---\t--------\n";
        message += "\tbyte\t\ta\t" + a;
        message += "\n\tshort\t\tb\t" + b;
        message += "\n\tint\t\tc\t" + c;
        message += "\n\tlong\t\td\t" + d;
        message += "\n\tfloat\t\te\t" + e;
        message += "\n\tdouble\t\tf\t" + f;
        message += "\n\tboolean\t\tg\t" + g;
        message += "\n\tchar\t\th\t" + h;
        message += "\n\tString\t\ti\t" + i;
        message += "\n\t--------------\t---\t--------\n";

        System.out.print(message);
    }

    // Задание 3. Расчет выражения
    public static int expression ( int a , int b , int c , int d )
    {
        return a * (b + ( c / d ) );
    }

    // Задание 4. Проверка суммы чисел
    public static boolean sumInRange ( int a , int b )
    {
        return ((a + b) >= 10 && (a + b) <= 20 );
    }

    // Задание 5. Проверка числа. Возврат строки
    public static String checkString ( int num )
    {
        return (num < 0) ? "отрицательное": "положительное";
    }

    // Задание 6. Проверка числа. Возврат boolean
    public static boolean checkBoolean ( int num )
    {
        return num < 0;
    }

    // Задание 7. Приветствие по имени
    public static void sayHello ( String name )
    {
        System.out.println("\n\tПривет, " + name + "!");
    }

    // Задание 8. Определение високосного года
    public static void leapYear ( int year )
    {
        // Вариант 1. Подробная расшифровка определения високосного года
		/* 	String result;
		if (year % 400 == 0) result = "високосный: относится к 400-м";
		else if	(year % 100 == 0) result = "невисокосный: относится к 100-м";
		else if	(year % 4 == 0) result = "високосный";
		else result = "невисокосный"; */

        // Вариант 2. Без дополнительного описания
        String result = ((year % 400 == 0) || ((year % 4 == 0)&&(year % 100 != 0)))? "високосный": "невисокосный";
        System.out.println("\n\t" + year + " г. - " + result);
    }

    // Вывод заголовка для задания
    public static void printHeader ( String header)
    {
        System.out.println("\n\t************************************* \n\t" + header + "\n");
    }
}
