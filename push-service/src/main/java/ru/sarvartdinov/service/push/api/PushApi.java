/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.sarvartdinov.service.push.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-14T23:15:33.033+05:00")

@Api(value = "Push", description = "the Push API")
public interface PushApi {

    PushApiDelegate getDelegate();

    @ApiOperation(value = "Отправить push-уведомление", nickname = "sendPush", notes = "Ендпоинт для отправки push-уведомления", tags={ "push", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Отправка успешна") })
    @RequestMapping(value = "/send",
        consumes = { "text/plain" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> sendPush(@ApiParam(value = "Сообщение" ,required=true )  @Valid @RequestBody String body) {
        return getDelegate().sendPush(body);
    }

}
