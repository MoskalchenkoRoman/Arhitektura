package org.example.dz2.Rewards;

import org.example.dz2.IGameItem;

public class XpReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Получено 1000 очков ХР");
    }
}
