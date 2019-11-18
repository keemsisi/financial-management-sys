package com.neuralproject.financialmanagementsys.code.dao;


import com.neuralproject.financialmanagementsys.code.models.documents.user.IncomeModel;
import com.neuralproject.financialmanagementsys.code.repositories.user.IncomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Component
public class IncomeDAO {

    @Autowired
    IncomeRepo incomeRepo;


    @Transactional
    public Integer getTotalIncome(String username){
//        return incomeRepo.findByUsername(username);
        return null;
    }


    @Transactional
    public List<IncomeModel> getAllIncomes(String username){
        return incomeRepo.findAll();
    }

    @Transactional
    public boolean deleteAllIncomes(String username){
        incomeRepo.findAll().stream().parallel().forEach(incomeModel -> incomeRepo.deleteById(
                incomeModel.getUuid()
        ));

        return true ;
    }
}
