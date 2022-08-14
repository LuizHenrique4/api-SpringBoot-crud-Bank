package com.valemobi.bank.Repository

import com.valemobi.bank.Model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {


}