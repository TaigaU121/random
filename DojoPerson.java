class DojoPerson{
  public static void printData(String firstName, String lastName, int age, double height, double weight){
    System.out.println("名前は"+fullName(firstName,lastName)+"です");
    System.out.println("年齢"+age+"歳です");
  }

  public static String fullName(String firstName, String lastName){
  return firstName + lastName;
  }
}
