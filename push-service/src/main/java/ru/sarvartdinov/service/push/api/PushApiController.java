package ru.sarvartdinov.service.push.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-14T23:15:33.033+05:00")

@Controller
public class PushApiController implements PushApi {

    private final PushApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public PushApiController(PushApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public PushApiDelegate getDelegate() {
        return delegate;
    }
}
