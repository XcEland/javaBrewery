package com.demo.DTO.service;


import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DTO.dto.UserLocationDTO;
import com.demo.DTO.model.User;
import com.demo.DTO.repository.UserRepository;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
               .stream()
               .map(this::convertEntityDto)
               .collect(Collectors.toList());
    }

    // private UserLocationDTO convertEntityDto(User user){
    //     UserLocationDTO userLocationDTO = new UserLocationDTO();
    //     userLocationDTO.setId(user.getId());
    //     userLocationDTO.setEmail(user.getEmail());
    //     userLocationDTO.setPlace(user.getLocation().getPlace());
    //     userLocationDTO.setLongitude(user.getLocation().getLongitude());
    //     userLocationDTO.setLatitude(user.getLocation().getLatitude());
    //     return userLocationDTO;
    // }

    private UserLocationDTO convertEntityDto(User user){
        modelMapper.getConfiguration()
                   .setMatchingStrategy(MatchingStrategies.LOOSE);
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO = modelMapper.map(user, UserLocationDTO.class);
        return userLocationDTO;
    }
}
