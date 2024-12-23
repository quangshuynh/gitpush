package com.example.gitpush;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * gitpush java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("gitpush");

  public void onEnable()
  {
    LOGGER.info("gitpush enabled");
  }

  public void onDisable()
  {
    LOGGER.info("gitpush disabled");
  }
}
