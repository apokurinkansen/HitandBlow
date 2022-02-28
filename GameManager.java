
class GameManager {

    //TODO コンピュータが数字を選ぶ clear
    //TODO 数字入力してもらう clear
    //TODO コンピュータの数字と、入力した数字を見比べる clear 

    //TODO comの配列、playerの配列をつくる。 clear
    //どのくらい合っているか結果報告 clear
    //もう一度、数字入力してもらう

    public static void main(String[] args) {

        System.out.println("ようこそ!!!ヒットアンドブローへ。");
        System.out.println("コンピュータ(COM)が選んだ数字を当ててね。");
        System.out.println("4桁の数字を入力してね:");
        CompareNum compareNum = new CompareNum();

        compareNum.CompareStart();
    }
    
}