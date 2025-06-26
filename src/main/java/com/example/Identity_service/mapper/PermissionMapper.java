package com.example.Identity_service.mapper;

import com.example.Identity_service.dto.request.PermissionRequest;
import com.example.Identity_service.dto.request.UserCreationRequest;
import com.example.Identity_service.dto.request.UserUpdateRequest;
import com.example.Identity_service.dto.response.PermissionResponse;
import com.example.Identity_service.dto.response.UserResponse;
import com.example.Identity_service.entity.Permission;
import com.example.Identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse  toPermissionResponse(Permission permission);
}
