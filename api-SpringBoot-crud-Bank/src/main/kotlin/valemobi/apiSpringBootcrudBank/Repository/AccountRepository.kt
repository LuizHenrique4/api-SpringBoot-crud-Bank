package valemobi.apiSpringBootcrudBank.Repository

import valemobi.apiSpringBootcrudBank.Model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {


}