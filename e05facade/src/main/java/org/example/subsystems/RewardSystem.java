package org.example.subsystems;

import org.example.subsystems.interfaces.IRewardSystem;

public class RewardSystem implements IRewardSystem {
    @Override
    public void applyRewardPoints(String user, double amountSpent) {
        if (amountSpent > 1000) {
            System.out.println("Applying 500 reward points for user: " + user);
        } else if (amountSpent > 500) {
            System.out.println("Applying 200 reward points for user: " + user);
        } else {
            System.out.println("Applying 100 reward points for user: " + user);
        }
    }
}