package com.elderdrivers.riru.edxp.hook;

import java.lang.reflect.Member;

import de.robv.android.xposed.XposedBridge;

public interface HookProvider {

    void hookMethod(Member method, XposedBridge.AdditionalHookInfo additionalInfo);

    Object invokeOriginalMethod(Member method, long methodId, Object thisObject, Object[] args) throws Throwable;

    Member findMethodNative(Member hookMethod);

    void deoptMethods(String packageName, ClassLoader classLoader);

    long getMethodId(Member member);
}
