package com.linroid.wrapper.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Wrapper 支持添加多个
 *
 * @author linroid
 * @since 16/03/2017
 */
@Documented
@Retention(CLASS)
@Target({TYPE})
public @interface WrapperMultiple {
}
