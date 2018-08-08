package gof.observer;

/**
 * 定义观察者接口
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
