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



    }
}