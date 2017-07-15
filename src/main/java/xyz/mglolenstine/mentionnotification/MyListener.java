package xyz.mglolenstine.mentionnotification;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

/**
 * Created by LifEorDeatH on 15.7.2017.
 */
public class MyListener implements Listener {
    @EventHandler
    public void onChat(PlayerChatEvent e){
        String msg = e.getMessage();
        String[] parts = msg.split(" ");
        for(int i = 0; i < parts.length; i++) {
            if(parts[i].startsWith("@")) {
                String name = parts[i].substring(1);
                for (Player p : Bukkit.getServer().getOnlinePlayers()) {
                    if (p.getName().equalsIgnoreCase(name)){
                        p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
                    }
                }
            }
        }
    }
}
