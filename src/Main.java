public class Main {
    public static void main(String[] args)
    {
        long boxLong = 987678965549l;
        short boxShort = 786;
        short boxShort2 = 569;
        byte boxByte = 2;
        byte boxByte2 = 67;
        float x = 27.12f;
        short boxShort3 = -159;
        short boxShort4 = 27897;
        boolean n = false;

        byte ludPav = 23;
        byte annSer = 27;
        byte ekaAnd = 30;
        short sheetAll= 480;
        int sheetStudent = 480 / (ludPav + annSer + ekaAnd);
        System.out.println(" На каждого ученика рассчитано " + sheetStudent + " листов бумаги ");

        byte mashine2Minute = 16;
        int mamashine20Minute = mashine2Minute / 2 * 20;
        System.out.println("За 20 минут машин произвела бутылок " + mamashine20Minute + " штук ");
        int mamashineDayMinute = mashine2Minute / 2 * 60 * 24;
        System.out.println("За сутки машина произвела бутылок " + mamashineDayMinute + " штук ");
        int mamashine3DaysMinute = mamashineDayMinute * 3;
        System.out.println("За 3 дня машина произвела бутылок " + mamashine3DaysMinute + " штук ");
        int mamashineMount = mamashineDayMinute * 30;
        System.out.println("За месяц машина произвела бутылок " + mamashineMount + " штук ");

        byte potAll = 120;
        byte colorWhite = 2;
        byte colorBrown = 4;
        int classAll = potAll / (colorWhite + colorBrown);
        int potWhite = colorWhite * classAll;
        int potBrown = colorBrown * classAll;
        System.out.println("В школе, где " + classAll + " классов, нужно " + potWhite + " банок белой краски и " + potBrown + " банок коричневой краски");

        byte banan = 5;
        byte weightBananOne = 80;
        float milk = 0.2f;
        byte weightMilk100ml = 105;
        byte egg = 4;
        byte weightEggOne = 70;
        float weightMixture = (banan * weightBananOne + milk * 10 *105 + egg * weightEggOne) / 1000;
        System.out.println("Весь смеси " + weightMixture + " кг.");

        byte excessWeight = 7;
        float weight250Day = 0.25f;
        float weight500Day = 0.5f;
        float day250Gramm = excessWeight / weight250Day;
        System.out.println(day250Gramm + " дней понадобится при похудении на 250 грамм в день ");
        float day500gramm = excessWeight / weight500Day;
        System.out.println(day500gramm + " дней понадобится при похудении на 500 грамм в день ");
        float dayMiddle = ( day250Gramm + day500gramm )/ 2;
        System.out.println(dayMiddle + " дней понадобится в среднем при похудении на 250-500 грамм в день ");

        int maria = 67760;
        int denis = 83690;
        int kristina = 76230;
        float maria10Up = maria * 1.1f;
        float denis10Up = denis * 1.1f;
        float kriatina10Up = kristina * 1.1f;
        System.out.println("Зарплата Мария после повышения на 10% " + maria10Up + " руб");
        System.out.println("Зарплата Дениса после повышения на 10% " + denis10Up + " руб");
        System.out.println("Зарплата Кристины после повышения на 10% " + kriatina10Up + " руб");
        float mariaDifferance = maria10Up * 12 - maria * 12;
        System.out.println("Мария теперь получает " + maria10Up + " рублей. Годовой доход вырос на " + mariaDifferance + " рублей");
        float denisDifferance = denis10Up * 12 - denis * 12;
        System.out.println("Денис теперь получает " + denis10Up + " рублей. Годовой доход вырос на " + denisDifferance + " рублей");
        float kristinaDifferance = kriatina10Up *12 - kristina * 12;
        System.out.println("Кртстина теперь получает " + kriatina10Up + " рублей. Годовой доход вырос на " + kristinaDifferance + " рублей");









    }
}