package net.pravian.aero.internal;

import net.pravian.aero.Aero;
import org.bukkit.plugin.Plugin;

public interface AeroContainer extends Plugin {

  Aero getAero();

  String getBuildVersion();

  String getBuildNumber();

  String getBuildDate();
}
