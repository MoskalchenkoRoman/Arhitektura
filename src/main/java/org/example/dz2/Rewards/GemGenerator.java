package org.example.dz2.Rewards;

import org.example.dz2.IGameItem;
import org.example.dz2.ItemFabric;

public class GemGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
