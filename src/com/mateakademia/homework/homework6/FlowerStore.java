package com.mateakademia.homework6;


public class FlowerStore {

    private int walletOfShop;

   public Flowers[] sellSequence(int rose, int chamomile, int tulip ) {

        int QuantityFlowers = rose + chamomile + tulip;
        Flowers[] buket = new Flowers[QuantityFlowers];
        int k = 0;
        while (k < QuantityFlowers) {
            if (rose > 0) {
                buket[k] = new Rose();
                rose--;
                k++;
            }
            if (chamomile > 0) {
                buket[k] = new Chamomile();
                chamomile--;
                k++;
            }

            if (tulip > 0) {
               buket[k] = new Tulip();
                tulip--;
                k++;
            }

        }
        totalBalance(buket);
        return buket;
    }

    private void totalBalance(Flowers[] buket) {
        for (int i = 0; i < buket.length; i++) {
            walletOfShop += buket[i].getPrice();
        }
    }
        public Flowers[] sell(int rose, int tulip, int chamomile) {
            int QuantityFlowers = rose + tulip + chamomile;
            Flowers[] buket = new Flowers[QuantityFlowers];
            for (int i = 0; i < rose; i++) {
                buket[i] = new Rose();
            }
            for (int i = rose; i < rose + tulip; i++) {
                buket[i] = new Tulip();
            }
            for (int i = rose + tulip; i < QuantityFlowers; i++) {
                buket[i] = new Chamomile();
            }
            totalBalance(buket);
            return buket;
        }

    public int getWallet() {
        return walletOfShop;
    }
}