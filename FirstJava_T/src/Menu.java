import java.util.Scanner;

import JDBC.DBConnect;

public class Menu {
   
   static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {
      
      while(true) {
         // 고객 메뉴 ui
         System.out.println("[[ PITCHER GAME ]]");
         System.out.println("새 게임 (S) , 종료 (E) , 랭킹 (R) ");
         System.out.print(">>");
         String menu = sc.next();
         menu =  menu.toLowerCase();
         
         switch(menu.charAt(0)) {
         case 'ㄴ':
         case 's':
            System.out.println("게임을 시작합니다.");
            Event e = new Event(sc);
            break;
         case 'ㄷ':
         case 'e':
            System.out.println("게임이 끝났습니다.");
            sc.close();
            System.exit(0);
         case 'ㄱ':
         case 'r':
        	 DBConnect dao = new DBConnect();
        	 dao.allPlay();
         default:
        	 System.out.println("다시");
        	 break;
         }
         
      }
   }
}