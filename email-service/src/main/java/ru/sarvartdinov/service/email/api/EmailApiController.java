package ru.sarvartdinov.service.email.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-14T23:15:23.492+05:00")

@Controller
public class EmailApiController implements EmailApi {

    private final EmailApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public EmailApiController(EmailApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public EmailApiDelegate getDelegate() {
        return delegate;
    }
}
