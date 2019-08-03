package net.pravian.aero.config;

import java.util.List;
import java.util.Map;
import net.pravian.aero.serializable.SerializableObject;
import org.bukkit.Color;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public interface ConfigurationContainer<T extends ConfigurationSection>
    extends ConfigurationSection {

  void set(PathContainer path, Object value);

  String getString(PathContainer path);

  boolean getBoolean(PathContainer path);

  ConfigurationSection getConfigurationSection(PathContainer container);

  int getInt(PathContainer path);

  double getDouble(PathContainer path);

  long getLong(PathContainer path);

  Color getColor(PathContainer path);

  ItemStack getItemStack(PathContainer path);

  OfflinePlayer getOfflinePlayer(PathContainer path);

  Vector getVector(PathContainer path);

  List<String> getStringList(PathContainer path);

  List<Integer> getIntegerList(PathContainer path);

  List<Character> getCharacterList(PathContainer path);

  List<Boolean> getBooleanList(PathContainer path);

  List<Byte> getByteList(PathContainer path);

  List<Double> getDoubleList(PathContainer path);

  List<Float> getFloatList(PathContainer path);

  List<Long> getLongList(PathContainer path);

  List<Short> getShortList(PathContainer path);

  List<?> getList(PathContainer path);

  List<Map<?, ?>> getMapList(PathContainer path);

  Object getDefault(PathContainer path);

  void setSerializable(PathContainer path, SerializableObject<?> object);

  void setSerializable(String path, SerializableObject<?> object);

  // <T extends SerializableObject<?>> T getSerializable(PathContainer path, Class<T> type);

  // <T extends SerializableObject<?>> T getSerializable(String path, Class<T> type);

  <K, V> void setMap(PathContainer path, Map<K, V> map);

  <K, V> void setMap(String path, Map<K, V> map);

  <K, V> Map<K, V> getMap(PathContainer path);

  <K, V> Map<K, V> getMap(String path);

  void save();

  void load();

  T getConfig();
}
