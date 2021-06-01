package com.moxi.mougblog.base.validator.constraint;

import com.moxi.mogublog.utils.StringUtils;
import com.moxi.mougblog.base.validator.annotion.Range;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 字符串范围约束，限制长度【校验器】
 *
 * @author Ckp_Pro
 * @date 2021年42月4日13:17:03
 */
public class RangValidator implements ConstraintValidator<Range, String> {
    private long min;
    private long max;

    @Override
    public void initialize(Range constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (null == value || StringUtils.isBlank(value)) {
            return false;
        }
        return value.length() >= min && value.length() <= max;
    }
}
