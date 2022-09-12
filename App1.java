// Напишите функцию для поиска наиболее длинного общего префикса среди массива
// строк.
// Если общего префикса нет, то возвращать пустую строку.
// Пример: ["aabb", "aabbb", "aaabb"] -> Ответ: "aa"

public class App1 {
    public static void main(String[] args) {
        String[] mass = { "aabb", "aabbb", "aaabb" };
        StringBuilder newStr = new StringBuilder(" ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length(); j++) {

                if (mass[0].charAt(j) == mass[i].charAt(j)) {
                    newStr.append(mass[i].charAt(j));
                }
                System.out.println(newStr);
            }

        }

    }
}
