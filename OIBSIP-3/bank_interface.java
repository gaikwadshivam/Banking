import java.util.Scanner;
import java.io.StreamTokenizer;
import java.net.SocketTimeoutException;
import java.util.Random;

class register {
  public String name;
  public String name1;
  public int account_num;
  public int account_num2;
  public int password;
  public int password2;

  public void register_details() {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the your name ");
    name = sc.nextLine();
    System.out.println("create your account number ");
    account_num = sc.nextInt();
    System.out.println("genrate  your password ");
    password = sc.nextInt();
    System.out.println(" details registerd successfully .");
    System.out.println("now you can logged in  your account:");
  }

  public void logging_in() {
    System.out.println("************** log in ********************");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the name");
    name1 = sc.nextLine();
    System.out.println("enter the account number");
    account_num2 = sc.nextInt();
    System.out.println("enter the password");
    password2 = sc.nextInt();
    System.out.println("************** log in successful ********************");
  }
};

class logged_in extends register {
  public int ans;
  
  public int logging() {
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    int balance = ran.nextInt(10000, 20000);
    if (name1.equals(name) && account_num2 == account_num && password2 == password) {
      System.out.println("successfully loged in " + name + "'s account ");
      System.out.println("press 1 : to check balance");
      System.out.println("press 2 : to deposite money");
      System.out.println("press 3 : to withdraw money");
      System.out.println("press 4 : to send money");
      System.out.println("press 5 : to exit");
      ans = sc.nextInt();
      switch (ans) {
        case 1:
          System.out.println("the current balnce is : " + balance);
          System.out.println("*************************************************************************************");
          break;

        case 2:
          System.out.println("the current balnce is : " + balance);
          System.out.println("enter the amount to deposite money");
          int amount = sc.nextInt();
          System.out.println(+amount + " successfully deposited in your account .");
          System.out.println("now current account balance is : " + balance + " " + amount + "= " + balance + amount);
          System.out.println("***********************************************************************************");
          break;

        case 3:
          System.out.println("the current balnce is : " + balance);
          System.out.println("enter the amount to withdraw money");
          int withdrawl_money = sc.nextInt();
          if (withdrawl_money <= balance) {
            System.out.println(+withdrawl_money + " successfully withdraw from your account .");
            int remaining = balance - withdrawl_money;
            System.out
                .println("now current account balance is : " + balance + " - " + withdrawl_money + "= " + remaining);
            System.out
                .println("******************************************************************************************");
          } else {
            System.out.println("sorry . you entred amount is more than account balnce : " + balance);
            System.out.println("***********************************************************************************");
          }
          break;

        case 4:
          System.out.println("the current balnce is : " + balance);
          System.out.println("enter the name of reciver");
          Scanner sca = new Scanner(System.in);
          String reciver = sca.nextLine();
          System.out.println("enter the amount to send money");
          int send_money = sc.nextInt();
          if (send_money <= balance) {
            System.out.println(+send_money + " successfully send from your account to " + reciver);
            int remaining_balance = balance - send_money;
            System.out
                .println("now current account balance is : " + balance + " - " + send_money + "= " + remaining_balance);
            System.out.println("************************************************************************************");
          } else {
            System.out.println("please enter the valid amount");
            System.out.println("***********************************************************************************");
          }
          break;

        case 5:
          System.out.println("thanks to vist our Bank");
          System.out.println("*********************************************************************************");
          System.exit(0);
          break;
          
          default:
          System.out.println("please enter the valid choice");
          
        }
      } else {
        System.out.println(
          "sorry , something went Wrong . please check name ,account num and password as per you registerd details .");
        }
        
        return ans;
      }
    }

class existed_Account {
  public int account_num = 12345678;
  String name = "xyz";
  public int password = 123456;
  public int account_num2;
  public int password2;
  public int balance;
  public String name1;
  public int answer;
  
  
  
