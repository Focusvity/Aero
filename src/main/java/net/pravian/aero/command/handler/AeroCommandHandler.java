/*
 * Copyright 2015 Pravian Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.pravian.aero.command.handler;

import java.util.Collection;
import java.util.Map;
import net.pravian.aero.command.AeroCommandBase;
import net.pravian.aero.command.executor.AeroCommandExecutor;
import net.pravian.aero.command.permission.AeroPermissionHandler;
import net.pravian.aero.plugin.AeroPlugin;
import org.bukkit.command.PluginCommand;

public interface AeroCommandHandler<T extends AeroPlugin<T>> {

  T getPlugin();

  void clearCommands();

  int loadFrom(Package pack);

  void addAll(Iterable<? extends AeroCommandBase<T>> commands);

  void add(AeroCommandBase<T> command);

  void add(AeroCommandBase<T> command, String name);

  void add(AeroCommandExecutor<? extends AeroCommandBase<T>> executor);

  boolean registerAll();

  boolean registerAll(String fallbackPrefix, boolean force);

  Map<String, AeroCommandExecutor<?>> getExecutorMap();

  Collection<AeroCommandExecutor<?>> getExecutors();

  Map<String, PluginCommand> getRegisteredCommandsMap();

  Collection<PluginCommand> getRegisteredCommands();

  AeroPermissionHandler getPermissionHandler();

  void setPermissionHandler(AeroPermissionHandler permissionHandler);

  String getSuperPermission();

  void setSuperPermission(String permission);

  String getOnlyPlayerMessage();

  void setOnlyPlayerMessage(String message);

  String getOnlyConsoleMessage();

  void setOnlyConsoleMessage(String message);

  String getInvalidArgumentLengthMessage();

  void setInvalidArgumentLengthMessage(String message);

  String getInvalidArgumentMessage();

  void setInvalidArgumentMessage(String message);

  String getPermissionMessage();

  void setPermissionMessage(String message);

  String getCommandClassPrefix();

  void setCommandClassPrefix(String prefix);
}
