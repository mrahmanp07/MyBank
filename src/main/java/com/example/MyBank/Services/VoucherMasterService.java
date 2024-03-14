package com.example.MyBank.Services;

import com.example.MyBank.Entity.VoucherDetails;
import com.example.MyBank.Entity.VoucherMaster;
import com.example.MyBank.Repository.VoucherDetailsRepo;
import com.example.MyBank.Repository.VoucherMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoucherMasterService {




        @Autowired
        private VoucherMasterRepo voucherMasterRepo;



        public VoucherMaster add(VoucherMaster voucherMaster) {
            return voucherMasterRepo.save(voucherMaster);
        }


        public List<VoucherMaster> getAll(){
            List<VoucherMaster> voucherMaster = voucherMasterRepo.findAll();
            return voucherMaster;
        }


        public VoucherMaster getById(Long id){
            return voucherMasterRepo.findById(id).get();

        }

        public VoucherMaster update(Long id, VoucherMaster voucherMaster){
            voucherMaster.setId(id);
            return voucherMasterRepo.save(voucherMaster);

        }

        public void delete(Long id){
            voucherMasterRepo.deleteById(id);
        }

}
