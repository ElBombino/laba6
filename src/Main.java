import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean work = true;
        while (work)
        {
            double value1 = 0;
            double value2 = 0;
            System.out.println("Введите выражение:");
            String expression = in.nextLine();
            String[] partsOfTheExpression = expression.split(" ");
            try
            {
                value1 = Double.parseDouble(partsOfTheExpression[0]);
                value2 = Double.parseDouble(partsOfTheExpression[2]);
            }catch (NumberFormatException  e)
            {
                System.out.println("Ошибка ввода!!!");
                work = false;
            }
            if (work)
            {
                switch (partsOfTheExpression[1])
                {
                    case "+":
                        System.out.println("Результат:\n" + value1 + " + " + value2 + " = " + (value1 + value2));
                        break;
                    case "-":
                        System.out.println("Результат:\n" + value1 + " - " + value2 + " = " + (value1 - value2));
                        break;
                    case "*":
                        System.out.println("Результат:\n" + value1 + " * " + value2 + " = " + (value1 * value2));
                        break;
                    case "/":
                        if (value2 != 0)
                            System.out.println("Результат:\n" + value1 + " / " + value2 + " = " + (value1 / value2));
                        else
                            System.out.println("Делить на ноль плохо!!!");
                        break;
                    default:
                        System.out.println("Неверный знак операции!!!");
                        break;
                }
            }
        }
        in.close();
    }
}