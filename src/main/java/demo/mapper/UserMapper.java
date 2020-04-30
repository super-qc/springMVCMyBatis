package demo.mapper;

import demo.model.User;

public interface UserMapper {
    User GetUserByID(Integer id) throws Exception;
}

