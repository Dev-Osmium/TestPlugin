package us.thefrostedkingdom.TestPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import us.thefrostedkingdom.TestPlugin.commands.Kit;

/**
 * Created by Oatma on 14-Jul-17.
 */
public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getCommand("kit").setExecutor(new Kit());
    }

    @Override
    public void onDisable(){

    }

}
