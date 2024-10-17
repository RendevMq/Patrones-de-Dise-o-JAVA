package org.example.facade;

import org.example.subsystems.NotificationService;
import org.example.subsystems.RewardSystem;

public class NotificationRewardFacade {
    private NotificationService notificationService;
    private RewardSystem rewardSystem;

    public NotificationRewardFacade() {
        this.notificationService = new NotificationService();
        this.rewardSystem = new RewardSystem();
    }

    // Método para aplicar puntos de recompensa
    public void applyRewardPoints(String user, double amountSpent) {
        rewardSystem.applyRewardPoints(user, amountSpent);
    }

    // Método para enviar notificación
    public void sendNotification(String email, String message, boolean isPriority) {
        notificationService.sendEmail(email, message, isPriority);
    }
}