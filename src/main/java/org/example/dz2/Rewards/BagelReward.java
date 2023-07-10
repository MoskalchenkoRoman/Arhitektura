package org.example.dz2.Rewards;

import org.example.dz2.IGameItem;

public class BagelReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("УПС!!! Попробуй еще раз");
    }
}
