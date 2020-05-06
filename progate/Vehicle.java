abstract class Vehicle{

  private String name;
  private String color;

// protected -> クラスとサブクラス内のみアクセス可能
  protected int distance = 0;

// Person型(Main.java内のperson1やperson2と並列の関係)で変数名がowner
  private Person owner;

// クラス名と同名のメソッド → コンストラクタ（インスタンス生成時に自動で呼び出されるメソッド)
  Vehicle(String name, String color){

    this.name = name;
    this.color = color;
  }

  public String getName(){
    return this.name;
  }

  public String getColor(){
    return this.color;
  }

  public int getDistance(){
    return this.distance;
  }
  public Person getOwner(){
    return this.owner;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setOwner(Person person){
    this.owner = person;
  }

  public void printData(){
    System.out.println("名前" + this.name);
    System.out.println("色："+ this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }

  abstract public void run(int distance);

}
