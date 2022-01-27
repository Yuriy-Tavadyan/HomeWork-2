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

    float Boxer1 = 78.2f;
    float Boxer2 = 82.7f;

    float TotalWeight = Boxer1 + Boxer2;
        System.out.println("Общий вес боксеров = " + TotalWeight);

    double WeightDifference = Boxer2 - Boxer1;
        System.out.println("Разница в весе = " + WeightDifference);


        //Task 3//

    int Bananas = 5;
    int BananaWeight =80;
    int TotalBanansWeight = BananaWeight * Bananas;

    int MilkVolume = 200;
    int MilkWeight = (MilkVolume / 100) * 105;

    int Icecream = 2;
    int IcecreamWeight = 100;
    int TotalIcecreamWeight = IcecreamWeight * Icecream;


    int Eggs = 4;
    int EggWeight = 70;
    int TotalEggsWeight = Eggs * EggWeight;

    //BF - Breakfast//
    int TotalBFWeight = TotalBanansWeight + TotalIcecreamWeight + TotalEggsWeight + MilkWeight;
        System.out.println("Вес такого спорт-завтрака = " + TotalBFWeight + " г.");

    double TotalBFWeightInKg = TotalBFWeight / 1000;
        System.out.println("Вес такого спорт-завтрака в кг = " + TotalBFWeightInKg + " кг.");



        //Task 4//

    double WeightLossAim = 7;
    double SlowWeightLoss = 0.25;
    double FastWeightLoss = 0.5;

    double DaysSlowLoss = WeightLossAim / SlowWeightLoss;
        System.out.println("Кол-во дней для достижения нужного рез-та при потере 250гр. в день = " + DaysSlowLoss);
    double DaysFastLoss = WeightLossAim / FastWeightLoss;
        System.out.println("Кол-во дней для достижения нужного рез-та при потере 500гр. в день =" + DaysFastLoss);
    double DaysMid = (DaysFastLoss + DaysSlowLoss) / 2;
        System.out.println("В среднем потребуется " + DaysMid + " дней, что бы достигнуть нужного веса");



        //Task 5//



    }

    }

