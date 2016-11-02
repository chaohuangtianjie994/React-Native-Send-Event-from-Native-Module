package com.ywq;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by Administrator on 2016/10/30.
 */

public class MyModule extends ReactContextBaseJavaModule {

    public MyModule(ReactApplicationContext reactContext) {

        super(reactContext);

        //给上下文对象赋值
        Test.myContext=reactContext;
    }

    @Override
    public String getName() {

        return "MyModule";
    }


    @ReactMethod
    public void  NativeMethod()
    {
        //调用Test类中的原生方法。
        new Test().fun();
    }
}
