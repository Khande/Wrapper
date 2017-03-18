package com.linroid.wrapper.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 将 Foo.instance().method() 这样的调用简化为Foo.method()
 * @author linroid <linroid@gmail.com>
 * @since 18/03/2017
 */
@Documented
@Retention(CLASS)
@Target({TYPE})
public @interface WrapperSingleton {
    String methodName = null;
}