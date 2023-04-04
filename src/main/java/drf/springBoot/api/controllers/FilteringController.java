package drf.springBoot.api.controllers;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {
    @GetMapping("/filter1")
    public List<UserDetails> filter1() {
        return UserDetails.getDetails();
    }
    @GetMapping("/filter2")
    public MappingJacksonValue filter2() {
        List<UserDetails> details = UserDetails.getDetails();
        // dynamic filtering
        // its more efficient to add filtering at the database level when possible
        // since it make for less data transmitted over the network
        // ex: SELECT username FROM MY_DATABASE;
        SimpleBeanPropertyFilter filteredDetails = SimpleBeanPropertyFilter.filterOutAllExcept("username");
        FilterProvider filters = new SimpleFilterProvider().addFilter("UserDetails", filteredDetails);
        MappingJacksonValue mapping = new MappingJacksonValue(details);
        mapping.setFilters(filters);
        return mapping;
    }

}
//@JsonIgnoreProperties(value = {"panNumber"}) // does not include panNumber in response (static filtering)
@JsonFilter("UserDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
class UserDetails {
    private int userId;
    private String username;
    //@JsonIgnore also does not include panNumber in response
    private String panNumber;

    public static List<UserDetails> getDetails() {
        return Arrays.asList(
                new UserDetails(12, "Daniel", "AVDGHDOI"),
                new UserDetails(13, "Dylan", "AVDGAKDO"),
                new UserDetails(14, "Jack", "AVDHFHFOI")
        );
    }
}
