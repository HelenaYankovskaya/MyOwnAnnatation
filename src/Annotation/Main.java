package Annotation;

import java.lang.reflect.Proxy;
public class Main {
    public static void main(String[] args) {
        MyMethod method = (MyMethod) Proxy.newProxyInstance(Middle.class.getClassLoader(),
                new Class[]{MyMethod.class}, new FindTime());

        method.middleOfInt();
    }

    }

