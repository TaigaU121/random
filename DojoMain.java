import java.util.Scanner;

//javaのファイル名とmainメソッドが入ってるクラス名の名前を同じにする！

class DojoMain {
  public static void main(String[] args){
  //new Scanner(System.in)の部分でScannerの初期化を行っている
    Scanner scanner = new Scanner(System.in);
   
   System.out.print("名前：");
   String firstName = scanner.next();
   
   System.out.print("名字：");
   String lastName = scanner.next();

   System.out.print("年齢：");
   int age = scanner.nextInt();

   System.out.print("身長：");
   double height = scanner.nextDouble();

   System.out.print("体重：");
   double weight = scanner.nextDouble();

   //別ファイルで記述したメソッドに託す．託す際は仮の引数を入れるので型の宣言も不要
   DojoPerson.printData(firstName,lastName,age,height,weight);


  }
}
