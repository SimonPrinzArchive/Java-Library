package com.pinplaycooperation.internal.javalibrary.event;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface EventPriority
{
  Priority priortiy() default Priority.NORMAL;
}


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/event/EventPriority.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */