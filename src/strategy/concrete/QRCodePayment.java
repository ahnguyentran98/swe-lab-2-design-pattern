package strategy.concrete;

import strategy.strategy_interface.PaymentStrategy;

public class QRCodePayment implements PaymentStrategy {
    private String qrCode;

    public QRCodePayment(String qrCode) {
        this.qrCode = qrCode;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using QR Code: " + qrCode);
    }
}
