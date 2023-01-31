public class Main {
    public static void main(String[] args) {
        int someKindOfRandomNumber = 168416;
        System.out.println(someKindOfRandomNumber);
        someKindOfRandomNumber = 341;
        System.out.println(someKindOfRandomNumber);
        byte nano = 126;
        short mini = 14654;
        float decimal = 20.86f;
        double betterDecimal = 14.99;
        boolean isNice = true;
        char letter = 's';
        String name = "Naglis";

        int finalNumber = (int) 4.1835;
        System.out.println(finalNumber);

        System.out.println(Math.round(4.16));
        System.out.println(Math.round(4.76));
        System.out.println(Math.floor(4.76));
        System.out.println(Math.ceil(4.16));

        System.out.println (Math.round( Math.random() * 4) );  //0 * 4 =0; 0.99* 4 = 3.96

        int min = 2;
        int max = 4;
        int result = min + (int)(Math.random() * ((max - min) + 1));
//        result = (int) (min + Math.floor(Math.random() * ((max - min)) + 1)); //.0.69
//        result = (int) (min + Math.round(Math.random() * ((max - min)))); //.0.69

        if(true){

        }else{
            if(false){

            }
        }



        if (true){

        } else if (true) {

        }else{

        }

        int num = 12;

        if(num < 5){
            System.out.println("mazai");
        } else if (num >= 5 && num < 10) {
            System.out.println("vidutiniskai");
        }else{
            System.out.println("daug");
        }



        if(num < 5){
            System.out.println("mazai");
        }

        if (num >= 5 && num < 10) {
            System.out.println("vidutiniskai");
        }

        if(num >= 10){
            System.out.println("daug");
        }

        if(true && true){

        }

        if(true || true){

        }

        //darbas su tekstu

        // 4 + 5 = 5;
        int num2 = 50;
        if(num2 == 50){

        }
        if(num2 != 50){

        }

        if(!false){

        }

        int sum = 0;
        sum = sum + 1;// 0 + 1 = 1;
        sum = sum + 1;// 1 + 1 = 2;
        sum++;        // 2 + 1 = 3;
        sum = sum + 3;// 3 + 3 = 6; 100 ir 101 eilutes daro TA PATI
        sum += 3; // 6 + 3 = 9;
        // visa tai veikia taip pat ir su -=, /=, *=;

        System.out.println(4 + " yra grazus skaicius");
        System.out.println(4 + 8 + " yra grazus skaicius");
        System.out.println("dar grazesnis skaicius yra " + 4 + 12 );
        System.out.println("dar  grazesnis skaicius yra " + (4 + 12) );

        System.out.println(50 / 4.0);
        System.out.println((double) 50 / 4);
        System.out.println(50 % 4);
        System.out.println(12 % 5);// 12 - 5 = 7; 7 - 5 = 2;
        System.out.println(6 % 2); // 6 - 2 = 4; 4 - 2 = 2; 2 - 2 = 0;
        if(46 % 2 == 0){
            System.out.println("skaicius yra porinis");
        }

        double dVal = 4.64156;
        System.out.println((double) Math.round(dVal * 100) / 100);
    }

}
/*

git config --global user.email "sarunas.pusinskis@gmail.com"
git config --global user.name "sharas00"
 */