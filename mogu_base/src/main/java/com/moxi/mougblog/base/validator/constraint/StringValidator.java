package com.moxi.mougblog.base.validator.constraint;

import com.moxi.mogublog.utils.StringUtils;
import com.moxi.mougblog.base.validator.annotion.NotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 判断是否为空字符串【校验器】
 *
 * @author Ckp_Pro
 * @date 2021年42月4日13:17:17
 */
public class StringValidator implements ConstraintValidator<NotBlank, String> {
    @Override
    public void initialize(NotBlank constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || StringUtils.isBlank(value) || StringUtils.isEmpty(value.trim())) {
            return false;
        }
        return true;
    }
}
