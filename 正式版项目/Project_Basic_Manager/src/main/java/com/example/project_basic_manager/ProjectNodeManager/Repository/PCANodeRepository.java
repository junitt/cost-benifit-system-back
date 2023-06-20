package com.example.project_basic_manager.ProjectNodeManager.Repository;

import com.example.project_basic_manager.ProjectNodeManager.Entity.PCANode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PCANodeRepository extends PagingAndSortingRepository<PCANode, Long>, JpaRepository<PCANode, Long> {
    PCANode findById(long id);
}
