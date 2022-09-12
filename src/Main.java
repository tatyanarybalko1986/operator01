public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 24;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }
        // Задание 2
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек может ходить в университет");
        }
        if (age >= 24) {
            System.out.println("Человеку пора искать первую работу");
        }
        // Задание 3
        int capacity = 102;
        int seatsCount = 60;
        int standsCount = capacity - seatsCount;
        int seatsUsed = 36;
        int standsUsed = 25;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + "сидячих мест");
        }
        if (standsUsed < standsCount) {
            System.out.println("Есть еще " + (standsCount - standsUsed) + "стоячих мест");
        }

        // Задание 1
        int years = 15;
        if (years >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }
        //Задание 2
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек может ходить в университет");
        } else {
            System.out.println("Человеку пора искать первую работу");
        }

        // Задание 3
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + "сидячих мест");
        } else {
            System.out.println("Есть еще " + (standsCount - standsUsed) + "стоячих мест");
        }

        // Задание 1
        int yearsOld = 6;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        } else if (yearsOld > 6  && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        } else if (yearsOld > 18  && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");

            // Задание 2
            if (yearsOld < 5) {
                System.out.println("ребенок не может кататься на аттракционе");
            } else if (yearsOld < 14) {
                System.out.println("ребенок может кататься на аттракционе со взрослым");
            } else {
                System.out.println("ребенок может кататься на аттракционе");
            }


        }
    }

}

