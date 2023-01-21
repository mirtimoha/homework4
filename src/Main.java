public class Main {
    public static void main(String[] args) {
        //first task
        int age = 18;
        if (age < 18) {
            System.out.println("Человек не достиг совершеннолетия, нужно немного подождать");
        }
        if (age >= 18) {
            System.out.println("Человек - совершеннолетний");
        }
        //second task
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //third task
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //fourth task
        int personAge = 6;
        String finalLine = "";
        if (personAge > 2 && personAge < 6) {
            finalLine = "то ему нужно ходить в детский сад.";
        }
        if (personAge > 7 && personAge < 18) {
            finalLine = "то ему нужно ходить в школу.";
        }
        if (personAge > 18 && personAge < 24) {
            finalLine = "то его место в университете.";
        }
        if (personAge > 24) {
            finalLine = "то ему пора ходить на работу.";
        }
        System.out.println("Если возраст человека равен " + personAge + ", " + finalLine);

        //fifth task
        int childAge = 5;
        String finalLine1 = "";
        if (childAge < 5) {
            finalLine1 = "то он не может кататься на аттракционе.";
        }
        if (childAge > 5 && childAge < 14) {
            finalLine1 = "то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.";
        }
        if (childAge > 14) {
            finalLine1 = "то он может кататься без сопровождения взрослого.";
        }
        System.out.println("Если возраст ребенка равен " + childAge + ", " + finalLine1);

        //seventh task
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three)  {
            System.out.println(two);
        } else {
            System.out.println(three);
        }

    }
}