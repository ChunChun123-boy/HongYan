package Lv3;

public class You implements Customer {
    private Merchant JingDong;

    public void setMerchant(Merchant merchant) {
        this.JingDong = merchant;
    }

    Commodity commodityForJingDong = new Commodity("电脑");

    @Override
    public void SendIndent() {
        System.out.println("你发送了订单：" + commodityForJingDong.name + "给京东");
        JingDong.ReceiveIndent(commodityForJingDong);
    }

    @Override
    public void GetCommodity() {
        System.out.println("你收到了订单：" + commodityForJingDong.name);
    }

}
