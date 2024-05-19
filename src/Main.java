import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        boolean work = true;
        while (work)
        {
            double value1 = 0;
            double value2 = 0;
            String expression = JOptionPane.showInputDialog(null, "Введите выражение:");
            String[] partsOfTheExpression = expression.split(" ");
            try
            {
                value1 = Double.parseDouble(partsOfTheExpression[0]);
                value2 = Double.parseDouble(partsOfTheExpression[2]);
            }catch (NumberFormatException  e)
            {
                JOptionPane.showMessageDialog(null, "Ошибка ввода!!!");
                work = false;
            }
            if (work)
            {
                switch (partsOfTheExpression[1])
                {
                    case "+":
                        JOptionPane.showMessageDialog(null, "Результат:\n" + value1 + " + " + value2 + " = " + (value1 + value2));
                        break;
                    case "-":
                        JOptionPane.showMessageDialog(null, "Результат:\n" + value1 + " - " + value2 + " = " + (value1 - value2));
                        break;
                    case "*":
                        JOptionPane.showMessageDialog(null, "Результат:\n" + value1 + " * " + value2 + " = " + (value1 * value2));
                        break;
                    case "/":
                        if (value2 != 0)
                            JOptionPane.showMessageDialog(null, "Результат:\n" + value1 + " / " + value2 + " = " + (value1 / value2));
                        else
                            JOptionPane.showMessageDialog(null, "Делить на ноль плохо!!!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Неверный знак операции!!!");
                        break;
                }
            }
        }
    }
}