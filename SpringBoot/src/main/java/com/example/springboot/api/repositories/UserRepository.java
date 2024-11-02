package com.example.springboot.api.repositories;

import com.example.springboot.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 特定のクエリメソッドが必要な場合はここに追加
}
