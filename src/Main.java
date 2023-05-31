public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Задача 1");
		task1();
		System.out.println("\nЗадача 2");
		task2();
		System.out.println("\nЗадача 3");
		task3();
		System.out.println("\nЗадача 4");
		task4();
		System.out.println("\nЗадача 5");
		task5();
		System.out.println("\nЗадача 6");
		task6();
		System.out.println("\nЗадача 7");
		task7();
		System.out.println("\nЗадача 8");
		task8();
		System.out.println("\nЗадача 9");
		task9();
		System.out.println("\nЗадача 10");
		task10();
	}

	//Задача 1
	//С помощью цикла for выведите в консоль все числа от 1 до 10.
	public static void task1()
	{
		int start = 1, limit = 10;
		for (int i = start; i <= limit; i++)
		{
			System.out.println(i);
		}
	}

	//Задача 2
	//С помощью цикла for выведите в консоль все числа от 10 до 1.
	public static void task2()
	{
		int start = 10, limit = 1;
		for (int i = start; i >= limit; i--)
		{
			System.out.println(i);
		}
	}

	//Задача 3
	//Выведите в консоль все четные числа от 0 до 17.
	public static void task3()
	{
		int start = 0, limit = 17;
		for (int i = start; i <= limit; i += 2)
		{
			System.out.println(i);
		}
	}

	//Задача 4
	//Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
	public static void task4()
	{
		int start = 10, limit = -10;
		for (int i = start; i >= limit; i--)
		{
			System.out.println(i);
		}
	}

	//Задача 5
	//Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
	public static void task5()
	{
		int start = 1903, limit = 2096;
		int leapYearException = 100, leapYearExceptionOverride = 400;

		while (start % 4 != 0)
		{
			start++;
		}

		for (int i = start; i <= limit; i += 4)
		{
			if (i % leapYearException != 0 || i % leapYearExceptionOverride == 0)
			{
				System.out.println(i + " год - високосный.");
			}
		}
	}

	//Задача 6
	//Напишите программу, которая выводит в консоль последовательность чисел:
	//7 14 21 28 35 42 49 56 63 70 77 84 91 98
	public static void task6()
	{
		int start = 7, limit = 98;
		for (int i = start; i <= limit; i += 7)
		{
			System.out.println(i);
		}
	}

	//Задача 7
	//Напишите программу, которая выводит в консоль последовательность чисел:
	//1 2 4 8 16 32 64 128 256 512
	public static void task7()
	{
		int start = 1, limit = 512;
		for (int i = start; i <= limit; i *= 2)
		{
			System.out.println(i);
		}
	}

	//Задача 8
	//Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
	//Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
	public static void task8()
	{
		int salary = 29000;
		int savings = 0;
		int iterations = 12;
		for (int i = 0; i <= iterations; i++)
		{
			System.out.printf("Месяц %d, сумма еакоплений %d\n", i, savings);
			savings += salary;
		}
	}

	//Задача 9
	//Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под
	// проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
	public static void task9()
	{
		float salary = 29000;
		float savings = 0;
		float monthlyInterest = 1.01f;
		int iterations = 12;
		for (int i = 0; i <= iterations; i++)
		{
			System.out.printf("Месяц %d, сумма еакоплений %.2f\n", i, savings);
			savings *= monthlyInterest;
			savings += salary;
		}
	}

	//Задача 10
	//Напишите программу, которая выводит в консоль таблицу умножения на 2:
	public static void task10()
	{
		int multiplier = 2, limit = 10;
		for (int i = 1; i <= limit; i++)
		{
			System.out.println(i * multiplier);
		}
	}
}