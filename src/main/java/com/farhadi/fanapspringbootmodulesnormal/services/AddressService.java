package com.farhadi.fanapspringbootmodulesnormal.services;

import com.farhadi.fanapspringbootmodulesnormal.dto.AddressDTO;
import com.farhadi.fanapspringbootmodulesnormal.entities.AddressEntity;
import com.farhadi.fanapspringbootmodulesnormal.mappers.AddressMapper;
import com.farhadi.fanapspringbootmodulesnormal.repositories.AddressRepository;
import com.farhadi.fanapspringbootmodulesnormal.repositories.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
//@Transactional()
public class AddressService {

    private final AddressRepository addressRepository;
    private final UserRepository userRepository;

    private final TransactionTemplate transactionTemplate;

    private final SessionFactory sessionFactory;

    public AddressService(AddressRepository addressRepository, UserRepository userRepository, TransactionTemplate transactionTemplate, SessionFactory sessionFactory) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
        this.transactionTemplate = transactionTemplate;
        this.sessionFactory = sessionFactory;
    }

    public void create(AddressDTO addressDTO) {
        AddressEntity entity = AddressMapper.MAPPER.toEntity(addressDTO);
        addressRepository.save(entity);
    }


    public void delete(Long id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        AddressEntity addressEntity = session.get(AddressEntity.class, id);
        session.delete(addressEntity);
        NativeQuery query = session.createSQLQuery("delete from cool_schema.user u where (select count(a.id) from cool_schema.address a where a.user_id = :user_id) = 0 and u.id = :user_id");
        query.setParameter("user_id", addressEntity.getUser().getId());
        query.executeUpdate();
        List ret = query.list();
        session.getTransaction().commit();
    }

//    @Transactional
//    public void delete(Long id){
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus status) {
//                try {
//                    addressRepository.deleteById(id);
//                    userRepository.deleteByCustomID(id);
//                } catch (Exception e) {
//                    transactionTemplate.getTransactionManager().commit(status);
//                    e.printStackTrace();
////                    status.setRollbackOnly();
////                    throw e;
//                }
//            }
//        });
//
//    }

//    @Transactional(noRollbackFor = {Exception.class}, readOnly = false)
//    public void delete(Long id) {
//        addressRepository.deleteById(id);
//        try {
////            UserEntity user = new UserEntity();
////            user.setIsbn("3333");
////            user.setName("Testttt");
////            userRepository.save(user);
//            userRepository.deleteByCustomID(id);
//        } catch (JpaSystemException e) {
//            e.printStackTrace();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public List<AddressDTO> findAll() {
        List<AddressEntity> listAddress = (List<AddressEntity>) addressRepository.findAll();
        return AddressMapper.MAPPER.toDTOs(listAddress);
    }

    public void remainAddress(AddressEntity addressEntity) {
        List<AddressEntity> addressRemaining = addressRepository.findByUserId(addressEntity.getUser().getId());
        if (addressRemaining == null || addressRemaining.size() == 0) {
//            userRepository.deleteById(addressEntity.getUser().getId());
        }
    }
}
