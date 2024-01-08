public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //dog
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        //age
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        //cat
        System.out.println(isPlaying(true, 10));
        System.out.println(isPlaying(false, 36));
        System.out.println(isPlaying(false, 35));

        //area
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp (boolean bark, int hour) {

        if(hour < 0 || hour > 23) {
            return false;
        } else return bark && (hour < 8 || hour > 20);
    }

    public static boolean hasTeen (int... params) {
        for (int param: params) {
            if (param >= 13 && param <= 19) {
                return true;
        }
    }
        return false;
    }

    public static boolean isPlaying (boolean summer, int temp) {
        if (summer) {
            return (temp >= 25 && temp <= 45);
        } else {
            return (temp >= 25 && temp <= 35);
        }
    }

    public static double area (double side1, double side2) {
        if (side1 < 0 || side2 < 0) {
            return -1;
        } else {
            return side1 * side2;
        }
    }

    public static double area (double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}