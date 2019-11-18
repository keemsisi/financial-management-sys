package com.neuralproject.financialmanagementsys.code.dao;


import com.neuralproject.financialmanagementsys.code.models.documents.user.UserAccountModel;
import com.neuralproject.financialmanagementsys.code.repositories.user.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class UserAccountDAO {


    @Autowired
    UserAccountRepository userAccountRepository;
    @Autowired
    IncomeDAO incomeDAO;


    @Transactional
    public Boolean createNewUserAccount(UserAccountModel userAccountModel) {
      userAccountRepository.insert(userAccountModel);
      return true ;
    }

//    @Transactional
//    public Boolean getTotalIncome(String username) {
//      incomeDAO.MouserAccountRepository.findOneByUsername(username).getIncomeUUID();
//    }




    @Transactional
    public Boolean validateUserAccountLoginCredentials(String username , String password) {
        //get the username and password from the keystore and then validate
       Optional<UserAccountModel> optionalUserModel = Optional.of(userAccountRepository.findOneByUsername(username));
       if (optionalUserModel.get().getUsername().equals(username)){
//           if (BCrypt.checkpw(optionalUserModel.get().getPassword(),password)) {
//               return true ; //login is granted  successfully
//           }
       }
       return false; //username does not exist
    }


    @Transactional
    public ResponseEntity<String> deleteUserAccount(String username) throws Exception {
        //get the username and password from the keystore and then validate
        Optional<Boolean> optionalUserModel = Optional.of(userAccountRepository.deleteByUsername(username));
        if (optionalUserModel.get().equals(true)){
            return ResponseEntity
                    .status(200)
                    .body("Account with username "+ username + "was successfully deleted");
        }else
            return ResponseEntity
                    .status(404)
                    .body("Account with username " + username + "does not exists");
    }


    @Transactional
    public ResponseEntity<List<UserAccountModel>> findAllUserAccount(Integer offset , Integer limit)  {
        //get the username and password from the keystore and then validate
        List<UserAccountModel> userAccountModels = userAccountRepository.findAll().stream()
                .parallel()
                .skip(offset)
                .limit(limit)
                .collect(Collectors.toList());
        Optional<List<UserAccountModel>> optionalUserModel = Optional.of(userAccountRepository.findAll());

        if (optionalUserModel.get().get(0) != null) {
            return ResponseEntity.ok().body(userAccountModels);
        }else
            return ResponseEntity.ok().body(null);
    }

    @Transactional
    public ResponseEntity<List<UserAccountModel>> getUsers(Integer offset , Integer limit) throws Exception {
            //get the username and password from the keystore and then validate
            List<UserAccountModel> userAccountModels = userAccountRepository.findAll().stream()
                    .skip(offset)
                    .limit(limit)
                    .collect(Collectors.toList());
            Optional<List<UserAccountModel>> optionalUserModel = Optional.of(userAccountRepository.findAll());
            if (optionalUserModel.get().get(0) != null) {
                return ResponseEntity.ok().body(userAccountModels);
            }else
                return ResponseEntity.ok().body(null); // all the user have been completely sent
      }

    @Transactional
    public ResponseEntity<UserAccountModel> getUserByUsername(String username) throws Exception {
        //get the username and password from the keystore and then validate
        return ResponseEntity.ok().body(userAccountRepository.findOneByUsername(username));
    }



    @Transactional
    public ResponseEntity<Boolean> deleteUserByUsername(String username) throws Exception {
        //get the username and password from the keystore and then validate
        return ResponseEntity.ok().body(userAccountRepository.deleteByUsername(username));
    }



    @Transactional
    public ResponseEntity<Boolean> deleteUserById(UUID uuid) throws Exception {
        //get the username and password from the keystore and then validate
        userAccountRepository.deleteById(uuid);
        return ResponseEntity.accepted().body(true);
    }


    @Transactional
    public ResponseEntity<UserAccountModel> updateUsername(String oldUsername) throws Exception {
        //get the username and password from the keystore and then validate
        return ResponseEntity.ok().body(userAccountRepository.findOneByUsername(oldUsername));
    }

    @Transactional
    public ResponseEntity<UserAccountModel> updatePassword(String username , String oldPassword , String newPassword) throws Exception {
        //update the user password
        //verify with BCrypt first to check the validity of the password
//        BCrypt.checkpw(userAccountRepository.findByFirstname(username).get(0).getPassword() , newPassword);
        return ResponseEntity.ok().body(userAccountRepository.findOneByUsername(username));
    }















    /***********
     * Development Only this is to drop all the User Accoun in the system
     */
//    @Async("deleteAllUsersAsync")
    @Transactional
    @Scope(value = "development")
    public ResponseEntity<Boolean> deleteAllUserAccount(Integer offset , Integer limit) throws Exception {
        //get the username and password from the keystore and then validate
        userAccountRepository.deleteAll();
        //return this when the operation is done
        return  ResponseEntity.ok().body(true); // operation completely done
    }


}
