package com.patterns.adaptor;

public class TestAdaptorPattern {
    public static void main(String[] args) {
        HugusoApi hugusoApi = new PayWithHuguso();
        hugusoApi.setCreditCardNo("473473674643");
        hugusoApi.setCustomerName("Keeya Emmanuel");
        hugusoApi.setCardExpMonth("09");
        hugusoApi.setCardExpYear("25");
        hugusoApi.setCardCVVNo((short)344);
        hugusoApi.setAmount(2565.23);

        EasyPayApi easyPayApi = new PayAdaptor(hugusoApi);
        testEasyPay(easyPayApi);

    }
    public static void testEasyPay(EasyPayApi easyPayApi){
        System.out.println(easyPayApi.getCardOwnerName());
        System.out.println(easyPayApi.getCustCardNo());
        System.out.println(easyPayApi.getCardExpMonthDate());
        System.out.println(easyPayApi.getCVVNo());
        System.out.println(easyPayApi.getTotalAmount());
    }
}
