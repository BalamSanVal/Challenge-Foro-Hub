/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.forumapi_svb.repository;
import com.mycompany.forumapi_svb.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author balas
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    
}
