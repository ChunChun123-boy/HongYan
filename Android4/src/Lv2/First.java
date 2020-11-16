package Lv2;

import java.util.Random;
import java.util.Scanner;

public class First  implements Things {
    Random r = new Random();
    Scanner scanner = new Scanner(System.in);

    public void THING() {
        String name;
        int age ,money=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        name = sc.next();
        System.out.print("请输入你的年龄：");
        age = sc.nextInt();
        System.out.println("你的信息为：");
        System.out.println("姓名：" + name + " 年龄：" + age + " 财富：" + money);
        for (int i = 1; i <= 100; i++) {
        if (age <= 100) {
                int x = r.nextInt(5);
                switch (x){
                    case 0:
                        System.out.println(th1.th1);
                        int y1 = scanner.nextInt();
                        if (y1==1){
                            System.out.println("老人的家人很感谢你给了你500块钱。");
                            age = age +10;
                            money = money +500;
                        }else{
                            System.out.println("你什么也没做默默走开了。");
                            age = age +5;
                        }
                        System.out.println("姓名：" + name +" 年龄："+ age+" 财富："+money);
                        break;
                    case 1 :
                        System.out.println(th2.th2);
                        int y2 =scanner.nextInt();
                        if (y2==1){
                            System.out.println("你花300块买了个保险，啥也没保住");
                            age = age +10;
                            money = money -300;
                        }else{
                            System.out.println("你无视了买保险的，并表示自己命硬的很，不需要保");
                            age = age +10;
                        }
                        System.out.println("姓名：" +name +" 年龄："+ age+" 财富："+money);
                        break;
                    case 2:
                        System.out.println(th3.th3);
                        int y3 = scanner.nextInt();
                        if (y3==1){
                            System.out.println("进入股市后，利用你经济头脑大赚了2000元");
                            age = age +20;
                            money = money +2000;
                        }else{
                            System.out.println("你没有进入股市，啥也没赚只赚了年龄");
                            age = age +15;
                        }
                        System.out.println("姓名：" + name +" 年龄："+ age+" 财富："+money);
                        break;
                    case 3:
                        System.out.println(th4.th4);
                        int y4 = scanner.nextInt();
                        if (y4==1){
                            System.out.println("你自己留着，结果这是笔赃款，后来被警察发现对你进行了1500元处罚");
                            age = age +15;
                            money = money -1500;
                        }else{
                            System.out.println("你交给了公安机关，公安机关说这是笔赃款，他们将认真追查，并对你进行了奖励");
                            age = age +10;
                            money = money +1500;
                        }
                        System.out.println("姓名：" + name +" 年龄："+ age+" 财富："+money);
                        break;
                    case 4 :
                        System.out.println(th5.th5);
                        int y5 = scanner.nextInt();
                        if (y5==1){
                            System.out.println("你进行投资，最终大赚一笔");
                            age =age +25;
                            money = money +3500;
                        }else{
                            System.out.println("你没有投资，财产缺因为通货膨胀减少了");
                            age = age +15;
                            money = money -100;
                        }
                        System.out.println("姓名：" + name +" 年龄："+ age+" 财富："+money);
                        break;
                }
            }else{
            System.out.println("您已活过百岁，人生旅途已结束.\n姓名："+name+"年龄"+age+"财富"+money);
            return;
        }
        }
    }
}