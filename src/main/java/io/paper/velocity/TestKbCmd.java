package io.paper.velocity;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class TestKbCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You are not a player");
            return true;
        }
        switch (command.getName()){
            case "kbtest":
                switch (args.length){
                    case 0:
                        p.sendMessage("§c§lTestKb>> §d§l/kbtest <player> §8| §7Have fun spamming it!");
                }
                break;
        }

        if(args.length >=1 && p.hasPermission("kbtest.commandexecutor")){
            String vittima = args[0];
            Player target = Bukkit.getPlayer(vittima);
            if(target == null){
                p.sendMessage(ChatColor.RED + "Player not online");
            }
            else {
                target.setVelocity(new Vector(1, 1, 1));
                p.sendMessage(ChatColor.RED + "Test Executed");
            }
        }
        return false;
    }
}
