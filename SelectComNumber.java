import java.util.Random;

class SelectComNumber {
    private final int NUMBERITEM = 4;
    static int[] randomNum;
    static String ansNum = "";
    
    SelectComNumber() {
        randomNum = new int[NUMBERITEM];
        Random random = new Random();
        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = random.nextInt(9) + 1;
            for (int k = 0; k < i; k++) {
                while (randomNum[i] == randomNum[k]) { //2回以上同じ数字は書き換える
                    randomNum[i] = random.nextInt(9) + 1;
                }
            }
            ansNum = ansNum + randomNum[i];
        }   
    }
}
