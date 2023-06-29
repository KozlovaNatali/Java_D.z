import java.util.Scanner;
import java.util.logging.*;

public class Task_3 {
    private static final Logger logger = Logger.getLogger(Task_3.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LogManager.getLogManager().reset();
        logger.setLevel(Level.ALL);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("calculator.log");
            fileHandler.setLevel(Level.ALL);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to create log file", e);
        }

        logger.info("Калькулятор запущен");

        System.out.print("Введите 1-е число ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите 2-е число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    logger.warning("Делить на ноль нельзя");
                    System.out.println("Ошибка!");
                    return;
                }
                break;
            default:
                logger.warning("Неверный оператор: " + operator);
                System.out.println("Ошибка!");
                return;
        }

        logger.info(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        logger.info("Калькулятор завершен");
    }
}