package update.personal_details.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import update.personal_details.model.BankUser;
import update.personal_details.repository.UpdateRepository;

@Service
public class UpdateService {
    @Autowired
    UpdateRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(UpdateService.class);

    public String updateAll(@RequestParam String name, @RequestParam String dob, @RequestParam String email, @RequestParam String mobile_number, long id){
        BankUser bankUser=repository.findById(id).orElseThrow(()->new RuntimeException("user not found by id:"+id));
        bankUser.setName(name);
        bankUser.setDob(dob);
        bankUser.setEmail(email);
        bankUser.setMobile_number(mobile_number);
        repository.save(bankUser);
        logger.info("All User personal details updated");
        return "All User personal details updated;";
    }

    public String updateName(String name, long id) {
        BankUser bankUser=repository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
                bankUser.setName(name);
            repository.save(bankUser);
            logger.info("User Name updated");
            return "User Name updated";

    }
    public String updateDob( String dob, long id) {
        BankUser bankUser=repository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        bankUser.setDob(dob);
        repository.save(bankUser);
        logger.info("User DOB updated");

        return "User DOB updated";

    }
    public String updateEmail( String email, long id) {
        BankUser bankUser=repository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        bankUser.setEmail(email);
        repository.save(bankUser);
        logger.info("User Email updated");

        return "User Email updated";

    }
    public String updateMobileNumber( String mobile_number, long id) {
        BankUser bankUser=repository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        bankUser.setMobile_number(mobile_number);
        repository.save(bankUser);
        logger.info("User Mobile_Number updated");

        return "User Mobile_Number updated";

    }
}
