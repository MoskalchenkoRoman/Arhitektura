package org.example.dz2.Rewards;

import org.example.dz2.IGameItem;

public class VipReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("VIP-очки получены");
    }
}
