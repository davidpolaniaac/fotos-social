package website.davidpolania.android.photofeed.lib.base;

/**
 * Created by DavidPolania.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
