package xing.rujuan.formatter;

import org.springframework.format.Formatter;
import xing.rujuan.model.Phone;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String s, Locale locale) throws ParseException {
        //s=641-451-1111
        String[] temp = s.split("-");
        Phone p = new Phone();
        p.setAreaCode(temp[0]);
        p.setPrefix(temp[1]);
        p.setNumber(temp[2]);
        System.out.println("Inside PhoneFormatter parse method: ");
        System.out.println(p);
        return p;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
