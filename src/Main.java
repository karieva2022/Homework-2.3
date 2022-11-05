public class Main {
    public static void main(String[] args) {

        // Задача 6
        System.out.println("Задача 6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        System.out.println("Общий вес бойцов: " + (firstFighterWeight + secondFighterWeight) + " кг " );
        System.out.println("Разница между весами бойцов: " + (secondFighterWeight - firstFighterWeight) + " кг ");

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница между весами бойцов: " + (secondFighterWeight - firstFighterWeight) + " кг ");
        System.out.println("Разница между весами бойцов: " + (secondFighterWeight % firstFighterWeight) + " кг ");

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours/hoursPerDay;
        System.out.println("Всего работников в компании – " + totalEmployees  + " человек ");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees  + " человек, то всего " + totalWorkingHours  + " часов работы может быть поделено между сотрудниками ");











    }
}