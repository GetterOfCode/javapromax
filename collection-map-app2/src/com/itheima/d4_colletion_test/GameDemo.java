package com.itheima.d4_colletion_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {
    public static List<Card> allcards = new ArrayList<>();


    static{
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","k","A","2"};
        String[] colors = {"♠","♥","♣","♦"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card c = new Card(size,color,index);
                allcards.add(c);
            }

        }
        Card c2 = new Card("","🃏",++index);
        Card c3 = new Card("","🤡",++index);
        Collections.addAll(allcards,c2,c3);
        System.out.println("新牌:"+allcards);
    }



    public static void main(String[] args) {
        Collections.shuffle(allcards);
        System.out.println("洗牌后"+allcards);

        List<Card> linghuchong  = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyingying = new ArrayList<>();

        for (int i = 0; i < allcards.size()-3; i++) {
            Card c  = allcards.get(i);
            if(i%3 == 0){
                linghuchong.add(c);

            }else if(i%3 == 1){
                jiumozhi.add(c);

            }else {
                renyingying.add(c);
            }

        }
        List<Card> lastThreeCards = allcards.subList(allcards.size()-3,allcards.size());

        sortCards(linghuchong);
        sortCards(jiumozhi);
        sortCards(renyingying);
        sortCards(lastThreeCards);

        System.out.println("令狐冲："+linghuchong);
        System.out.println("鸠摩智："+jiumozhi);
        System.out.println("任盈盈："+renyingying);
        System.out.println("底牌："+lastThreeCards);


    }
    public static void sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getIndex()-o2.getIndex();
            }
        });
    }
}