  public void existing() {
    Scanner sc = new Scanner(System.in);
    System.out.println("this is existing account ");
    
    System.out.println("enter the name");
    name1 = sc.nextLine();
    System.out.println("enter the account number");
    account_num2 = sc.nextInt();
    System.out.println("enter the password");
    password2 = sc.nextInt();
    Random ran = new Random();
    balance = ran.nextInt(10000, 20000);
  }

  public int choices() {
    Scanner sc = new Scanner(System.in);

    if (name1.equals(name) && account_num2 == account_num && password2 == password) {
      System.out.println("successfully loged into existing account ");
      System.out.println("press 1 : to check balance");
      System.out.println("press 2 : to deposite money");
      System.out.println("press 3 : to withdraw money");
      System.out.println("press 4 : to send money");
      System.out.println("press 5 : to exit");
      answer = sc.nextInt();

      switch (answer) {
        case 1:
          System.out.println("the current balnce is : " + balance);
          break;

        case 2:
          System.out.println("the current balnce is : " + balance);
          System.out.println("enter the amount to deposite money");
          int amount = sc.nextInt();
          System.out.println(+amount + " successfully deposited in your account .");
          System.out.println("now current account balance is : " + balance + "-" + amount + "= " + balance + amount);
          break;

        case 3:
          System.out.println("the current balnce is : " + balance);
          System.out.println("enter the amount to withdraw money");
          int withdrawl_money = sc.nextInt();
          if (withdrawl_money <= balance) {
            System.out.println(+withdrawl_money + " successfully withdraw from your account .");
            int remaining = balance - withdrawl_money;
            System.out
                .println("now current account balance is : " + balance + "-" + withdrawl_money + "= " + remaining);
          } else {
            System.out.println("sorry . you entred amount is more than account balnce : " + balance);
          }
          break;

        case 4:
          System.out.println("the current balnce is : " + balance);
          System.out.println("enter the name of reciver");
          Scanner sca = new Scanner(System.in);
          String reciver = sca.nextLine();
          System.out.println("enter the amount to send money");
          int send_money = sc.nextInt();
          if (send_money <= balance) {
            System.out.println(+send_money + " successfully send from your account to " + reciver);
            int remaining_balance = balance - send_money;
            System.out
                .println("now current account balance is : " + balance + " - " + send_money + "= " + remaining_balance);
          } else {
            System.out.println("please enter the valid amount");
          }
          break;

        case 5:
          System.out.println("thanks to vist our Bank");
          System.exit(0);
          break;

        default:
          System.out.println("please enter the valid choice");

      }
    } else {
      System.out.println("sorry , something went Wrong . please check name ,account num and password as per tip .");
    }
    return answer;
  }
};

class bank_interface {
  public static void main(String ar[]) {

    System.out.println(
        "tip :- there is only one existing account .account no :-12345678, user name:- xyz ,password:-123456 ");

    System.out.println("******************** welcome to HDFC Bank *******************");
    System.out.println("press 1 to logged in existing account");
    System.out.println("press 2 to register");
    System.out.println("press 3 to exit");
    Scanner sc = new Scanner(System.in);
    int ans = sc.nextInt();

    switch (ans) {
      case 1:
        // alredy existing account
        existed_Account obj = new existed_Account();
        obj.existing();
        obj.choices();
        int ans3 = obj.choices();
        while (ans3 != 5) {
          
          obj.choices();
          
          if (ans3 == 5) {
            obj.choices();
            System.out.println("******************************** thank you **************************");
            System.exit(0);

          }
        }

        break;
      case 2:
        logged_in obj1 = new logged_in();
        obj1.register_details();
        obj1.logging_in();
        obj1.logging();
        int ans2 = obj1.logging();
        while (ans2 != 5) {
          obj1.logging();
          if (ans == 5) {
            System.out.println("******************************** thank you **************************");
            System.exit(0);
          }
        }
      case 3:
        System.exit(0);
        break;
    }

  }
};