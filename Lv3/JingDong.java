package Lv3;

public class JingDong extends You implements Merchant {
    private Customer You;

    public void setCustomer(Customer customer) {
        this.You = customer;
    }

    private Merchant JingDong;

    public void setMerchant(Merchant merchant) {
        this.JingDong = merchant;
    }

    @Override
    public void ReceiveIndent(Commodity commodity) {
        System.out.println("京东收到了" + commodity.name + "的订单");
        JingDong.ExpressLeave(commodityForJingDong);
    }

    @Override
    public void ExpressLeave(Commodity commodity) {
        System.out.println("京东送出了" + commodity.name + "的订单");
        JingDong.ExpressArrive(commodityForJingDong);
    }

    @Override
    public void ExpressArrive(Commodity commodity) {
        System.out.println(commodity.name + "已送达，请注意签收");
        You.GetCommodity();
    }
}
