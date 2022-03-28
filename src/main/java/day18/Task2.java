package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    /**
     Можно вопрос;)
     Сейчас мы используем int, если число больше - long, а если мы в задаче
     не знаем какой величины будет заданное число, но вероятно достаточно большое
     какой тип перемееной тогда использовать??? Integer?
     или такое бывает крайне редко? и обычно достаточно long и int?
    */
    public static int count7(int n) {
        if (n == 0) return 0;
        if (n % 10 == 7)
            return 1 + count7(n / 10);
        else
            return count7(n / 10);
    }
}
