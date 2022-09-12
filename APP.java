// Задан массив, например, nums = [1.7.3.6.5.6].
// Написать программу, которая найдет индекс i для этого массива такой, что
// сумма элементов с индексами < i равна сумме элементов с индексами > i.

public final class APP {
    public static void main(String[] args) {
        int[] mas = { 1, 7, 3, 6, 5, 6 };
        int summ = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mas.length; i++) {
            summ += mas[i] / 2;
            for (int k = 0; k < mas.length; k++) {
                for (int m = mas.length - 1; m > 0; m--) {
                    while (sum1 < summ || sum2 < summ) {
                        sum1 += mas[k];
                        sum2 += mas[m];
                        if (sum1 == sum2) {
                            if (k + 1 == m - 1) {
                                System.out.println("Элемент массива найдет и равен {k+1}");
                            }
                        }
                    }
                }
            }
        }
    }
}
