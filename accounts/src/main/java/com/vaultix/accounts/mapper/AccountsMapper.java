package com.vaultix.accounts.mapper;

import com.vaultix.accounts.dto.AccountsDto;
import com.vaultix.accounts.entity.Accounts;

//@Mapper(componentModel = "spring")
//public interface AccountMapper {
//    AccountsDto accountToDto(Accounts accounts);
//    Accounts dtoToAccounts(AccountsDto accountsDto);
//}
public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }

}