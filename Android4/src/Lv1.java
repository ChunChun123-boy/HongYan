class Couple {

    private int number=0;
    public void count(int number){
        this.number=number+this.number;
    }
    public String getCount() {
        return "和是"+ this.number;
    }

    public void jc(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(n + "的阶乘是" + sum);

    }


    public void fb(int n){
        int odd=1,even=1;
        for(int i =1;i<=n-2;i++) {
            if(n==1 | n==2){
                odd=odd;even=even;
            }else if(i % 2 == 1){
                odd = odd +even;
            }else{
                even = even + odd;
            }
        }
        if(n % 2 ==1){
            System.out.println("斐波那契数列第"+n+"项是"+odd);
        }else{
            System.out.println("斐波那契数列第"+n+"项是"+even);
        }
    }
}

public class Lv1 {
    public static void main(String[] args) {
        Couple couple = new Couple();
        couple.count(9);
        couple.count(8);
        couple.count(7);
        System.out.println(couple.getCount());
        couple.jc(6);
        couple.fb(5);
    }
}