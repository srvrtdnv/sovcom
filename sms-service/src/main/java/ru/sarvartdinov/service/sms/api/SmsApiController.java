package ru.sarvartdinov.service.sms.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-14T23:15:30.699+05:00")

@Controller
public class SmsApiController implements SmsApi {

    private final SmsApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public SmsApiController(SmsApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public SmsApiDelegate getDelegate() {
        return delegate;
    }
}
