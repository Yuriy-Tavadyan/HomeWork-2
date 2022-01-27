public class Main {
    public static void main(String[] args) {

        // Task 1//
    boolean isWeatherGood = true;
    byte a = 126;
    short b = 32766;
    int c = 2147483646;
    long d = 563245678;
    char e = 22;
    float f = 3.14f;
    double g = 7.7777;


        //Task 2//

    float firstBoxer = 78.2f;
    float secondBoxer = 82.7f;

    float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров = " + totalWeight);

    double weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе = " + weightDifference);


        //Task 3//

    int bananas = 5;
    int bananaWeight =80;
    int totalBanansWeight = bananaWeight * bananas;

    int milkVolume = 200;
    int milkWeight = (milkVolume / 100) * 105;

    int icecream = 2;
    int icecreamWeight = 100;
    int totalIcecreamWeight = icecreamWeight * icecream;


    int eggs = 4;
    int eggWeight = 70;
    int totalEggsWeight = eggs * eggWeight;

    //BF - Breakfast//
    int totalBFWeight = totalBanansWeight + totalIcecreamWeight + totalEggsWeight + milkWeight;
        System.out.println("Вес такого спорт-завтрака = " + totalBFWeight + " г.");

    double totalBFWeightInKg = totalBFWeight / 1000;
        System.out.println("Вес такого спорт-завтрака в кг = " + totalBFWeightInKg + " кг.");



        //Task 4//

    double weightLossAim = 7;
    double slowWeightLoss = 0.25;
    double fastWeightLoss = 0.5;

    double daysSlowLoss = weightLossAim / slowWeightLoss;
        System.out.println("Кол-во дней для достижения нужного рез-та при потере 250гр. в день = " + daysSlowLoss);
    double daysFastLoss = weightLossAim / fastWeightLoss;
        System.out.println("Кол-во дней для достижения нужного рез-та при потере 500гр. в день =" + daysFastLoss);
    double daysMid = (daysFastLoss + daysSlowLoss) / 2;
        System.out.println("В среднем потребуется " + daysMid + " дней, что бы достигнуть нужного веса");



        //Task 5//

    int mashaSalary = 67760;
    int denisSalary = 83690;
    int kristinaSalary = 76230;
    float mashaIncreasedSalary = (float) (mashaSalary * 1.1);
    float denisIncreasedSalary = (float) (denisSalary * 1.1);
    float kristinaIncreasedSalary = (float) (kristinaSalary * 1.1);

    int mashaYearIncome = mashaSalary * 12;
    float mashaIncreasedYearIncome = mashaIncreasedSalary * 12;
    float mashaIncomeDifference = mashaIncreasedYearIncome - mashaYearIncome;

    int denisYearIncome = denisSalary * 12;
    float denisIncreasedYearIncome = denisIncreasedSalary * 12;
    float denisIncomeDifference = denisIncreasedYearIncome - denisYearIncome;

    int kristinaYearIncome = kristinaSalary * 12;
    float kristinaIncreasedYearIncome = kristinaIncreasedSalary * 12;
    float kristinaIncomeDifference = kristinaIncreasedYearIncome - kristinaYearIncome;

        System.out.println("Маша теперь получет " + mashaIncreasedSalary + " рублей. Годовой доход вырос на " + mashaIncomeDifference + " рублей.");

        System.out.println("Денис теперь получет " + denisIncreasedSalary + " рублей. Годовой доход вырос на " + denisIncomeDifference + " рублей.");

        System.out.println("Кристина теперь получет " + kristinaIncreasedSalary + " рублей. Годовой доход вырос на " + kristinaIncomeDifference + " рублей.");



    }

    }

