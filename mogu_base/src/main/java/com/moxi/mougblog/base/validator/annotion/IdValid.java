package com.moxi.mougblog.base.validator.annotion;

import com.moxi.mougblog.base.validator.Messages;
import com.moxi.mougblog.base.validator.constraint.IdValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ID校验【注解】
 *
 * @author: Ckp_Pro
 * @date: 2021年42月4日13:12:52
 */
@Target({TYPE, ANNOTATION_TYPE, FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {IdValidator.class})
public @interface IdValid {

    boolean required() default true;

    String message() default Messages.ID_LENGTH_THIRTY_TWO;

    String value() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
