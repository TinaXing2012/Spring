package xing.rujuan.validation;

import xing.rujuan.domain.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

public class AgeValidation implements ConstraintValidator<Age, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        Period p = Period.between(user.getBirthday(), LocalDate.now());
        return p.getYears() == user.getAge();
    }

    @Override
    public void initialize(Age constraintAnnotation) {

    }
}
