import java.util.Scanner;

public class CompareNum {
    private int playerNum = 0;
    private int playerOne = 0;
    private int playerTen = 0;
    private int playerHundred = 0;
    private int playerThousand = 0;
    private int comNum = 0;
    private int comOne = 0;
    private int comTen = 0;
    private int comHundred = 0;
    private int comThousand = 0;
    private int[] playerArray;
    private int[] comArray;

    static boolean isAllHit = false;
    private int hit = 0;
    private int brow = 0;
    private int scanCount = 0;

    Scanner scanner = new Scanner(System.in);

    CompareNum() {
        SelectComNumber selectComNumber = new SelectComNumber();
    }

    void CompareStart() {
        hit = 0;
        brow = 0;
        scanCount += 1;
        //playerの数字を位のみで取得
        PlayerScan.PlayerScanner();
        playerNum = PlayerScan.scanNum;
        playerOne = (playerNum / 1) % 10;
        playerTen = (playerNum / 10) % 10;
        playerHundred = (playerNum / 100) % 10;
        playerThousand = (playerNum / 1000) % 10;

        comNum = Integer.parseInt(SelectComNumber.ansNum);
        //COMの数字を位のみで取得
        comOne = (comNum / 1) % 10;
        comTen = (comNum / 10) % 10;
        comHundred = (comNum / 100) % 10;
        comThousand = (comNum / 1000) % 10;
    
        playerArray = new int[] { playerOne, playerTen, playerHundred, playerThousand };
        comArray = new int[] { comOne, comTen, comHundred, comThousand };

        for (int i = 0; i < playerArray.length; i++) {
            for (int k = 0; k < comArray.length; k++) {
                if (playerArray[i] == comArray[k]) {
                    if (i == k) {
                        hit += 1;
                    } else {
                        brow += 1;
                    }
                    if (hit == playerArray.length) {
                        isAllHit = true;
                    }
                }
            }
        }
        if (isAllHit == true) {
            System.out.format("おめでとう!%d回目で正解!",scanCount);
        } else {
            System.out.println("hit回数:" + hit);
            System.out.println("brow回数:" + brow);
        }
        while (isAllHit == false) {
            System.out.println("4桁の数字をもう一度入力してください");
            CompareStart();
        }
    }



}
