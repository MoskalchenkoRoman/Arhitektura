package org.example;

import org.example.dz2.ItemFabric;
import org.example.dz2.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new XpGenerator());
        fabricList.add(new VipGenerator());
        fabricList.add(new ShardGenerator());
        fabricList.add(new SoulGenerator());
        fabricList.add(new BagelGenerator());

        for(int i =0; i<20; i++)
        {
            int index = rnd.nextInt(0, 7);
//            int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}