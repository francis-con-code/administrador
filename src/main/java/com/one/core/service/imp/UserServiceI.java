package com.one.core.service.imp;

import com.one.core.model.UserRol;
import com.one.core.model.Userf;
import com.one.core.model.dto.UserAdminDTO;
import com.one.core.repository.UserRepository;
import com.one.core.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Slf4j
@Service
public class UserServiceI implements UserService {

    private final UserRepository userRepository;

    public UserServiceI(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createAdmin(UserAdminDTO userAdminDTO) {
        Userf newAdmin = new Userf();
        newAdmin.setEmail(userAdminDTO.getEmail());
        newAdmin.setName(userAdminDTO.getName());
        newAdmin.setPassword(userAdminDTO.getPassword());
        newAdmin.setRol(UserRol.ADMIN);
        userRepository.save(newAdmin);

        log.info("Se creo un nuevo Admin");
    }

    @Override
    public void createUser() {

    }

    @Override
    public void deletedAdmin(Long id) {

    }

    @Override
    public void deletedUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void updateAdmin(UserAdminDTO userAdminDTO) {

    }

    @Override
    public boolean loginUser(UserAdminDTO userAdminDTO) {
        boolean isOk = true;
        Optional<Userf> userfOptional;
        userfOptional = userRepository.findByEmailAndName(userAdminDTO.getEmail(), userAdminDTO.getName());
        if(userfOptional.isEmpty()){
            isOk = false;
        }
        if(!userfOptional.get().getPassword().equals(userAdminDTO.getPassword())){
            isOk = false;
        }

        return isOk;
    }
}
