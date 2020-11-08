package Lv3;

public class Main {
    public static void main(String[] args) {
        You you = new You();
        JingDong jingDong = new JingDong();

        you.setMerchant(jingDong);
        jingDong.setMerchant(jingDong);
        jingDong.setCustomer(you);
        you.SendIndent();
    }

}
