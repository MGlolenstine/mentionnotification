package xyz.mglolenstine.mentionnotification;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by LifEorDeatH on 15.7.2017.
 */
public class Main extends JavaPlugin {
    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
}
