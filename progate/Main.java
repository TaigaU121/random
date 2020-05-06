// Scannerメソッドを抱えるjava.utilパッケージを呼び出す
import java.util.Scanner;
// 様々な入出力関連のクラスが入っているパッケージ
import java.io.*;


class Main{

  public static void main(String[] args){

// 各クラスの初期化
    Scanner scanner = new Scanner(System.in);
    Person person1 = new Person("Kate","Jones",27,1.6,50.0);
    Person person2 = new Person("John","Christopher", "Smith",65,1.75,80.0);
    Car car = new Car("フェラーリ", "赤");
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");


    person1.buy(car);
    person2.buy(bicycle);

    System.out.println("[車の情報]");
    car.printData();
    System.out.println("--------------------");
    System.out.println("[車の所有者の情報]");
    car.getOwner().printData();

    System.out.println("--------------------");
    System.out.println("[車の走行]");
    System.out.print("走行距離を入力してください（1km/1L）：");
    int inputCarDistance = scanner.nextInt();
    car.run(inputCarDistance);

    System.out.println("--------------------");
    System.out.println("[車の給油]");
    System.out.print("給油量を入力してください：");
    int inputChargeFuel = scanner.nextInt();
    car.charge(inputChargeFuel);


    System.out.println("====================");
    System.out.println("[自転車の情報]");
    bicycle.printData();
    System.out.println("--------------------");
    bicycle.getOwner().printData();

    System.out.println("--------------------");
    System.out.println("[自転車の走行]");
    System.out.print("走行距離を入力してください：");
    int inputBicycleDistance = scanner.nextInt();
    bicycle.run(inputBicycleDistance);
  }
}
