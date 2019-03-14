package com.mateakademia.homework6;


public class FlowerStore {

    private int walletOfShop;

   public Flower[] sellSequence(int rose, int chamomile, int tulip ) {

        int quantityFlowers = rose + chamomile + tulip;
        Flower[] buket = new Flower[quantityFlowers];
        int k = 0;
        while (k < quantityFlowers) {
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
        getBalance(buket);
        return buket;
    }

    public void getBalance(Flower[] buket) {
        for (int i = 0; i < buket.length; i++) {
            walletOfShop += buket[i].getPrice();
        }
    }
        public Flower[] sell(int rose, int tulip, int chamomile) {
            int QuantityFlowers = rose + tulip + chamomile;
            Flower[] buket = new Flower[QuantityFlowers];
            for (int i = 0; i < rose; i++) {
                buket[i] = new Rose();
            }
            for (int i = rose; i < rose + tulip; i++) {
                buket[i] = new Tulip();
            }
            for (int i = rose + tulip; i < QuantityFlowers; i++) {
                buket[i] = new Chamomile();
            }
            getBalance(buket);
            return buket;
        }

    public int getWallet() {
        return walletOfShop;
    }
}