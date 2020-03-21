package store;
import flowers.*;

public class FlowerStore {
    private static int wallet;
    public int getWallet(){
        return wallet;
    }
    //букет где цветы одного типа рядом
    public Flower[] sell(int rose,int cham,int tulip){
        int sum=rose+cham+tulip;
        int cost=0;
        Flower bouquet[]=new Flower[sum];
        for(int i=0;i<rose;i++){
            bouquet[i] = new Rose();
            cost+=bouquet[i].getCost();
        }
        for(int i=rose;i<cham+rose;i++){
            bouquet[i] = new Chamomile();
            cost+=bouquet[i].getCost();
        }
        for(int i=rose+cham;i<sum;i++){
            bouquet[i]=new Tulip();
            cost+=bouquet[i].getCost();
        }
        bill(cost);
        return bouquet;
    }
    //букет с чередованием разных цветов
    public  Flower[] sellSequence(int rose,int cham,int tulip){
        int sum=rose+cham+tulip;
        int cost=0;
        Flower bouquet[]=new Flower[sum];
        for(int i=0;i<sum;) {
            if (rose > 0) {
                bouquet[i] = new Rose();
                rose--;
                cost+=bouquet[i].getCost();
                i++;
            }
            if (cham > 0) {
                bouquet[i] = new Chamomile();
                cham--;
                cost+=bouquet[i].getCost();
                i++;
            }
            if (tulip > 0){
                bouquet[i]=new Tulip();
                tulip--;
                cost+=bouquet[i].getCost();
                i++;
            }
        }
        bill(cost);
        return bouquet;
    }
    //узнать что в букете
    public void whatInBouquet(Flower bouquet[]) {
        System.out.println("В букете содержится:");
        if(bouquet.length==0)
            System.out.println("Ничего");
        for (Flower f : bouquet) {
            System.out.print(f.toString()+" ");
            }
        System.out.println();
    }
    //счёт и оплата
    private void bill(int bouquetCost){
        System.out.println("С вас "+bouquetCost);
        wallet+=bouquetCost;
    }
}
