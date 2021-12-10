package common;

public class Config {
    /**
     * Set platform bu default:
     * PLATFORM_AND_BROWSER = "mac_chrome" for mac
     * PLATFORM_AND_BROWSER = "win_chrome" for windows
     */
    public static final String PLATFORM_AND_BROWSER = "mac_chrome";

    /**
     * Clear browser cookies and storage after each iteration
     * if true - cookies and storage cleared
     */
    public static final boolean CLEAR_COOKIES_AND_LOCAL_STORAGE = true;

    /**
     * To keep the browser open after session
     * if true - browser cleared
     */
    public static final boolean HOLD_BROWSER_OPEN = true;
}
