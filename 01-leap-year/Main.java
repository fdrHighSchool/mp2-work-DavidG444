class Main{
  public static void main(String[]args){
    isleapyear(2022);//false
    isleapyear(2024);//false
    isleapyear(1900);//false
    isleapyear(2000);//false
  }//end of main method

  public static void isLeapYear(int year){
    if((year % 4 == 0) && ((year % 100 != )) || (year%400 == 0))){
      System.out.println("This is a leap year");
    }

    else{
      System.ot.println("This is not a leap year");
    }
  }
}
