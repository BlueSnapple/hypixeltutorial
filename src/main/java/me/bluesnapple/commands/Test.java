package me.bluesnapple.commands;

import me.bluesnapple.api.GetPlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor{


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if (sender instanceof Player){
            Player player = (Player) sender;
            GetPlayer.main(player);
        }

        return true;
    }
}
