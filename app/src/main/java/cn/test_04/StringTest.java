package cn.test_04;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args){
        String username = "Admin";
        String password = "Admin";
        for(int x=0;x<3;x++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();
            if (name.equalsIgnoreCase(username)&&pwd.equals(password)){
                System.out.println("登陆成功");
                break;
            }else{
                if((2-x)==0){
                    System.out.println("账号被锁定，请与管理员联系");
                }else {
                    System.out.println("登陆失败! 你还有" + (2 - x) + "次机会");
                }
            }
        }
    }
}
