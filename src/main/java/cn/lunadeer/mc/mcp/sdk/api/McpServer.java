package cn.lunadeer.mc.mcp.sdk.api;

/**
 * Main entry point for the MCP Server API.
 * <p>
 * This interface provides access to core MCP Server functionality
 * and can be retrieved from Bukkit's service manager.
 * </p>
 * <p>
 * Example usage:
 * <pre>{@code
 * McpServer mcpServer = Bukkit.getServicesManager()
 *     .load(McpServer.class);
 * if (mcpServer != null) {
 *     McpProviderRegistry registry = mcpServer.getProviderRegistry();
 *     registry.register(new MyProvider());
 * }
 * }</pre>
 * </p>
 *
 * @author ZhangYuheng
 * @since 1.0.0
 */
public interface McpServer {

    /**
     * Gets the provider registry.
     *
     * @return the provider registry instance
     */
    McpProviderRegistry getProviderRegistry();

    /**
     * Gets the event emitter.
     *
     * @return the event emitter instance
     */
    McpEventEmitter getEventEmitter();

    /**
     * Gets the server version.
     *
     * @return the version string
     */
    String getVersion();

    /**
     * Checks if the server is connected to the gateway.
     *
     * @return true if connected
     */
    boolean isConnected();

    /**
     * Gets the server's unique identifier.
     *
     * @return the server ID
     */
    String getServerId();
}
