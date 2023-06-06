package com.spring.pockerwinrategenerator;

public class WinRateGenerate {
    int card_price = 13;
    int card_suit =4;
    int[][] Card = new int[card_price][card_suit];
    int[][] Card1enemy = new int[card_price][card_suit];
    int[][] Card2enemy = new int[card_price][card_suit];
    int player_sum =0;
    int enemy_sum=0;
    int number1 = 2;
    int suit1=2;
    int number2 = 3;
    int suit2=3;
    int enemy_number1;
    int enemy_suit1;
    int enemy_number2;
    int enemy_suit2;

WinRateGenerate(){
    price_generator();
    //Избавиться от реверсивности
for (int i = 0; i < card_price; i++) {
        for (int k = 0; k < card_suit; k++) {
            if ((i != number1 && k != suit1)||(i != number2 && k != suit2) ){
                enemy_number1=i;
                enemy_suit1=k;
            }
            else{
                continue;
            }
            for (int j = 0; j < card_price; j++) {
                for (int n = 0; n < card_suit; n++) {
                    if (i != number1 || k != suit1) {
                        enemy_number2=j;
                        enemy_suit2=n;
                    }
                    else{
                        continue;
                    }
                }
            }
        }

        }
    }
void price_generator(){
    for (int i = 0; i < card_price; i++) {
        for (int k = 0; k < card_suit; k++) {
            Card[i][k] = i+2;
            System.out.println(Card[i][k]);
        }
    }
}



}
/*for (int i = 0; i < двумерныйМассив.length; i++) {
        for (int j = 0; j < двумерныйМассив[i].length; j++) {
            if (i != выбраннаяСтрока || j != выбранныйСтолбец) {
                двумерныйМассив[i][j] = 1;
            }
        }
    }*/


