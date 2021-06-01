package com.moxi.mougblog.base.validator.constraint;

import com.moxi.mougblog.base.validator.annotion.BooleanNotNULL;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 判断Boolean类型是否为空【校验器】
 *
 * @author Ckp_Pro
 * @date 2021年42月4日13:16:06
 */
public class BooleanValidator implements ConstraintValidator<BooleanNotNULL, Boolean> {

    @Override
    public void initialize(BooleanNotNULL constraintAnnotation) {

    }

    @Override
    public boolean isValid(Boolean value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return true;
    }
}
