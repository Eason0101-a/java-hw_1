import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.println("=== 數學模型模擬器（簡化版）===");
                System.out.println("1. 線性模型：dx/dt = -k*x");
                System.out.println("2. 非線性模型：dx/dt = r*x*(1 - x/K)");

                System.out.print("請選擇模型（1 或 2）：");
                int model = scanner.nextInt();

                System.out.print("請輸入初始值 x(0)：");
                double x = scanner.nextDouble();

                System.out.print("請輸入時間步長 dt：");
                double dt = scanner.nextDouble();

                System.out.print("請輸入迴圈次數 steps：");
                int steps = scanner.nextInt();

                double a;
                double b = 0;

                if (model == 1) {
                    System.out.print("請輸入 k：");
                    a = scanner.nextDouble();
                } else {
                    System.out.print("請輸入 r：");
                    a = scanner.nextDouble();
                    System.out.print("請輸入 K：");
                    b = scanner.nextDouble();
                }

                System.out.println("\nstep\ttime\tx");
                System.out.println("------------------------");

                // 用 for 迴圈進行 Euler 數值更新。
                for (int i = 0; i <= steps; i++) {
                    double time = i * dt;
                    System.out.printf("%d\t%.2f\t%.6f%n", i, time, x);

                    if (i == steps) {
                        break;
                    }

                    double dxdt;
                    if (model == 1) {
                        dxdt = -a * x;
                    } else {
                        dxdt = a * x * (1 - x / b);
                    }

                    x = x + dt * dxdt;
                }

                System.out.printf("\n最終結果 x = %.6f%n", x);
            } catch (InputMismatchException e) {
                System.out.println("輸入格式錯誤，請重新執行並輸入數字。");
            }
        }
    }
}
