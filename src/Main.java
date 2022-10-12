
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("Задача №1");
        System.out.println("Часть №1");
        System.out.println(" ");
        int[] year = new int[3];
        year[0] = 1;
        year[1] = 2;
        year[2] = 3;
        int oneYear = year[0];
        int twoYear = year[1];
        int freeYear = year[2];
        System.out.println(oneYear + ", " + twoYear + ", " + freeYear);
        System.out.println(" ");
        //OR через Цикл
        for (int i = 0; i < 3; i++) {
            System.out.print(year[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача №1");
        System.out.println("Часть №2");
        System.out.println(" ");
        float[] year = {(float) 1.57, (float) 7.654, (float) 9.986};
        for (float i = 0.0F; i < year.length; i++) {
            System.out.print(year[(int) i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача №1");
        System.out.println("Часть №3");
        System.out.println(" ");
        int[] number = {1, 123, 2, 124, 3, 125, 4, 126, 5, 127, 6, 128, 7, 129, 8, 130, 9, 131, 10, 132, 11, 133, 12, 134, 13, 135, 14, 136, 15, 137, 16, 138, 17, 139, 18, 140, 19, 141, 20, 142, 21, 143, 22, 144, 23, 145, 24, 146, 25, 147, 26, 148, 27, 149, 28, 150, 29, 151, 30, 152, 31, 153, 32, 154, 33, 155, 34, 156};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
        }
        //OR
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача №2");
        System.out.println(" ");
        int[] year = new int[3];
        year[0] = 1;
        year[1] = 2;
        year[2] = 3;
        for (int i = 0; i < year.length; i++) {
            if (i != year.length - 1) {
                System.out.print(year[i] + ", ");
            } else {
                System.out.print(year[i]);
            }
        }
        System.out.println(" ");
        float[] year1 = {(float) 1.57, (float) 7.654, (float) 9.986};
        for (float a = 0.0F; a < year1.length; a++) {
            if (a != year1.length - 1){
                System.out.print(year1[(int) a] + ", ");
            } else {
                System.out.print(year1[(int) a]);
            }
        }
        System.out.println(" ");
        int[] number1 = {1, 123, 2, 124, 3, 125, 4, 126, 5, 127, 6, 128, 7, 129, 8, 130, 9, 131, 10, 132, 11, 133, 12, 134, 13, 135, 14, 136, 15, 137, 16, 138, 17, 139, 18, 140, 19, 141, 20, 142, 21, 143, 22, 144, 23, 145, 24, 146, 25, 147, 26, 148, 27, 149, 28, 150, 29, 151, 30, 152, 31, 153, 32, 154, 33, 155, 34, 156};
        for (int b = 0; b < number1.length; b++) {
            if (b != number1.length-1){
                System.out.print(number1[b] + ", ");
            } else {
                System.out.println(number1[b]);
            }
        }
        System.out.println(" ");
    }
    public static void task5 () {
        System.out.println("Задача №3");
        System.out.println(" ");
        int[] year = new int[3];
        year[0] = 1;
        year[1] = 2;
        year[2] = 3;
        for (int i = year.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(year[i] + ", ");
            } else {
                System.out.print(year[i]);
            }
        }
        System.out.println(" ");
        float[] year1 = {(float) 1.57, (float) 7.654, (float) 9.986};
        for (float a = year1.length-1; a >= 0; a--) {
            if (a != 0){
                System.out.print(year1[(int) a] + ", ");
            } else {
                System.out.print(year1[(int) a]);
            }
        }
        System.out.println(" ");
        int[] number1 = {1, 123, 2, 124, 3, 125, 4, 126, 5, 127, 6, 128, 7, 129, 8, 130, 9, 131, 10, 132, 11, 133, 12, 134, 13, 135, 14, 136, 15, 137, 16, 138, 17, 139, 18, 140, 19, 141, 20, 142, 21, 143, 22, 144, 23, 145, 24, 146, 25, 147, 26, 148, 27, 149, 28, 150, 29, 151, 30, 152, 31, 153, 32, 154, 33, 155, 34, 156};
        for (int b = number1.length -1; b >= 0; b--) {
            if (b != 0){
                System.out.print(number1[b] + ", ");
            } else {
                System.out.println(number1[b]);
            }
        }
        System.out.println(" ");
    }
    public static void task6() {
        System.out.println("Задача №4");
        System.out.println(" ");
        int[] year = new int[3];
        year[0] = 1;
        year[1] = 2;
        year[2] = 3;
        for (int a = 0; a < year.length; a++){
            if (year[a] % 2 != 0){
                year[a] += 1;
            }
            System.out.print(year[a] + " ");
        }
    }
}
