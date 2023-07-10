package org.example.dz2.Rewards;

import org.example.dz2.IGameItem;

public class GemReward implements IGameItem {

    @Override
    public void open() {
        System.out.println("Gem");
    }
}
