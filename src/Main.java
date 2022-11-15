public class Main {
    public static void main(String[] args) {
        // case 1
        System.out.println("Case 1");

        byte pack1=100;
        short pack2=1000;
        int pack3=-9587;
        long pack4=7856124545L;
        float pack5=1.45f;
        double pack6=10.1456;
        System.out.println("Значение переменной " + "pack1" + " с типом " + "byte " + "равно "+ pack1);
        System.out.println("Значение переменной " + "pack2" + " с типом " + "short " + "равно "+ pack2);
        System.out.println("Значение переменной " + "pack3" + " с типом " + "int " + "равно "+ pack3);
        System.out.println("Значение переменной " + "pack4" + " с типом " + "long " + "равно "+ pack4);
        System.out.println("Значение переменной " + "pack5" + " с типом " + "float " + "равно "+ pack5);
        System.out.println("Значение переменной " + "pack6" + " с типом " + "double " + "равно "+ pack6);

        // case 2
        System.out.println("Case 2");

        byte boxByte=67;
        short boxShort=-159;
        int boxInt=27897;
        long boxLong=987678965549L;
        float boxFloat=27.12f;
        double boxDouble=2.786;
        char boxChar=569;
        boolean boxBoolean=false;

        // case 3
        System.out.println("Case 3");

        int lyudmilaPavlovna = 23;
        int annaSergeevna = 27;
        int catherineAndreyevna = 30;
        int totalSheet = 480;
        int totalStudents = lyudmilaPavlovna+annaSergeevna+catherineAndreyevna;
        int paperForOne= totalSheet/totalStudents;
        System.out.println("На каждого ученика рассчитано "+ paperForOne + " листов бумаги");

        // case 4
        System.out.println("case4");
        int bottle = 16; // изготавливает бутылок
        int time = 2;  //за 2 минуты
        int botteleEfficiency =bottle/time;

        int time1=20; //минуты

        System.out.println("За "+time1+" мин. работы машина произвела "+ botteleEfficiency *time1 +" штук бутылок");

        int time2=24; //часы
        int minutesInDay =time2*60;  //перевод 24 часа в минуты
        int totalBottle2= botteleEfficiency * minutesInDay;
        System.out.println("За "+time2+" часа работы машина произвела "+ totalBottle2 +" штук бутылок");

        int time3=3;  //дни
        int totalBottle3=time3*totalBottle2;
        System.out.println("За "+time3+" дня работы машина произвела "+ totalBottle3 +" штук бутылок");

        byte time4=1; //месяц 30 дней
        int totalBottle4=time4*30*totalBottle2;
        System.out.println("За "+time4+" месяц работы машина произвела "+ totalBottle4 +" штук бутылок");

        //case 5
        System.out.println("case 5");

        int totalCansSchool = 120;
        int classWhiteCans = 2;
        int classBrownCans = 4;
        int totalClass = totalCansSchool/(classBrownCans+classWhiteCans);
        int totalWhiteCans = totalClass*classWhiteCans;
        int totalBrownCans = totalClass*classBrownCans;
        System.out.println("В школе, где "+ totalClass +" классов, нужно " + totalWhiteCans +
                " банок белой краски и "+ totalBrownCans + " банок коричневой краски");

        // case 6
        System.out.println("case 6");

        byte banana=5;              //шт
        short milk=200;              //мл
        byte iceCream=2;            //брикет
        byte eggs=4;                //шт
        byte bananaWeight=80;       // грамм в 1шт
        short milkWeight=105;        // грамм в 100мл
        short iceCreamWeight=100;    // грамм в 1 брикете
        byte eggsWeight=70;         // грамм в 1 яйце
        int totalWeightGram=banana*bananaWeight+milk*milkWeight+iceCream*iceCreamWeight+eggs*eggsWeight;
        System.out.println("Вес спорт-завтрака: "+totalWeightGram+" грамм");
        float totalWeightKg=totalWeightGram/1000f;
        System.out.println("Вес спорт-завтрака: "+totalWeightKg+" кг");

        // case 7
        System.out.println("case7");

        int excessWeight = 7;    // кг
        int decreaseMin = 250;  // гр
        int decreaseMax = 500;  // гр
        int spentDayMin = 7*1000/decreaseMin;
        int spentDayMax = 7*1000/decreaseMax;
        System.out.println("Спортсмену нужно "+spentDayMin+" дней для похудения на "+excessWeight+" кг"+
                " если он будет терять каждый день по "+decreaseMin+" гр");
        System.out.println("Спортсмену нужно "+spentDayMax+" дней для похудения на "+excessWeight+" кг"+
                " если он будет терять каждый день по "+decreaseMax+" гр");
        int spentAverageDay = (spentDayMax+spentDayMin)/2;
        System.out.println("Спортсмену нужно в среднем "+spentAverageDay+" день для похудения на "+excessWeight+" кг");

        // case 8
        System.out.println("case 8");

        int payMasha = 67760;
        int payDenis = 83690;
        int payKristina = 76230;

        double payIncreaseMasha =payMasha+payMasha*0.1;
        double differenceMasha =payIncreaseMasha*12 - payMasha*12;
        System.out.println("Маша теперь получает "+ payIncreaseMasha+ " рублей. " +
                "Годовой доход вырос на "+ differenceMasha+ " рублей");

        double payIncreaseDenis =payDenis+payDenis*0.1;
        double differenceDenis =payIncreaseDenis*12 - payDenis*12;
        System.out.println("Денис теперь получает "+ payIncreaseDenis+ " рублей. " +
                "Годовой доход вырос на "+ differenceDenis + " рублей");

        double payIncreaseKristina =payKristina+payKristina*0.1;
        double differenceKristina =payIncreaseKristina*12 - payKristina*12;
        System.out.println("Кристина теперь получает "+ payIncreaseKristina+ " рублей. " +
                "Годовой доход вырос на "+ differenceKristina + " рублей");
    }
}