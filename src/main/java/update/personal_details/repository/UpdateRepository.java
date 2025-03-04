package update.personal_details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import update.personal_details.model.BankUser;

public interface UpdateRepository extends JpaRepository<BankUser,Long> {
}
