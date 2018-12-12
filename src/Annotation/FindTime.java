package Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class FindTime implements InvocationHandler {

    private Middle method1 = new Middle();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(!method.isAnnotationPresent(Time.class)) {
            return method.invoke(method1, args);
        }
        Instant start = Instant.now();
        Object returnObj = method.invoke(method1, args);
        Instant end = Instant.now();
        System.out.println("Метод " + method.getName() + " был выполнен за " + Duration.between(end, start) + ".");
        return returnObj;
    }
}
