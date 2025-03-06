package update.personal_details.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import update.personal_details.model.BankUser;
import update.personal_details.repository.UpdateRepository;

@Service
public class UpdateService {
    @Autowired
    UpdateRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(UpdateService.class);

    public String updateAll(String created_date, String name, String dob, String email, String mobile_number,String updated_date, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("user not found by id:" + id));
        if (bankUser.getCreated_date() == null || bankUser.getCreated_date() != null) {
            bankUser.setCreated_date(created_date);
        }
        if (bankUser.getName() == null || bankUser.getName() != null) {
            bankUser.setName(name);
        }
        if (bankUser.getDob() == null || bankUser.getDob() != null) {
            bankUser.setDob(dob);
        }
        if (bankUser.getEmail() == null || bankUser.getEmail() != null) {
            bankUser.setEmail(email);
        }
        if (bankUser.getMobile_number() == null || bankUser.getMobile_number() != null) {
            bankUser.setMobile_number(mobile_number);
        }
        repository.save(bankUser);
        logger.info("All User personal details updated");
        return "All User personal details updated;";
    }

    public String updateName(String name, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (bankUser.getName() == null || bankUser.getName() != null) {
            bankUser.setName(name);
        }
        repository.save(bankUser);
        logger.info("User Name updated");
        return "User Name updated";

    }

    public String updateDob(String dob, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (bankUser.getDob() == null || bankUser.getDob() != null) {
            bankUser.setDob(dob);
        }
        repository.save(bankUser);
        logger.info("User DOB updated");

        return "User DOB updated";

    }

    public String updateEmail(String email, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (bankUser.getEmail() == null || bankUser.getEmail() != null) {
            bankUser.setEmail(email);
        }
        repository.save(bankUser);
        logger.info("User Email updated");

        return "User Email updated";

    }

    public String updateMobileNumber(String mobile_number, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (bankUser.getMobile_number() == null || bankUser.getMobile_number() != null) {
            bankUser.setMobile_number(mobile_number);
        }
        repository.save(bankUser);
        logger.info("User Mobile_Number updated");

        return "User Mobile_Number updated";

    }
    public String createdDate(String created_date, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (bankUser.getCreated_date() == null || bankUser.getCreated_date() != null) {
            bankUser.setCreated_date(created_date);
        }
        repository.save(bankUser);
        logger.info("created date added");

        return "created date added";

    }

    public String updatedDate(String updated_date, long id) {
        BankUser bankUser = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        if (bankUser.getUpdated_date() == null || bankUser.getUpdated_date() != null) {
            bankUser.setUpdated_date(updated_date);
        }
        repository.save(bankUser);
        logger.info("Updated date updated");

        return "Updated date updated";

    }
}
