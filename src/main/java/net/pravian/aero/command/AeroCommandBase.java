package net.pravian.aero.command;

import java.util.List;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.plugin.AeroPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface AeroCommandBase<T extends AeroPlugin<T>> {

  void register(SimpleCommandHandler<T> handler) throws CommandRegistrationException;

  void unregister();

  boolean isRegistered();

  void onInit();

  AeroCommandHandler<T> getHandler();

  Class<? extends AeroCommandBase<T>> getCommandClass();

  boolean runCommand(
      final CommandSender sender, final Command command, final String label, final String[] args);

  List<String> tabComplete(CommandSender sender, Command command, String label, String[] args);
}
