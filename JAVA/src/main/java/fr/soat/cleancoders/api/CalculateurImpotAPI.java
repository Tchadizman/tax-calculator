package fr.soat.cleancoders.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
@Api(value = "TaxCalculator", description = "Tax computation API")
public class CalculateurImpotAPI {

    @ApiOperation(value = "Tax computation")
    @ApiResponses(value = {
        @ApiResponse(code = 404, message = "Company not found"),
        @ApiResponse(code = 422, message = "Tax calculation error"),
        @ApiResponse(code = 500, message = "Server technical error"),
    })
    @RequestMapping(value = "/taxes", method = RequestMethod.GET)
    public Double calculerImpot(@RequestParam(value = "siretNumber") String siretNumber,
                                @RequestParam(value = "denomination") String denomination) {
        return null;
    }
}
