package us.thefrostedkingdom.TestPlugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Oatma on 14-Jul-17.
 */
public class Kit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack diamond = new ItemStack(Material.DIAMOND);

            diamond.setAmount(20);

            player.getInventory().addItem(diamond);

        }

        return false;
    }
}
