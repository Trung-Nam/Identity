package com.example.Identity_service.mapper;

import com.example.Identity_service.dto.request.UserCreationRequest;
import com.example.Identity_service.dto.request.UserUpdateRequest;
import com.example.Identity_service.dto.response.UserResponse;
import com.example.Identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
//    @Mapping(source = "firstName",target = "lastName") // used it to map different field names
//    @Mapping(target = "lastName", ignore = true) // used it to ignore a field
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

}
