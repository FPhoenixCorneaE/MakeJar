package com.wkz.makejar;

import java.lang.reflect.Method;

public class ReflectionUtils {
    public ReflectionUtils() {
    }

    private static Class<?>[] getTypeClass(Object[] arrayObject) {
        Class[] arrayOfClass = null;
        if (arrayObject != null) {
            int i = arrayObject.length;
            arrayOfClass = new Class[i];
            if (i > 0) {
                for (int j = 0; j < i; ++j) {
                    arrayOfClass[j] = rawType(arrayObject[j].getClass());
                }
            }
        }

        return arrayOfClass;
    }

    public static Class<?> rawType(Class<?> paramClass) {
        if (paramClass.equals(Boolean.class)) {
            paramClass = Boolean.TYPE;
        }

        if (paramClass.equals(Integer.class)) {
            return Integer.TYPE;
        } else if (paramClass.equals(Float.class)) {
            return Float.TYPE;
        } else if (paramClass.equals(Double.class)) {
            return Double.TYPE;
        } else if (paramClass.equals(Short.class)) {
            return Short.TYPE;
        } else if (paramClass.equals(Long.class)) {
            return Long.TYPE;
        } else if (paramClass.equals(Byte.class)) {
            return Byte.TYPE;
        } else {
            return paramClass.equals(Character.class) ? Character.TYPE : paramClass;
        }
    }

    public static Object invoke(Object paramObject, Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject) {
        try {
            Method localMethod = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
            localMethod.setAccessible(true);
            Object localObject = localMethod.invoke(paramObject, paramArrayOfObject);
            return localObject;
        } catch (Throwable var7) {
            return null;
        }
    }

    public static Object invoke(Object paramObject, String paramString, Object[] paramArrayOfObject) {
        return invoke(paramObject, paramObject.getClass(), paramString, getTypeClass(paramArrayOfObject), paramArrayOfObject);
    }
}
