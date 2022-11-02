public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

//задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

//задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

//задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend =  friend / 7;
        System.out.println(friend);

//задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

//задача 6 и 7
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var allWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров "+ allWeight + " кг");
        var firstDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров  "+ firstDifference + " кг");
        var secondDifference = secondBoxer % firstBoxer;
        System.out.println("Разница в весе боксеров(деление)  "+ secondDifference + " кг");

//Задача 8
        var allTime = 640;
        var workerTime = 8;
        var amountOfWorkers = allTime / workerTime;
        System.out.println("Всего работников в компании - "+ amountOfWorkers + " человек");
        amountOfWorkers = amountOfWorkers + 94;
        allTime = amountOfWorkers * workerTime;
        System.out.println("Если в комапнии работает "+ amountOfWorkers + " человек, то всего "
                + allTime + " часов работы может быть поделено между сотрудниками");
    }
}