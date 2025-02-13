package org.example;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(in);
    //Условные операторы:
    compareNumber(scanner);
    compareTwoNumbers(scanner);
    determineTriangleType(scanner);
    countPositiveAndNegativeNumbers(scanner);
    findMaxOfThreeNumbers(scanner);
    sumMaxAndMinOfThreeNumbers(scanner);
    checkEvenOrOdd(scanner);
    shopMenu(scanner);
    //Циклы:
    multiplyOnFourTable();
    showNumbersDivision(scanner);
    showFibanachiNumbers(scanner);
    showFact(scanner);
    showLineBySymbol(scanner);
    scanner.close();
    //Массивы:
    int[] arr = {1, -2, 3, -4, 5, -6, 7};
    int[][] matrix = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
        {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
        {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
        {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
        {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
        {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
    };
    countPositivesAndNegatives(arr);
    sumElementsAtEvenIndices(arr);
    sumEvenElements(arr);
    findLargestElement(arr);
    findMostFrequentElement(arr);
    printMainDiagonal(matrix);
    printAntiDiagonal(matrix);
    sumColumnsAndFindMax(matrix);
  }

  //Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
  //“Число больше десяти”, если меньше – “Число меньше десяти”
  private static void compareNumber(Scanner scanner) {
    out.print("Введите число: ");
    int number = scanner.nextInt();

    if (number > 10) {
      out.println("Число больше десяти");
    } else if (number < 10) {
      out.println("Число меньше десяти");
    } else {
      out.println("Число равно десяти");
    }
  }

  //Пользователь вводит в консоли два числа, выводим сообщение “первое число
  //больше/меньше, чем второе” в зависимости от результата их сравнения
  private static void compareTwoNumbers(Scanner scanner) {
    out.print("Введите первое число: ");
    int firstNumber = scanner.nextInt();
    out.print("Введите второе число: ");
    int secondNumber = scanner.nextInt();
    if (firstNumber > secondNumber) {
      out.println("Первое число больше, чем второе");
    } else if (firstNumber < secondNumber) {
      out.println("Первое число меньше, чем второе");
    } else {
      out.println("Числа равны");
    }
  }

  //Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
  //сообщение, является ли треугольник равнобедренным, равносторонним или
  //разносторонним.
  private static void determineTriangleType(Scanner scanner) {
    out.print("Введите три стороны треугольника: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a == b && b == c) {
      out.println("Треугольник равносторонний");
    } else if (a == b || b == c || a == c) {
      out.println("Треугольник равнобедренный");
    } else {
      out.println("Треугольник разносторонний");
    }
  }

  //Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
  //количество отрицательных и положительных чисел
  private static void countPositiveAndNegativeNumbers(Scanner scanner) {
    out.print("Введите четыре числа: ");
    int positiveCount = 0;
    int negativeCount = 0;
    for (int i = 0; i < 4; i++) {
      int num = scanner.nextInt();
      if (num > 0) {
        positiveCount++;
      } else if (num < 0) {
        negativeCount++;
      }
    }
    out.printf("Положительных чисел: %d, Отрицательных чисел: %d%n", positiveCount, negativeCount);
  }

  //Пользователь вводит в консоли три числа, выводим самое большое из них.
  private static void findMaxOfThreeNumbers(Scanner scanner) {
    out.print("Введите три числа: ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    out.println("Наибольшее число: " + Math.max(x, Math.max(y, z)));
  }

  //Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
  //наибольшего и наименьшего из них
  private static void sumMaxAndMinOfThreeNumbers(Scanner scanner) {
    out.print("Введите три числа: ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    int max = Math.max(x, Math.max(y, z));
    int min = Math.min(x, Math.min(y, z));
    out.println("Сумма наибольшего и наименьшего: " + (max + min));
  }

  //Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
  //нечетное
  private static void checkEvenOrOdd(Scanner scanner) {
    out.print("Введите число: ");
    int num = scanner.nextInt();
    out.println(num % 2 == 0 ? "Число четное" : "Число нечетное");
  }

  //Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
  //товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
  //хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
  //[сумма сдачи]”
  private static void shopMenu(Scanner scanner) {
    out.println("Меню магазина:");
    out.println("1. Товар A - 100$");
    out.println("2. Товар B - 200$");
    out.println("3. Товар C - 300$");
    out.print("Выберите товар (1-3): ");
    int choice = scanner.nextInt();
    int price = switch (choice) {
      case 1 -> 100;
      case 2 -> 200;
      case 3 -> 300;
      default -> {
        out.println("Некорректный выбор");
        yield -1;
      }
    };
    if (price == -1) {
      return;
    }
    out.print("Введите сумму денег: ");
    int money = scanner.nextInt();
    if (money < price) {
      out.println("Денег не хватает!");
    } else if (money == price) {
      out.println("Спасибо за покупку!");
    } else {
      out.println("Ваша сдача: " + (money - price) + "$.");
    }
  }

  //Вывести в консоль таблицу умножения на 4
  private static void multiplyOnFourTable() {
    int number = 4;
    for (int i = 1; i <= 10; i++) {
      out.printf("%d x %d = %d%n", number, i, (number * i));
    }
  }

  //Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х
  private static void showNumbersDivision(Scanner scanner) {
    out.print("Введите число x: ");
    int x = scanner.nextInt();

    for (int i = 0; i <= x; i += 2) {
      out.print(i + " ");
    }
    out.println();
  }

  //Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с
  //индексом х
  private static void showFibanachiNumbers(Scanner scanner) {
    out.print("Введите индекс x: ");
    int x = scanner.nextInt();
    if (x < 0) {
      out.println("Индекс не может быть отрицательным.");
    } else {
      long a = 0;
      long b = 1;
      long fib = 0;

      if (x == 1) {
        fib = b;
      } else {
        for (int i = 2; i <= x; i++) {
          fib = a + b;
          a = b;
          b = fib;
        }
      }
      out.printf("Число Фибоначчи с индексом %d = %d%n", x, fib);
    }
  }

  //Пользователь вводит число. Выводим в консоль факториал этого числа
  private static void showFact(Scanner scanner) {
    out.print("Введите число: ");
    int num = scanner.nextInt();

    if (num < 0) {
      out.println("Факториал определён только для неотрицательных чисел.");
    } else {
      long result = 1;
      for (int i = 2; i <= num; i++) {
        result *= i;
      }
      out.printf("Факториал числа %d = %d%n", num, result);
    }
  }

  //Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка –
  //один символ)
  private static void showLineBySymbol(Scanner scanner) {
    out.print("Введите строку: ");
    final var input = scanner.nextLine();

    for (int i = 0; i < input.length(); i++) {
      out.println(input.charAt(i));
    }
  }

  // 1. Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем
  // Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем
  private static void countPositivesAndNegatives(int[] arr) {
    int positiveCount = 0;
    int negativeCount = 0;

    for (int num : arr) {
      if (num > 0) {
        positiveCount++;
      } else if (num < 0) {
        negativeCount++;
      }
    }

    out.println("Положительных чисел: " + positiveCount);
    out.println("Отрицательных чисел: " + negativeCount);
  }

  // 2. Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
  // Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами
  private static void sumElementsAtEvenIndices(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i += 2) {
      sum += arr[i];
    }

    out.println("Сумма элементов с чётными индексами: " + sum);
  }

  // 3. Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные значения)
  // Дан массив с целыми числами. Вывести в консоль сумму четных элементов (четные значения)
  private static void sumEvenElements(int[] arr) {
    int sum = 0;

    for (int num : arr) {
      if (num % 2 == 0) {
        sum += num;
      }
    }

    out.println("Сумма чётных элементов: " + sum);
  }

  // 4. Дан массив с целыми числами. Вывести в консоль наибольшее из них
  // Дан массив с целыми числами. Вывести в консоль наибольшее из них
  private static void findLargestElement(int[] arr) {
    int largest = arr[0];

    for (int num : arr) {
      if (num > largest) {
        largest = num;
      }
    }

    out.println("Наибольшее число в массиве: " + largest);
  }

  // 5. Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся.
  // Если таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.
  private static void findMostFrequentElement(int[] arr) {
    final var frequencyMap = new HashMap<Integer, Integer>();
    for (int num : arr) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    int mostFrequent = arr[0];
    int maxFrequency = 0;

    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue() > maxFrequency || (entry.getValue() == maxFrequency && entry.getKey() > mostFrequent)) {
        mostFrequent = entry.getKey();
        maxFrequency = entry.getValue();
      }
    }

    if (maxFrequency > 1) {
      out.println("Наиболее часто встречающееся число: " + mostFrequent);
    } else {
      out.println("Повторяющихся чисел нет.");
    }
  }

  // 6. Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][0] до [10][10]
  // Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][0] до [10][10]
  private static void printMainDiagonal(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      out.println(matrix[i][i]);
    }
  }

  // 7. Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][10] до [10][0]
  // Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][10] до [10][0]
  private static void printAntiDiagonal(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      out.println(matrix[i][matrix.length - 1 - i]);
    }
  }

  // 8. Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и вывести наибольшую из них
  // Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и вывести наибольшую из них
  private static void sumColumnsAndFindMax(int[][] matrix) {
    int maxSum = Integer.MIN_VALUE;

    for (int j = 0; j < matrix[0].length; j++) {
      int columnSum = 0;
      for (int[] ints : matrix) {
        columnSum += ints[j];
      }
      maxSum = Math.max(maxSum, columnSum);
    }

    out.println("Наибольшая сумма чисел в столбце: " + maxSum);
  }
}