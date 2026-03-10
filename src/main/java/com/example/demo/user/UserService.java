package com.example.demo.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void join(UserRequest.Join reqDTO) {
        User user = User.builder()
                .username(reqDTO.getUsername())
                .password(reqDTO.getPassword())
                .email(reqDTO.getEmail())
                .zipcode(reqDTO.getZipcode())
                .address(reqDTO.getAddress())
                .addressDetail(reqDTO.getAddressDetail())
                .build();
        userRepository.save(user);
    }

}
