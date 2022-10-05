package io.paper.velocity;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("kbtest").setExecutor(new TestKbCmd());
    }
}
