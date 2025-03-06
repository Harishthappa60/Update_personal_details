package update.personal_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import update.personal_details.service.UpdateService;

@RestController
public class updateController {
    @Autowired
    UpdateService service;
    @PutMapping("/Update_all")
    public String updateAll(@RequestParam String created_date, @RequestParam String name,@RequestParam String dob,@RequestParam String email,@RequestParam String mobile_number,@RequestParam String updated_date,@RequestParam long id){
        return service.updateAll(created_date,name, dob, email, mobile_number,updated_date, id);
    }

    @PutMapping("/update_name")
    public String updateName(@RequestParam String name, long id) {
        return service.updateName(name, id);

    }

    @PutMapping("/update_dob")
    public String updateDob(@RequestParam String dob, long id) {
        return service.updateDob(dob, id);

    }

    @PutMapping("/update_email")
    public String updateEmail(@RequestParam String email, long id) {
        return service.updateEmail(email, id);

    }

    @PutMapping("/update_mobile_number")
    public String updateMobileNumber(@RequestParam String mobile_number, long id) {
        return service.updateMobileNumber(mobile_number, id);

    }
    @PutMapping("/update_updated_date")
    public String updatedDate(@RequestParam String updated_date, long id) {
        return service.updatedDate(updated_date, id);

    }
    @PutMapping("/update_created_date")
    public String createdDate(@RequestParam String created_date, long id) {
        return service.createdDate(created_date, id);

    }
}
